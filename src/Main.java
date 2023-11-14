import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countStudents, currentMark, sumMarks, i;
        double avgMark;

        Scanner scanner = new Scanner(System.in);

        i = 0;
        sumMarks = 0;

        System.out.print("Введите количество студентов: ");
        countStudents = scanner.nextInt();

        while (i < countStudents) {
            System.out.print(String.format("Введите оценку %d студента из %d студентов: ", i + 1, countStudents));
            currentMark = scanner.nextInt();

            sumMarks += currentMark;

            i++;
        }

        avgMark = (double) sumMarks / countStudents;

        System.out.print(String.format("Средняя оценка = %.2f", avgMark));
    }
}