package encapsulation.shoppingSpree;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Product> allProducts = new HashMap<>();
        LinkedHashMap<String, Person> allPersons = new LinkedHashMap<>();

        String[] inputPersons = scanner.nextLine().split(";");
        String[] inputProducts = scanner.nextLine().split(";");
        try {
            fillPersonData(allPersons, inputPersons);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            fillProductsData(allProducts, inputProducts);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String input = scanner.nextLine();
        while (!input.equals("END")){
            String[] temp = input.split("\\s+");
            String personName = temp[0];
            String productsName = temp[1];

            Person tempPerson = getPerson(allPersons, personName);
            Product tempProduct = getProduct(allProducts, productsName);

            tempPerson.addProduct(tempProduct);

            input = scanner.nextLine();
        }

        for (Person person : allPersons.values()){
            person.printShoppingBag();
        }
    }

    static void fillPersonData(HashMap<String, Person> O, String[] T) {
        for(String str : T){
            String[] temp = str.split("=");
            String name = temp[0];
            double money = Double.parseDouble(temp[1]);
            addToPersonsList(O, name, money);
        }
    }

    static void fillProductsData(HashMap<String, Product> O, String[] T) {
        for(String str : T){
            String[] temp = str.split("=");
            String name = temp[0];
            double money = Double.parseDouble(temp[1]);
            addToProductsList(O, name, money);
        }
    }

    static void addToPersonsList(HashMap<String, Person> allPersons, String name, double money){
        Person pr = new Person(name, money);
        allPersons.put(name, pr);
    }

    static Person getPerson(HashMap<String, Person> allPersons, String name){
        return allPersons.get(name);
    }

    static void addToProductsList(HashMap<String, Product> allProducts, String name, double price){
        Product pr = new Product(name, price);
        allProducts.put(name, pr);
    }

    static Product getProduct(HashMap<String, Product>  allProducts, String name){
        return allProducts.get(name);
    }
}
