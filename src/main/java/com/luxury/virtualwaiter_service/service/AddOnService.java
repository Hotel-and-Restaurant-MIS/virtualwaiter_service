package com.luxury.virtualwaiter_service.service;

import com.luxury.virtualwaiter_service.dto.AddOnDTO;
import com.luxury.virtualwaiter_service.model.AddOn;
import com.luxury.virtualwaiter_service.repository.AddOnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddOnService {

    private final AddOnRepository addOnRepository;

    @Autowired
    public AddOnService(AddOnRepository addOnRepository) {
        this.addOnRepository = addOnRepository;
    }

    public List<AddOnDTO> getAllAddOnsByMenuItemId(Long menuItemId) {
        List<AddOn> addOns = addOnRepository.findAllByMenuItem_MenuItemId(menuItemId);
        return addOns.stream()
                .map(addOn -> new AddOnDTO(
                        addOn.getAddOnId(),
                        addOn.getAddOnName(),
                        addOn.getAddOnPrice()
                ))
                .collect(Collectors.toList());
    }
}