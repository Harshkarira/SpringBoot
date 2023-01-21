package com.sgt.mediumoverflow.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Map<String, Object>> fetchProfile(String userid) {
        return this.jdbcTemplate.queryForList("EXEC dbo.sp_fetchProfile ?", userid);
    }

}
