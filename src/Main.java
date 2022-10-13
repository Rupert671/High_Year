import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год в формате yyyy");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Количество дней 366 - высокосный год");
        } else if (year % 100 == 0) {
            System.out.println("Количество дней 365 - не высокосный год");
        } else if (year % 4 == 0) {
            System.out.println("Количество дней 366 - высокосный год");
        } else {
            System.out.println("Количество дней 365 - не высокосный год");
        }
    }
}