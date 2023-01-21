package com.sgt.mediumoverflow.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BlogRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getBlogs() {
        return this.jdbcTemplate.queryForList("EXEC blog.sp_fetchPosts");
    }
    public Map<String, Object> getBlog(String Slug) {
        return this.jdbcTemplate.queryForMap("EXEC blog.sp_getpost ?",Slug);
    }
    public List<Map<String, Object>> getCategories() {
        return this.jdbcTemplate.queryForList("EXEC blog.sp_fetchcategory");
    }
    public void insertBlog(Integer AuthorID,String Title,Integer CategoryID,String ShortDescription,String Description,String Slug,Integer ScheduledYN,String Tags){
        this.jdbcTemplate.update("EXEC blog.sp_addpost ?,?,?,?,?,?,?,?",AuthorID,Title,CategoryID,ShortDescription,Description,Slug,ScheduledYN,Tags);

    }
    public Map<String, Object> checkSlug(String Slug) {
        return this.jdbcTemplate.queryForMap("EXEC blog.sp_validateSlug ?", Slug);
    }
    public List<Map<String, Object>> matchtags(String tag) {
        return this.jdbcTemplate.queryForList("EXEC blog.sp_matchtags ?", tag);
    }


}
