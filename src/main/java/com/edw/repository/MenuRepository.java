package com.edw.repository;

import com.edw.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 *     com.edw.repository.MenuRepository
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Sep 2022 21:35
 */
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
