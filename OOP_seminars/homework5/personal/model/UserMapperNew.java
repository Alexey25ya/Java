package personal.model;


public class UserMapperNew {
    public String map(User user) {
        return String.format("Идентификатор:%s;Имя:%s;Фамилия:%s;Телефон:%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(";");
        for(int i = 0; i<lines.length; i++){
            String[] temp = lines[i].split(":");
            lines[i] = temp[1];
        }
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }

    // /**
    //  * @param repozitoryFileNew TODO
    //  * @return
    //  */
    // public List<User> getAllUsers(RepozitoryFileNew repozitoryFileNew) {
    //     List<String> lines = repozitoryFileNew.fileOperation.readAllLines();
    //     List<User> users = new ArrayList<>();
    //     for (String line : lines) {
    //         users.add(map(line));
    //     }
    //     return users;
    // }
}
