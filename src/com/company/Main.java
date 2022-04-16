package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1,2
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);

        //Задание 3

        String fullName3 = "Иванов Семён Семёнович";
        String fullNameReplace = fullName3.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника - " + fullNameReplace);
    }



}
