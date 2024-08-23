package com.luxury.virtualwaiter_service.repository;

import com.luxury.virtualwaiter_service.model.AddOn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddOnRepository extends JpaRepository<AddOn, Long> {
    List<AddOn> findAllByMenuItem_MenuItemId(Long menuItemId);
}
