package com.example.patterns.structuralPatterns.Facade.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MongoDB implements Connection {
    private String username;
    private String password;
    private String url;
    private String driver;

    @Override
    public String prepareConnection() {
        return "MySql{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", url='" + url + '\'' +
               ", driver='" + driver + '\'' + '}';
    }

}
