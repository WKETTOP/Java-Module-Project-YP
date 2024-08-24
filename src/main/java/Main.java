import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] participant = new Car[3];

        for (int i = 0; i < participant.length; i++) {
            System.out.println("Введите название №" + (i + 1) + " машины: ");
            String n = scanner.next();
            int s;
            while (true) {
                System.out.println("Введите скорость №" + (i + 1) + " машины: ");
                if (scanner.hasNextInt()) {
                    s = scanner.nextInt();
                    if (s >= 0 && s <= 250) {
                        break;
                    } else {
                        System.out.println("Неправильно ввели скорость! Нужно ввести цифры от 0 до 250");
                    }
                } else {
                    System.out.println("Неправильно ввели скорость! Нужно ввести только цифры от 0 до 250");
                    scanner.next();
                }
            }
            participant[i] = new Car(n, s);
        }

        scanner.close();
        Race result = new Race();
        result.toPrintChooseWinner(participant);
    }
}
