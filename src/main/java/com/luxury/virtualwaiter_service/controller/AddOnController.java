package com.luxury.virtualwaiter_service.controller;

import com.luxury.virtualwaiter_service.dto.AddOnDTO;
import com.luxury.virtualwaiter_service.model.AddOn;
import com.luxury.virtualwaiter_service.service.AddOnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addOn")
public class AddOnController {

    private final AddOnService addOnService;

    @Autowired
    public AddOnController(AddOnService addOnService) {
        this.addOnService = addOnService;
    }

    @GetMapping("/allByMenuItemId")
    public List<AddOnDTO> getAddOnsByMenuItemId(@RequestParam Long menuItemId) {
        return addOnService.getAllAddOnsByMenuItemId(menuItemId);
    }
}
