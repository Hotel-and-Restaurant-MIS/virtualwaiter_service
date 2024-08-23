package com.luxury.virtualwaiter_service.controller;

import com.luxury.virtualwaiter_service.dto.MenuItemDTO;
import com.luxury.virtualwaiter_service.model.MenuItem;
import com.luxury.virtualwaiter_service.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menuItem")
public class MenuItemController {

    private final MenuItemService menuItemService;

    @Autowired
    public MenuItemController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @GetMapping("/bycategoryId")
    public List<MenuItemDTO> getMenuItemByCategory(@RequestParam Long categoryId) {
        return menuItemService.getAllMenuItemsByCategory(categoryId);
    }
}

