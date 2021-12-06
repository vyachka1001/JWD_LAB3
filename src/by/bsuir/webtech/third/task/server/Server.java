package by.bsuir.webtech.third.task.server;

import by.bsuir.webtech.third.task.server.controller.ServerController;

public class Server {
    public static void main(String[] args) {
        var server = new ServerController();
        server.start();
    }
}
