package homework5.service;

import homework5.model.Type;
import homework5.model.User;

import java.util.List;

/**
 * Interface Segregation (Принцип разделения интерфейсов)
 * Интерфейс DataServiceInterface содержит только те функции, которые реализуются в
 * классе DataService
 */

public interface DataServiceInterface extends ServiceInterface{
    void create(String name, String surname, Type type);

    List<User> getUserList();
}