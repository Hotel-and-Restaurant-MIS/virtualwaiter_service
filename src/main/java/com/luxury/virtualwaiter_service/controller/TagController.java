package com.luxury.virtualwaiter_service.controller;

import com.luxury.virtualwaiter_service.dto.TagDTO;
import com.luxury.virtualwaiter_service.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    private final TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("/bymenuItemId")
    public List<TagDTO> getByMenuItemId(@RequestParam Long menuItemId) {
        return tagService.getAllTagsByMenuItemId(menuItemId);
    }

}

