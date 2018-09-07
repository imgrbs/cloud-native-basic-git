package th.in.taehub.MyFirstService.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class UserControllerTest {

    UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void getUsersShouldReturnFivePerson() {
        Assert.assertEquals(5, userController.getUsers().size());
    }

    @Test
    public void getUsersShouldReturnIdAndNameCorrectlyInAllArrayData() {
        ArrayList<User> controllerUsers = userController.getUsers();
        Assert.assertEquals(1, controllerUsers.get(0).getId());
        Assert.assertEquals("Keerati_1", controllerUsers.get(0).getName());
        Assert.assertEquals(2, controllerUsers.get(1).getId());
        Assert.assertEquals("Keerati_2", controllerUsers.get(1).getName());
        Assert.assertEquals(3, controllerUsers.get(2).getId());
        Assert.assertEquals("Keerati_3", controllerUsers.get(2).getName());
        Assert.assertEquals(4, controllerUsers.get(3).getId());
        Assert.assertEquals("Keerati_4", controllerUsers.get(3).getName());
        Assert.assertEquals(5, controllerUsers.get(4).getId());
        Assert.assertEquals("Keerati_5", controllerUsers.get(4).getName());
    }

    @Test
    public void getUserShouldReturnIdAndNameCorrectly() {
        User user = userController.getUser(0);
        Assert.assertEquals(1, user.getId());
        Assert.assertEquals("Keerati_1", user.getName());
    }
}
