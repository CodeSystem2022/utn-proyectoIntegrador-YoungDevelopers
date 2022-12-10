/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.proyect;

/**
 *
 * @author agusc
 */
public class Burger {

    //ATRIBUTOS
    private int index, price;
    private String name, desc;
    
    //CONSTRUCTORES
    public Burger(){
    }
    
    public Burger(int index, int price, String name, String desc){
        this.index = index;
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    //MÉTODOS
    public int getIndex(){
        return this.index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDesc(){
        return this.desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
}

