package com.example.patterns;

import com.example.patterns.behavioralPatterns.Template.Facebook;
import com.example.patterns.behavioralPatterns.Template.Network;
import com.example.patterns.behavioralPatterns.Template.Twitter;
import org.junit.jupiter.api.Test;

public class TemplateTest {
    @Test
    public void postEmail() {
        System.out.print("Input user name: ");
        String userName = "wsmith";
        System.out.print("Input password: ");
        String password = "fakePass";

        System.out.print("Input message: ");
        String message = "Message";

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");

        int choice = 1;
//        int choice = 2;
        Network network = null;
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.executeOperations(message);
    }
}
