/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.proyect;

/**
 *
 * @author agusc
 */
public class User {

    //ATRIBUTOS
    private String name, phone, adress;

    public User(String name, String phone, String adress){
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    /*public void showUserData(){
        System.out.println(i.getName);
        
        
        }
       
    }*/
}
