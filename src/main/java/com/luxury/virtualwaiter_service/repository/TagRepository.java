package com.luxury.virtualwaiter_service.repository;

import com.luxury.virtualwaiter_service.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    @Query("SELECT t FROM Tag t JOIN t.menuItems m WHERE m.menuItemId = :menuItemId")
    List<Tag> findByMenuItemId(@Param("menuItemId") Long menuItemId);
}

