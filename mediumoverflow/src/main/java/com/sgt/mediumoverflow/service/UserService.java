package com.sgt.mediumoverflow.service;

import com.sgt.mediumoverflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Map;
import com.sgt.mediumoverflow.web.UserResource;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<Map<String, Object>> fetchProfile(@PathVariable  String userid) {
        return userRepository.fetchProfile(userid);
    }
}
