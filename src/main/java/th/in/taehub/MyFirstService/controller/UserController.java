package th.in.taehub.MyFirstService.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    private ArrayList<User> users;

    public UserController() {
        this.users = new ArrayList<User>();
        this.users.add(new User(1, "Keerati"));
        this.users.add(new User(2, "Putchamon"));
        this.users.add(new User(3, "Nathawat"));
        this.users.add(new User(4, "Kunchai"));
        this.users.add(new User(5, "Kanisorn"));
    }

    @RequestMapping(
        value = "/user/{id:[\\d]}",
        method = RequestMethod.GET
    )
    public User getUser(@PathVariable("id") int id) {
        return this.users.get(id);
    }

    @GetMapping("/users")
    public ArrayList<User> getUsers() {
        return this.users;
    }
}