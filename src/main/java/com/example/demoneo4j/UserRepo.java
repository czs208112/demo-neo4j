package com.example.demoneo4j;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface UserRepo extends Neo4jRepository<User, String> {

    @Query("MATCH p=(m)-->(n) RETURN p")
    List<User> getUser();
}
