package homework3and4.view;

import homework3and4.data.User;

import java.util.List;

public class UserView<T extends User> implements IUserView<T> {


    @Override
    public void sendOnConsole(List<T> list) {
        for (T user: list) {
            System.out.println(user);
        }
    }
}
