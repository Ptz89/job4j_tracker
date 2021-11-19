package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активное " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error er = new Error();
        Error er1 = new Error(true, 10, "String");
        Error er2 = new Error(false, 0, "zero");
        er.printInfo();
        er1.printInfo();
        er2.printInfo();
    }
}
