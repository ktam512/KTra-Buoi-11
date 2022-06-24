import java.util.ArrayList;
public class UserService {

    public ArrayList<User> getAllUser(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "awatitus@loptagt.com" , "lOVeYmal", "Tam1"));
        list.add(new User(2, "nshugin@packiu.com" , "RaSTAngl", "Tam2"));
        list.add(new User(3, "devore@pedangcompany.com" , "piAmarAD", "Tam3"));
        list.add(new User(4, "vik2645@alvinneo.com" , "antInste", "Tam4"));
        list.add(new User(5, "nanamanapanamana@soccerfit.com" , "atERinsW", "Tam5"));
        list.add(new User(6, "phantomrider86@playfuny.com" , "ronELDBA", "Tam6"));

        return list;
    }

    public void addNewUser(ArrayList<User> list,User user) {
        list.add(user);
    }


}
