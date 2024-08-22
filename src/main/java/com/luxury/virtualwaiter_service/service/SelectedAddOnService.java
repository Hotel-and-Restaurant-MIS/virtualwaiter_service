package com.luxury.virtualwaiter_service.service;

import com.luxury.virtualwaiter_service.repository.SelectedAddOnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectedAddOnService {

    private final SelectedAddOnRepository selectedAddOnRepository;

    @Autowired
    public SelectedAddOnService(SelectedAddOnRepository selectedAddOnRepository) {
        this.selectedAddOnRepository = selectedAddOnRepository;
    }
}
