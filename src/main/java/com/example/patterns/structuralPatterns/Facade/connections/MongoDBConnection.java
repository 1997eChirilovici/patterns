package com.example.patterns.structuralPatterns.Facade.connections;

import com.example.patterns.structuralPatterns.Facade.models.Connection;
import com.example.patterns.structuralPatterns.Facade.models.MongoDB;

public class MongoDBConnection implements ConnectionDB {

    @Override
    public Connection getConnectionContent() {
        return MongoDB.builder()
                      .url("jdbc:mysql://localhost:3306/")
                      .driver("com.mysql.jdbc.Driver")
                      .username("root")
                      .password("******")
                      .build();
    }

}
