package encapsulation.shoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    Person(){
    }
    Person(String name, double money){
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative.");
        }
        this.money = money;
    }

    public void spendMoney(double spend){
        this.setMoney(this.getMoney() - spend);
    }

    private Product getProduct(String name){
        for(Product pr : products){
            if(name.equalsIgnoreCase(pr.getName())){
                return pr;
            }
        }

        return null;
    }

    public void addProduct(Product product){
        if (checkMoneyIsEnought(product.getCost())) {
            this.products.add(product);
            this.spendMoney(product.getCost());
            System.out.println(this.getName() + " bought " + product.getName());
        } else {
            String e = String.format("%s can't afford %s", this.getName(), product.getName());
            System.out.println(e);
        }
    }

    boolean checkMoneyIsEnought(double price){
        return price <= this.getMoney();
    }

    public List<Product> getAllProducts(){
        return this.products;
    }
    public void printShoppingBag() {
        List<Product> e = this.getAllProducts();
        StringBuilder str = new StringBuilder(this.getName() + " - ");
        String strLast;

        if(e.isEmpty()){
            str.append("Nothing bought  ");
        } else {
            for (Product product : e) {
                str.append(product.getName()).append(", ");
            }
        }
        strLast = str.substring(0, str.length() - 2);

        System.out.println(strLast);
    }

}
