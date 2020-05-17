package com.example.patterns.structuralPatterns.Facade.connections;

import com.example.patterns.structuralPatterns.Facade.models.Connection;
import com.example.patterns.structuralPatterns.Facade.models.MySql;

public class MySqlConnection implements ConnectionDB {

    @Override
    public Connection getConnectionContent() {
        return MySql.builder()
                    .url("mongodb://host1:27017")
                    .driver("com.mongodb.jdbc.Driver")
                    .username("root")
                    .password("******")
                    .build();
    }

}
