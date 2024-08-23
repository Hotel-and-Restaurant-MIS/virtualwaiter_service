package com.luxury.virtualwaiter_service.dto;

public record MenuItemDTO(
        Long menuItemId,
        String menuItemName,
        String description,
        String imageUrl,
        Double menuItemPrice
) {}
