package test.java.proyect;

public class Acompanamientos {
    private int index;
    private int price;
    private String name;
    private String desc;

    public Acompanamientos() {
    }

    public Acompanamientos(int index, int price, String name, String desc) {
        this.index = index;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
