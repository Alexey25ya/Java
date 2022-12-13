package Homework6.models;

public class NoteMapper {
    public String map(Note note){
        return String.format("%d,%s,%s,%s", note.getId(), note.getData().toString(), note.getTitle(),note.getText());
    }

    public Note map(String line) {
        String[] lines = line.split(",");
        return new Note((Integer.parseInt(lines[0])), lines[1], lines[2], lines[3]);
    }

}
