import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;

        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printactions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> additems(groceries);
                case 2 -> removeitems(groceries);
                default -> flag = false;
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    // add items method

    private static void additems(ArrayList<String> groceries) {
        System.out.println("add items and separate items by a comma  ");
        String[] items = scanner.nextLine().split(",");
       // groceries.addAll(List.of(items));

        for (String i: items) {
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

//remove items method
    private static void removeitems(ArrayList<String> groceries) {
        System.out.println("remove items and separate items by a comma  ");
        String[] items = scanner.nextLine().split(",");


        for (String i: items) {
            String trimmed = i.trim();
            groceries.add(trimmed);
            }
        }


    //textblock
    private static void printactions(){
        String textblock = """
                
                0 - to shutdown 
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimmted list)
                Enter a number for which action you want to do: """;

        System.out.println(textblock + " ");
    }
}