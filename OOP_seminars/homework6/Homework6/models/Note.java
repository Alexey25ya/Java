package Homework6.models;

import java.util.Date;

public class Note {
    private Integer id;
    private String data;
    private String title;
    private String text;

    public Note(Integer id, String data, String title, String text) {
        this.id = id;
        this.data = data;
        this.title = title;
        this.text = text;
    }

    public Note(String title, String text) {
        this.data = new Date().toString();
        this.title = title;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nDate: %s\nTitle: %s\nText: %s\n", getId(), getData().toString(), getTitle(),
                getText());
    }

}
