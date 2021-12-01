package telephony;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        List<String> numbersList = new ArrayList<>();
        
        String[] numbers = scanner.nextLine().split("\\s+");
        for ( String n : numbers){
            numbersList.add(n);
        }

        List<String> urlsList = new ArrayList<>();

        String[] urls = scanner.nextLine().split("\\s+");
        for ( String n : urls){
            urlsList.add(n);
        }

        Smartphone phone = new Smartphone(numbersList, urlsList);

        System.out.println(phone.call());
        System.out.println(phone.browse());
    }
}
