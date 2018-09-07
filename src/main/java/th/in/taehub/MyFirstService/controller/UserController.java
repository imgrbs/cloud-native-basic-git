package th.in.taehub.MyFirstService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    private ArrayList<User> users;

    public UserController() {
        this.users = new ArrayList<User>();
        for(int i = 0; i < 5; i++) {
            int id = i + 1;
            this.users.add(new User(id, "Keerati_" + id));
        }
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return this.users.get(id);
    }



    @GetMapping("/users")
    public ArrayList<User> getUsers() {
        return this.users;
    }
}