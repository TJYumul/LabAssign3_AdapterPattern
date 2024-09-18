import java.util.*;
public class DeviceApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet phoneOutlet = new SmartphoneAdapter(smartphoneCharger);

        while (true) {
            System.out.println("Plugging Devices into Power Outlets");
            System.out.println("1. Laptop");
            System.out.println("2. Refrigerator");
            System.out.println("3. Smartphone");
            System.out.println("4. Exit");
            System.out.print("Choose device to plug in: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(laptopOutlet.plugIn());
                    break;
                case 2:
                    System.out.println(fridgeOutlet.plugIn());
                    break;
                case 3:
                    System.out.println(phoneOutlet.plugIn());
                    break;
                case 4:
                    System.out.println("Power off");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println();
        }
    }
}