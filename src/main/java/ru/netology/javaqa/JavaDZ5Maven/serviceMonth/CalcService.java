package ru.netology.javaqa.JavaDZ5Maven.serviceMonth;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses;

                money /= 3;

            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
