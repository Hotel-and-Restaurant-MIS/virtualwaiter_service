package com.luxury.virtualwaiter_service.repository;

import com.luxury.virtualwaiter_service.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findAllByCategory_CategoryId(Long categoryId);
}
