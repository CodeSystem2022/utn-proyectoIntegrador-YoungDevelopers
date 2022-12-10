/*
 * GRUPO: YOUNGDEVELOPERS

 * INTEGRANTES:
    Ceschin Agustín
    Diaz Micaela
    Montoya Lucas
    Morbidelli Valentin
    Rebolledo Lourdes
    Rebolledo Lujan ?
    Zambrana Ana

 */
package test.java.proyect;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App{

    public static void main(String[] args) {

        //OBJETOS
        User usuario = new User("Hola", "23334", "Sí");
        Burger clasic = new Burger(1, 500, "Clasic", "Queso y carne");
        Burger doble = new Burger(2, 500, "Double", "Doble carne");
        Burger veggie = new Burger(3, 700, "Veggie", "Medallon de Lenteja");
        Burger huevo = new Burger(4, 500, "Huevo", "Huevos Estrellados");
        Burger hawaiana = new Burger(5, 600, "Hawaiana", "Piña asada");
        Burger pollo = new Burger(6, 500, "Pollo", "Medallon de Pollo");
        Drink cola = new Drink(1, 400, "Coca-Cola", 1.5D);
        Drink sprite = new Drink(2, 300, "Sprite", 1.5D);
        Drink fanta = new Drink(3, 500, "Fanta", 1.5D);
        Drink agua = new Drink(4, 300, "Agua", 1.5D);
        Drink agua_saborizada = new Drink(5, 350, "AguaSaborizada", 1.5D);
        Drink cerveza = new Drink(6, 700, "Cerveza", 1.5D);
        Acompanamientos papas_clasicas = new Acompanamientos(1, 300, "Papas Clasicas", "Medianas");
        Acompanamientos papas_chedar = new Acompanamientos(2, 500, "Papas Cheddar", "Papas con cheddar y Bacon");
        Acompanamientos rabas = new Acompanamientos(3, 300, "Rabas", "Rabas con limon");
        Acompanamientos nuggets = new Acompanamientos(4, 300, "Nuggets de Pollo", "Nuggets de pollo");
        Menu hamburger = new Menu("Hamburguesas");
        Menu drink = new Menu("Bebidas");
        Menu acompanamientos = new Menu("Acompañamientos");
        Menu carrito = new Menu("Carro de compras");
        hamburger.addMenuBurger(clasic);
        hamburger.addMenuBurger(doble);
        hamburger.addMenuBurger(veggie);
        hamburger.addMenuBurger(huevo);
        hamburger.addMenuBurger(hawaiana);
        hamburger.addMenuBurger(pollo);
        drink.addMenuDrink(cola);
        drink.addMenuDrink(sprite);
        drink.addMenuDrink(fanta);
        drink.addMenuDrink(agua);
        drink.addMenuDrink(agua_saborizada);
        drink.addMenuDrink(cerveza);
        acompanamientos.addMenuAcomp(papas_clasicas);
        acompanamientos.addMenuAcomp(papas_chedar);
        acompanamientos.addMenuAcomp(rabas);
        acompanamientos.addMenuAcomp(nuggets);

        int total;
        for(int i = 1; i != 0; i = total) {
            String nombre = JOptionPane.showInputDialog((Component)null, "Ingresa tu nombre");
            usuario.setName(nombre);
            String numero = JOptionPane.showInputDialog((Component)null, "Ingresa tu número");
            usuario.setPhone(numero);
            total = JOptionPane.showConfirmDialog((Component)null, "Confirma si tus datos son correcto: " + nombre + " " + numero, "CONFIRMACIÓN", 0, 1);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("BurgerApp");
        System.out.println("");
        System.out.println("SISTEMA DE PEDIDOS:");
        System.out.println("¿DESEA AGREGAR UNA HAMBURGUESA?");
        System.out.println("1 SI | 2 NO");
        total = 0;
        int selection = sc.nextInt();
        if (selection == 1) {
            System.out.println("Menú de hamburguesas:");
            hamburger.showMenuBurger();
            System.out.println("SALIR: 7");

            while(selection != 7) {
                selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("[+] " + clasic.getName());
                    carrito.addMenuBurger(clasic);
                    total += clasic.getPrice();
                } else if (selection == 2) {
                    System.out.println("[+] " + doble.getName());
                    carrito.addMenuBurger(doble);
                    total += doble.getPrice();
                } else if (selection == 3) {
                    System.out.println("[+] " + veggie.getName());
                    carrito.addMenuBurger(veggie);
                    total += veggie.getPrice();
                } else if (selection == 4) {
                    System.out.println("[+]" + huevo.getName());
                    carrito.addMenuBurger(huevo);
                    total += huevo.getPrice();
                } else if (selection == 5) {
                    System.out.println("[+]" + hawaiana.getName());
                    carrito.addMenuBurger(hawaiana);
                    total += hawaiana.getPrice();
                } else if (selection == 6) {
                    System.out.println("[+]" + pollo.getName());
                    carrito.addMenuBurger(pollo);
                    total += pollo.getPrice();
                } else if (selection > 5) {
                    System.out.println("¡Comprueba el número! [1-7]");
                }
            }

            System.out.println("EN EL CARRO:");
            carrito.showMenuBurger();
            System.out.println("SUBTOTAL: " + total);
            System.out.println("");
        }

        System.out.println("¿DESEA AGREGAR UNA BEBIDA?");
        System.out.println("1 SI | 2 NO");
        selection = sc.nextInt();
        if (selection == 1) {
            System.out.println("Menú de bebidas:");
            drink.showMenuDrink();
            System.out.println("SALIR: 7");

            while(selection != 7) {
                selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("[+] " + cola.getName());
                    carrito.addMenuDrink(cola);
                    total += cola.getPrice();
                } else if (selection == 2) {
                    System.out.println("[+] " + sprite.getName());
                    carrito.addMenuDrink(sprite);
                    total += sprite.getPrice();
                } else if (selection == 3) {
                    System.out.println("[+] " + fanta.getName());
                    carrito.addMenuDrink(fanta);
                    total += fanta.getPrice();
                } else if (selection == 4) {
                    System.out.println("[+]" + agua.getName());
                    carrito.addMenuDrink(agua);
                    total += agua.getPrice();
                } else if (selection == 5) {
                    System.out.println("[+]" + agua_saborizada.getName());
                    carrito.addMenuDrink(agua_saborizada);
                    total += agua_saborizada.getPrice();
                } else if (selection == 6) {
                    System.out.println("[+]" + cerveza.getName());
                    carrito.addMenuDrink(cerveza);
                    total += cerveza.getPrice();
                } else if (selection > 7) {
                    System.out.println("¡Comprueba el número! [1-7]");
                }
            }

            System.out.println("EN EL CARRO:");
            carrito.showMenuDrink();
            System.out.println("");
        }

        System.out.println("¿DESEA AGREGAR UN ACOMPAÑAMIENTO?");
        System.out.println("1 SI | 2 NO");
        selection = sc.nextInt();
        if (selection == 1) {
            System.out.println("Menú de Acompañamiento:");
            acompanamientos.showMenuAcomp();
            System.out.println("SALIR: 7");

            while(selection != 7) {
                selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("[+] " + papas_clasicas.getName());
                    carrito.addMenuAcomp(papas_clasicas);
                    total += papas_clasicas.getPrice();
                } else if (selection == 2) {
                    System.out.println("[+] " + papas_chedar.getName());
                    carrito.addMenuAcomp(papas_chedar);
                    total += papas_chedar.getPrice();
                } else if (selection == 3) {
                    System.out.println("[+] " + rabas.getName());
                    carrito.addMenuAcomp(rabas);
                    total += rabas.getPrice();
                } else if (selection == 4) {
                    System.out.println("[+]" + nuggets.getName());
                    carrito.addMenuAcomp(nuggets);
                    total += nuggets.getPrice();
                } else if (selection > 7) {
                    System.out.println("¡Comprueba el número! [1-7]");
                }
            }

            System.out.println("EN EL CARRO:");
            carrito.showMenuDrink();
            System.out.println("");
        }

        System.out.println("TICKET:");
        carrito.showMenuBurger();
        carrito.showMenuDrink();
        carrito.showMenuAcomp();
        System.out.println("SUBTOTAL: " + total);
        int totalNeto = total / 21 + total;
        System.out.println("TOTAL: " + totalNeto);
        sc.close();
    }
}