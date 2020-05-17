package com.example.patterns.behavioralPatterns.Template;

public class Twitter extends Network {

    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n\nLogIn success on Twitter");
        return true;
    }

    public void sendData(byte[] data) {
        System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
    }

    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Twitter");
    }
}
