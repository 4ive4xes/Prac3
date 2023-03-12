import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Smartphone smartphone = new Smartphone(false, 7, "Android", "Nokia");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        System.out.println("Введите состояние телефона (Вкл/Выкл): ");
        boolean state = scanner.nextBoolean();
        System.out.println("Введите диагональ дисплея телефона: ");
        scanner = new Scanner(System.in);
        double diagonal = scanner.nextDouble();
        System.out.println("Введите операционную систему телефона");
        scanner = new Scanner(System.in);
        String OS = scanner.nextLine();
        System.out.println("Введите модель телефона: ");
        String model = scanner.nextLine();

        TouchTone touchTone = new TouchTone(state, diagonal, OS, model);
        touchTone.call("89857632299");
        touchTone.blockTelephone();
        System.out.println(touchTone.sendSms("Я люблю Lo-Fi"));
        touchTone.unblockTelephone();

        System.out.println(smartphone);
        seller.modify(smartphone);
        System.out.println(smartphone);
    }
}