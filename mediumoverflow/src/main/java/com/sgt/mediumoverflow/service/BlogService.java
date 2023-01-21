package com.sgt.mediumoverflow.service;

import com.sgt.mediumoverflow.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;
    public List<Map<String, Object>> getBlogs() {
        return blogRepository.getBlogs();

    }

    public Map<String, Object> getBlog(String Slug) {
        return blogRepository.getBlog(Slug);
    }

    public List<Map<String, Object>> getCategories() {
        return blogRepository.getCategories();
    }

    public void insertBlog(Map<String,Object> BlogData){
        Integer AuthorID = (Integer) BlogData.get("AuthorID");
        String Title = (String) BlogData.get("Title");
        Integer CategoryID = (Integer) BlogData.get("CategoryID");
        String ShortDescription = (String) BlogData.get("ShortDescription");
        String Description = (String) BlogData.get("Description");
        String Slug = (String) BlogData.get("Description");
        Integer ScheduledYN = (Integer) BlogData.get("ScheduledYN");
        String Tags = (String) BlogData.get("Tags");
        blogRepository.insertBlog(AuthorID,Title,CategoryID,ShortDescription,Description,Slug
        ,ScheduledYN,Tags);
    }
    public Map<String, Object> checkSlug(String Slug) {
        return blogRepository.checkSlug(Slug);
    }
    public List<Map<String,Object>> matchtags(String tag){
        return blogRepository.matchtags(tag);
    }

}
