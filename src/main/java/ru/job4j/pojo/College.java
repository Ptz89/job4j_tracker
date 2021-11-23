package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иваныч");
        student.setGroup(455);
        student.setDate("21-01-2001");
        System.out.println(student.getFio() + " from group " + student.getGroup() + " born in " + student.getDate());
    }
}
