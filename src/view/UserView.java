package view;

import data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnconsole(List<T> list);
}

// Данный интерфейс имеет только 1 метод, он подностью подходит под принцип
// ISP, здесь не требуется разделять на специализированные интерфейсы
