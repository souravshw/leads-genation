package io.lead.publisher.thymeleaf.repository;

import java.util.List;

import javax.transaction.Transactional;

import io.lead.publisher.thymeleaf.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface LeadRepository extends JpaRepository<Lead, Integer> {
  List<Lead> findByTitleContainingIgnoreCase(String keyword);

  @Query("UPDATE Lead t SET t.published = :published WHERE t.id = :id")
  @Modifying
  public void updatePublishedStatus(Integer id, boolean published);
}
