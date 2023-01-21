package com.sgt.mediumoverflow.web;

import com.sgt.mediumoverflow.service.BlogProfileService;
import com.sgt.mediumoverflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private BlogProfileService blogProfileService;
    @Autowired
    private UserService userService;
    @GetMapping("/profile")
    public Map<String, Object> fetchProfile(){
        return blogProfileService.fetchProfile();
    }
    @GetMapping("/fetchProfile/{userid}")
    public List<Map<String, Object>> fetchProfile(@PathVariable String userid){
        return userService.fetchProfile(userid);
    }
}
