package com.luxury.virtualwaiter_service.service;

import com.luxury.virtualwaiter_service.dto.MenuItemDTO;
import com.luxury.virtualwaiter_service.model.MenuItem;
import com.luxury.virtualwaiter_service.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    @Autowired
    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public List<MenuItemDTO> getAllMenuItemsByCategory(Long categoryId) {
        List<MenuItem> menuItems = menuItemRepository.findAllByCategory_CategoryId(categoryId);
        return menuItems.stream()
                .map(item -> new MenuItemDTO(
                        item.getMenuItemId(),
                        item.getMenuItemName(),
                        item.getDescription(),
                        item.getImageUrl(),
                        item.getMenuItemPrice()
                ))
                .collect(Collectors.toList());
    }
}

