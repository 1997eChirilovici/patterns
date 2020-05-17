package com.example.patterns.structuralPatterns.Facade;

import com.example.patterns.structuralPatterns.Facade.connections.MongoDBConnection;
import com.example.patterns.structuralPatterns.Facade.connections.MySqlConnection;

public class ConnectionPoolFacade {

    public String getMySqlConnection(){
        return new MySqlConnection().getConnectionContent()
                                    .prepareConnection();
    }

    public String getMongoDBConnection(){
        return new MongoDBConnection().getConnectionContent()
                                      .prepareConnection();
    }
}
