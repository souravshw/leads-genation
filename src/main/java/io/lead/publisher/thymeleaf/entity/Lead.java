package io.lead.publisher.thymeleaf.entity;

import javax.persistence.*;

@Entity
@Table(name = "leads")
public class Lead {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(length = 256)
  private String productId ;

  @Column(length = 256)
  private String price;

  @Column(length = 256)
  private String phoneNumber;

  @Column(length = 256)
  private String email;

  @Column(length = 256)
  private String state;

  @Column(length = 256)
  private String lastName;

  @Column(length = 256)
  private String address;

  @Column(length = 256)
  private String jornayaLeadId;

  @Column(length = 256)
  private String zip;

  @Column(length = 256)
  private String firstName;

  @Column(length = 256)
  private String clickId;

  @Column(length = 256)
  private String tPar;


  public Lead() {

  }

  public Integer getId() {
    return id;
  }

  public String getProductId() {
    return productId;
  }

  public String getPrice() {
    return price;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public String getState() {
    return state;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getJornayaLeadId() {
    return jornayaLeadId;
  }

  public String getZip() {
    return zip;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getClickId() {
    return clickId;
  }

  public String gettPar() {
    return tPar;
  }
}
