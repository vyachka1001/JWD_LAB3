package by.bsuir.webtech.third.task.client;

import by.bsuir.webtech.third.task.client.controller.ClientController;

public class Client {
    public static void main(String[] args) {
        var client = new ClientController();
        client.start();
    }
}
