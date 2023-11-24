package data;

public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


// В этом классе все соответствует принципу LSP
//его использование вместо объектов подклассов должно работать корректно.


// Также, не нарушен принцип OCP.В данном случае у меня есть возможность
// добавлять новую функциональность без изменения существующего кода, тк
// у любого пользователя есть имя, но я могу к классу наследнику добавить
// новый функционал или создать доп интерфейс без измнения базового класса.
// (Например, добавили студенту ID, в ДЗ создавали еще учителя и тоже его
// дополняли, но на базовый класс это не повлияло)
