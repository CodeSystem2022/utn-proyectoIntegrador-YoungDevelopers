/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.proyect;

/**
 *
 * @author agusc
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
    private String nombre;
    private List<Burger> menuBurger;
    private List<Drink> menuDrink;
    private List<Acompanamientos> menuAcomp;

    public Menu() {
    }

    public Menu(String nombre) {
        this.nombre = nombre;
        this.menuBurger = new ArrayList();
        this.menuDrink = new ArrayList();
        this.menuAcomp = new ArrayList();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addMenuDrink(Drink i) {
        this.menuDrink.add(i);
    }

    public void remMenuBurger(Drink i) {
        this.menuDrink.remove(i);
    }

    public void addMenuBurger(Burger j) {
        this.menuBurger.add(j);
    }

    public void remMenuBurger(Burger j) {
        this.menuBurger.remove(j);
    }

    public void addMenuAcomp(Acompanamientos x) {
        this.menuAcomp.add(x);
    }

    public void remMenuAcomp(Acompanamientos x) {
        this.menuAcomp.remove(x);
    }

    public void showMenuBurger() {
        Iterator var1 = this.menuBurger.iterator();

        while(var1.hasNext()) {
            Burger i = (Burger)var1.next();
            System.out.print(i.getIndex() + ": ");
            System.out.print(i.getName());
            System.out.print("  $ ");
            System.out.println(i.getPrice());
            System.out.print("Contiene: ");
            System.out.println(i.getDesc());
            System.out.println("");
        }

    }

    public void showMenuDrink() {
        Iterator var1 = this.menuDrink.iterator();

        while(var1.hasNext()) {
            Drink i = (Drink)var1.next();
            System.out.print(i.getIndex() + ": ");
            System.out.print(i.getName());
            System.out.print("  $ ");
            System.out.println(i.getPrice());
            System.out.print("Tamaño: ");
            System.out.println(i.getSize() + " L");
            System.out.println("");
        }

    }

    public void showMenuAcomp() {
        Iterator var1 = this.menuAcomp.iterator();

        while(var1.hasNext()) {
            Acompanamientos i = (Acompanamientos)var1.next();
            System.out.print(i.getIndex() + ": ");
            System.out.print(i.getName());
            System.out.print("  $ ");
            System.out.println(i.getPrice());
            System.out.print("Contiene: ");
            System.out.println(i.getDesc());
            System.out.println("");
        }

    }
}


