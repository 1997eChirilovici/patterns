package com.example.patterns.behavioralPatterns.Template;

public abstract class Network {
    String userName;
    String password;

    public void executeOperations(String message) {
        if (logIn(this.userName, this.password)) {
            sendData(message.getBytes());
            logOut();
        }
    }

    abstract boolean logIn(String userName, String password);
    abstract void sendData(byte[] data);
    abstract void logOut();
}
