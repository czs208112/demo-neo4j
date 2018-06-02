package com.example.demoneo4j;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@Data
@EqualsAndHashCode
@NodeEntity(label = "User")
public class User {
    @Id
    private String id;

    private String name;

    @Relationship(type = "Like")
    private List<User> rel;

    @Override
    public String toString() {
        return id + "#" + name;
    }
}
