package com.sgt.mediumoverflow.web;


import com.sgt.mediumoverflow.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BlogResource {

    @Autowired
    private BlogService blogService;
    @GetMapping("/blog")
    public List<Map<String, Object>> getBlogs() {

        return blogService.getBlogs();

    }
    @GetMapping("/Categories")
    public List<Map<String, Object>> getCategories() {
        return blogService.getCategories();
    }

    @GetMapping("/blog/{Slug}")
    public Map<String, Object> getBlog(@PathVariable String Slug) {
        return blogService.getBlog(Slug);
    }

    @PostMapping("/blog")
    public void insertBlog(@RequestBody Map<String,Object> BlogData){
        blogService.insertBlog(BlogData);
    }
    @GetMapping("/checkSlug/{Slug}")
    public Map<String, Object> checkSlug(@PathVariable  String Slug) {
        return blogService.checkSlug(Slug);
    }
    @GetMapping("/matchtags/{tag}")
    public List<Map<String, Object>> matchtags(@PathVariable  String tag) {
        return blogService.matchtags(tag);
    }






}
