/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.proyect;

/**
 *
 * @author agusc
 */
public class Drink {

    //ATRIBUTOS
    private int index, price;
    private String name;
    private double size;
    
    //CONSTRUCTORES
    public Drink(){
    }

    public Drink(int index, int price, String name, double size){
        this.index = index;
        this.price = price;
        this.name = name;
        this.size = size;
    }

    //MÉTODOS
    public int getIndex(){
        return index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }
}
