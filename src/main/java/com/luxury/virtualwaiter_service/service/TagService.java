package com.luxury.virtualwaiter_service.service;

import com.luxury.virtualwaiter_service.dto.TagDTO;
import com.luxury.virtualwaiter_service.model.Tag;
import com.luxury.virtualwaiter_service.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TagService {

    private final TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public List<TagDTO> getAllTagsByMenuItemId(Long menuItemId) {
        List<Tag> tags = tagRepository.findByMenuItemId(menuItemId);
        return tags.stream()
                .map(tag -> new TagDTO(
                        tag.getTagId(),
                        tag.getTagName()
                ))
                .collect(Collectors.toList());

    }
}

