package homework3and4.controller;

import homework3and4.data.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName);
}
