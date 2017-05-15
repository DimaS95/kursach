package entity;

/**
 * Created by Дима on 14.01.2017.
 */
public class Students {
    private int id;
    private  String name;
    private  String surname;
    private int price;
    private String isPay;

    public Students(int id) {
        this.id = id;
    }

    public Students(){

    }

    public Students(int id, String name, String surname, int price, String isPay) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.price = price;
        this.isPay = isPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }
}
