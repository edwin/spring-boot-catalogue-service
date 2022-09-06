package com.edw.controller;

import com.edw.entity.Menu;
import com.edw.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     com.edw.controller.MenuController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Sep 2022 21:32
 */
@RestController
@RequestMapping("/api/v1")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/menu")
    public ResponseEntity getMenus(@RequestParam Integer page) {
        if(page==null || page <0)
            return ResponseEntity.status(400).body(new ArrayList<Menu>());
        return ResponseEntity.ok(menuRepository.findAll(
                PageRequest.of(page, 5, Sort.by("id")
                        .descending()))
                .getContent());
    }
}
