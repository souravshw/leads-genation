package io.lead.publisher.thymeleaf;


public class APIDetails {
    private final String URL = "https://leads-inst303-client.phonexa.com/store/setdata";
    private final String apiId = "0C76FAB5F0714A439F8E48BEE6666A35";
    private final String apiPassword = "e65185a6217e9bac5bc2f49";

    private String productId ;
    private String price;
    private String phoneNumber;
    private String email;
    private String state;
    private String lastName;
    private String address;
    private String jornayaLeadId;
    private String zip;
    private String firstName;

    private String clickId;
    private String tPar;

    private String source;

    public String getURL() {
        return URL;
    }

    public String getApiId() {
        return apiId;
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJornayaLeadId() {
        return jornayaLeadId;
    }

    public void setJornayaLeadId(String jornayaLeadId) {
        this.jornayaLeadId = jornayaLeadId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getClickId() {
        return clickId;
    }

    public void setClickId(String clickId) {
        this.clickId = clickId;
    }

    public String gettPar() {
        return tPar;
    }

    public void settPar(String tPar) {
        this.tPar = tPar;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
