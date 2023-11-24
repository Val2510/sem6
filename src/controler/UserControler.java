package controler;

import data.User;

public interface UserControler <T extends User>{
    T create(String firstName, String secondName, String lastName);
}

// Данный интерфейс имеет только 1 метод, он подностью подходит под принцип
// ISP, здесь нечего разделять на специализированные интерфейсы
