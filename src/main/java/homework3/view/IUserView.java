package homework3.view;

import homework3.data.User;

import java.util.List;

public interface IUserView<T extends User> {
    void sendOnConsole(List<T> list);
}
