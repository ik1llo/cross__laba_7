import java.rmi.Naming;
import java.util.Scanner;

public class ServiceClient {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            RemoteInterface service = (RemoteInterface) Naming.lookup("rmi://localhost:7080/remote");
            
            while (true) {
                System.out.println("");
                System.out.println("select action:");
                System.out.println("1. add");
                System.out.println("2. subtract");
                System.out.println("3. multiply");
                System.out.println("4. exit");
                System.out.print("[action]: ");
                
                int action = scanner.nextInt();
                System.out.println("");

                int result;
                int num_1, num_2;

                switch (action) {
                    case 1:
                        System.out.print("[first number]: ");
                        num_1 = scanner.nextInt();

                        System.out.print("[second number]: ");
                        num_2 = scanner.nextInt();

                        result = service.add(num_1, num_2);
                        System.out.println("addition result: " + result);
                        break;
                    case 2:
                        System.out.print("[first number]: ");
                        num_1 = scanner.nextInt();

                        System.out.print("[second number]: ");
                        num_2 = scanner.nextInt();

                        int result_subtract = service.subtract(num_1, num_2);
                        System.out.println("subtraction result: " + result_subtract);
                        break;
                    case 3:
                        System.out.print("[first number]: ");
                        num_1 = scanner.nextInt();

                        System.out.print("[second number]: ");
                        num_2 = scanner.nextInt();

                        int result_multiply = service.multiply(num_1, num_2);
                        System.out.println("multiplication result: " + result_multiply);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("invalid choice... try again");
                }
            }

        } catch (Exception e) { e.printStackTrace(); }
    }
}
