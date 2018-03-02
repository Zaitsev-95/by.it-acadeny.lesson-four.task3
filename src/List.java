import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Создаем сканнер
        Patient patient = new Patient("", "", "", 0, false);       //Создаём пациентов, через конструктор
        Patient patient1 = new Patient("", "", "", 0, false);
        Patient patient2 = new Patient("", "", "", 0, false);
        System.out.println("-----------------------------------------------------");
        System.out.println("Пациент-1:");
        System.out.println("Введите Фамилию: ");
        patient.setSurname(scanner.nextLine());
        System.out.println("Введите Имя: ");
        patient.setName(scanner.nextLine());
        System.out.println("Введите Отчество: ");
        patient.setPatronymic(scanner.nextLine());
        System.out.println("Введите Возраст: ");
        patient.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Введите пол пациента(м/ж): ");
        patient.setGender(scanner.nextBoolean());
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        patient.info();
        System.out.println("-----------------------------------------------------");
        System.out.println("Пациент-2:");
        System.out.println("Введите Фамилию: ");
        patient1.setSurname(scanner.nextLine());
        System.out.println("Введите Имя: ");
        patient1.setName(scanner.nextLine());
        System.out.println("Введите Отчество: ");
        patient1.setPatronymic(scanner.nextLine());
        System.out.println("Введите Возраст: ");
        patient1.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Введите пол пациента(м/ж): ");
        patient1.setGender(scanner.nextBoolean());
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        patient1.info();
        System.out.println("-----------------------------------------------------");
        System.out.println("Пациент-3:");
        System.out.println("Введите Фамилию: ");
        patient2.setSurname(scanner.nextLine());
        System.out.println("Введите Имя: ");
        patient2.setName(scanner.nextLine());
        System.out.println("Введите Отчество: ");
        patient2.setPatronymic(scanner.nextLine());
        System.out.println("Введите Возраст: ");
        patient2.setAge(scanner.nextInt());
        System.out.println("Введите пол пациента(м/ж): ");
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        patient2.info();
        System.out.println("-----------------------------------------------------");
        patient2.setGenderString(scanner.nextLine());
    }
}
