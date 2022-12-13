package Homework6.models;

import java.util.List;

public interface FileOperation {
    public List<String> readAllLines();

    public void saveAllLines(List<String> lines);
}
