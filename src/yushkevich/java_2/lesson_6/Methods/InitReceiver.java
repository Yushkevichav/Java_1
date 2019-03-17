package yushkevich.java_2.lesson_6.Methods;

import yushkevich.java_2.lesson_6.Variables;

import java.io.IOException;

public class InitReceiver {
    public static void initReceiver() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    String echoMessage = Variables.inputStream.readUTF();
                    Variables.outputTextArea.append(echoMessage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        System.out.println("receiver started");
    }
}
