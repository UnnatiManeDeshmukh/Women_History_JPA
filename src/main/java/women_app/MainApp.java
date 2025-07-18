package women_app;
import women_dao.WomenDAO;
import women_entity.WomenEntity;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
    	WomenDAO dao = new WomenDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Women in History Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:{
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Birth Year: ");
                    int year = sc.nextInt(); sc.nextLine();
                    System.out.print("Country: ");
                    String country = sc.nextLine();
                    System.out.print("Contribution: ");
                    String contrib = sc.nextLine();
                    dao.insert(new WomenEntity(name, year, country, contrib));
                }
                case 2:{
                    List<WomenEntity> list = dao.getAll();
                    list.forEach(System.out::println);
                }
                case 3:{
                    System.out.print("ID to Update: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("New Contribution: ");
                    String contrib = sc.nextLine();
                    dao.update(id, contrib);
                }
                case 4:{
                    System.out.print("ID to Delete: ");
                    int id = sc.nextInt();
                    dao.delete(id);
                }
                case 5:{
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
