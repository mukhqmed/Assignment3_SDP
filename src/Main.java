import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PCGame androidEmulator = new Emulator(new Android());
        PCGame iosEmulator = new Emulator(new IOS());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your mobile Operating system!");
        System.out.println("1. Android");
        System.out.println("2. IOS");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> androidEmulator.connectWithPC();
            case 2 -> iosEmulator.connectWithPC();
            default -> throw new IllegalArgumentException("Invalid choice");
        }
    }
}