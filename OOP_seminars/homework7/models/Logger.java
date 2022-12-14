package models;

import java.io.FileWriter;
import java.io.IOException;

public class Logger implements Loggable {

    String filePath;

    public Logger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.append(message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
