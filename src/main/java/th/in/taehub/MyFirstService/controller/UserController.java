package th.in.taehub.MyFirstService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @GetMapping("/users/1")
    public ArrayList getUser() {
        ArrayList<User> users = new ArrayList();
        for (int i = 0; i < 5; i++) {
            users.add(new User(1, "Keerati"));
        }
        return users;
    }

}