import java.util.*;

class Ex2 {

    ArrayList<String> city = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    void append() {
        if (city.isEmpty()) {
            city.add("Chennai");
            city.add("Madurai");
            city.add("Salem");
        }

        System.out.print("Enter a city to add: ");
        city.add(sc.next());
    }

    void position() {
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter city to insert: ");
        String cname = sc.nextLine();

        if (index >= 0 && index <= city.size()) {
            city.add(index, cname);
        } else {
            System.out.println("Invalid Index");
        }
    }

    void searching() {
        System.out.print("Enter city to search: ");
        String search = sc.next();

        if (city.contains(search))
            System.out.println("City Found");
        else
            System.out.println("City Not Found");
    }

    void start() {
        System.out.print("Enter starting letter: ");
        String ch = sc.next();

        System.out.println("Cities starting with " + ch + ":");

        for (String c : city) {
            if (c.toLowerCase().startsWith(ch.toLowerCase())) {
                System.out.println(c);
            }
        }
    }

    int input() {
        System.out.println("\n1. Append");
        System.out.println("2. Insert at Position");
        System.out.println("3. Search");
        System.out.println("4. Display Cities Starting with Letter");
        System.out.println("5. Exit");
        System.out.print("Enter Choice: ");

        return sc.nextInt();
    }

    void display() {
        System.out.println("Current List: " + city);
    }

    public static void main(String[] args) {

        Ex2 obj = new Ex2();

        while (true) {

            int choice = obj.input();

            switch (choice) {

                case 1:
                    obj.append();
                    break;

                case 2:
                    obj.position();
                    break;

                case 3:
                    obj.searching();
                    break;

                case 4:
                    obj.start();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

            obj.display();
        }
    }
}