package inheritance.restaurant;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price){
        this.setName(name);
        this.setPrice(price);
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setPrice(BigDecimal price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public BigDecimal getPrice(){
        return this.price;
    }
}
