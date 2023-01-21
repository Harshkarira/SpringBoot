package com.sgt.mediumoverflow.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BlogProfileService {
    public Map<String, Object> fetchProfile(){
        return Map.of("user1","1","user2","2");
    }

}
