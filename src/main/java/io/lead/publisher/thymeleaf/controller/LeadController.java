package io.lead.publisher.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import io.lead.publisher.thymeleaf.entity.Lead;
import io.lead.publisher.thymeleaf.repository.LeadRepository;

@Controller
public class LeadController {

  @Autowired
  private LeadRepository leadRepository;

  @GetMapping("/leads/vishu-test-lord")
  public String getAll(Model model, @Param("keyword") String keyword) {
    try {
      List<Lead> leads = new ArrayList<Lead>();

      if (keyword == null) {
        leadRepository.findAll().forEach(leads::add);
      } else {
        leadRepository.findByTitleContainingIgnoreCase(keyword).forEach(leads::add);
        model.addAttribute("keyword", keyword);
      }

      model.addAttribute("leads", leads);
    } catch (Exception e) {
      model.addAttribute("message", e.getMessage());
    }

    return "leads";
  }

  @GetMapping("/leads")
  public String addLead(Model model) {
    Lead lead = new Lead();
    lead.setPublished(true);

    model.addAttribute("lead", lead);
    model.addAttribute("pageTitle", "Create new Lead");

    return "lead_form";
  }

  @PostMapping("/leads/save")
  public String saveLead(Lead lead, RedirectAttributes redirectAttributes) {
    try {
      leadRepository.save(lead);

      redirectAttributes.addFlashAttribute("message", "The Lead has been saved successfully!");
    } catch (Exception e) {
      redirectAttributes.addAttribute("message", e.getMessage());
    }

    return "redirect:/leads";
  }

  @GetMapping("/leads/{id}")
  public String editLead(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
    try {
      Lead lead = leadRepository.findById(id).get();

      model.addAttribute("lead", lead);
      model.addAttribute("pageTitle", "Edit Lead (ID: " + id + ")");

      return "lead_form";
    } catch (Exception e) {
      redirectAttributes.addFlashAttribute("message", e.getMessage());

      return "redirect:/leads";
    }
  }

  @GetMapping("/leads/delete/{id}")
  public String deleteLead(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
    try {
      leadRepository.deleteById(id);

      redirectAttributes.addFlashAttribute("message", "The Lead with id=" + id + " has been deleted successfully!");
    } catch (Exception e) {
      redirectAttributes.addFlashAttribute("message", e.getMessage());
    }

    return "redirect:/leads";
  }

  @GetMapping("/leads/{id}/published/{status}")
  public String updateLeadPublishedStatus(@PathVariable("id") Integer id, @PathVariable("status") boolean published,
      Model model, RedirectAttributes redirectAttributes) {
    try {
      leadRepository.updatePublishedStatus(id, published);

      String status = published ? "published" : "disabled";
      String message = "The Lead id=" + id + " has been " + status;

      redirectAttributes.addFlashAttribute("message", message);
    } catch (Exception e) {
      redirectAttributes.addFlashAttribute("message", e.getMessage());
    }

    return "redirect:/leads";
  }
}
