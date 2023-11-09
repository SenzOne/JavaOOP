package homework3.view;

import homework3.data.User;

import java.util.List;

public class UserView<T extends User> implements IUserView<User> {


    @Override
    public void sendOnConsole(List<User> list) {
        for (User user: list) {
            System.out.println(user);
        }
    }
}
