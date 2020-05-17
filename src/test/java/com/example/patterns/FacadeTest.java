package com.example.patterns;

import com.example.patterns.structuralPatterns.Facade.ConnectionPoolFacade;
import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    public void connection() {
        ConnectionPoolFacade connectionPoolFacade = new ConnectionPoolFacade();

        System.out.println(connectionPoolFacade.getMongoDBConnection());

        System.out.println(connectionPoolFacade.getMySqlConnection());
    }

}
