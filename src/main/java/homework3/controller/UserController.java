package homework3.controller;

import homework3.data.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName);
}
