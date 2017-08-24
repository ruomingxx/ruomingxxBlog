package com.ruomingxx.blog.repositories;

import com.ruomingxx.blog.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jicheng on 8/24/2017.
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
