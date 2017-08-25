package com.ruomingxx.blog.repositories;

import com.ruomingxx.blog.models.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface SettingRepository extends JpaRepository<Setting, Long> {
    Setting findByKey(String key);
}
