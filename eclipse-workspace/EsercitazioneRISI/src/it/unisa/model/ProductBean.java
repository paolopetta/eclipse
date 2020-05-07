package it.unisa.model;

import java.io.Serializable;

public class ProductBean implements Serializable {

    private int code;
    private String name;
    private String description;
    private int price;
    private int quantity;

    public ProductBean(){
        code = -1;
        name = "";
        description = "";
        price = 0;
        quantity = 0;
    }

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public boolean isEmpty() { return code == -1; }

    public String toString() {
        return "["+code+"]" + name + description + price+"€" + quantity;
    }

    public boolean equals(Object otherObject){
        return this.getCode() == ((ProductBean) otherObject).getCode();
    }
}
