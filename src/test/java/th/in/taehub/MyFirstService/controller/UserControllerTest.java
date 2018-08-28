package th.in.taehub.MyFirstService.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class UserControllerTest {

    UserController userController;
    ArrayList<User> users;
    ArrayList<User> user;

    @Before
    public void setUp() {
        userController = new UserController();
        users = new ArrayList<User>();

        for (int i = 0; i < 5; i++) {
            users.add(new User(1, "Keerati"));
        }

        user = new ArrayList<User>();
        user.add(new User(1, "Keerati"));
    }

    @Test
    public void getUsersShouldReturnFivePerson() {
        Assert.assertEquals(5, userController.getUsers().size());
    }

    @Test
    public void getUsersShouldReturnIdAndNameCorrectlyInAllArrayData() {
        ArrayList<User> controllerUsers = userController.getUsers();
        Assert.assertEquals(users.get(0).getId(), controllerUsers.get(0).getId());
        Assert.assertEquals(users.get(0).getName(), controllerUsers.get(0).getName());
        Assert.assertEquals(users.get(1).getId(), controllerUsers.get(1).getId());
        Assert.assertEquals(users.get(1).getName(), controllerUsers.get(1).getName());
        Assert.assertEquals(users.get(2).getId(), controllerUsers.get(2).getId());
        Assert.assertEquals(users.get(2).getName(), controllerUsers.get(2).getName());
        Assert.assertEquals(users.get(3).getId(), controllerUsers.get(3).getId());
        Assert.assertEquals(users.get(3).getName(), controllerUsers.get(3).getName());
        Assert.assertEquals(users.get(4).getId(), controllerUsers.get(4).getId());
        Assert.assertEquals(users.get(4).getName(), controllerUsers.get(4).getName());
    }


    @Test
    public void getUserShouldReturnOneUser() {
        Assert.assertEquals(1, userController.getUser().size());

    }


    @Test
    public void getUserShouldReturnIdAndNameCorrectly() {
        ArrayList<User> controllerUsers = userController.getUser();
        Assert.assertEquals(user.get(0).getId(), controllerUsers.get(0).getId());
        Assert.assertEquals(user.get(0).getName(), controllerUsers.get(0).getName());
    }
}
