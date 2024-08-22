package com.luxury.virtualwaiter_service.controller;

import com.luxury.virtualwaiter_service.service.SelectedAddOnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/selectedAddOn")
public class SelectedAddOncontroller {

    private final SelectedAddOnService selectedAddOnService;

    @Autowired
    public SelectedAddOncontroller(SelectedAddOnService selectedAddOnService) {
        this.selectedAddOnService = selectedAddOnService;
    }
}
