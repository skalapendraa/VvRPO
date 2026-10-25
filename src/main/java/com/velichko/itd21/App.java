package com.velichko.itd21;
import java.util.ArrayList;
import java.util.List;

/**
 * Консольное приложение для демонстрации.
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        // Ввод данных о 10 студентах с надбавкой 25% (средний балл от 7 до 8)
        for (int i = 1; i <= 10; i++) {
            students.add(new BudgetStudent("Студент-бюджетник " + i, new SessionResult(7.5, true)));
        }
        
        // Добавление студентов платной формы обучения
        students.add(new PaidStudent("Иванов И.И. (платник)", new SessionResult(8.2, true)));
        students.add(new PaidStudent("Петров П.П. (платник)", new SessionResult(6.0, true)));

        System.out.println("Студенты, обучающиеся на платной основе:");
        double totalScoreSum = 0;
        
        for (Student student : students) {
            totalScoreSum += student.getSessionResult().getAverageScore();
            if (student.isPaid()) {
                System.out.println("- " + student.getName());
            }
        }

        double averageScoreAll = totalScoreSum / students.size();
        System.out.println("\nСредний балл по итогам сессии по всем студентам: " + averageScoreAll);
    }
}
// Завершение работы