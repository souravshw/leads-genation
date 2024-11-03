package io.lead.publisher.thymeleaf.service;

public class APIService {

    private APIService apiService;

    private APIService() {

    }

    public APIService getInstance() {
        if (apiService == null) {
            this.apiService = new APIService();
            return apiService;
        } else {
            return apiService;
        }
    }


}
