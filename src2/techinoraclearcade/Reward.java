/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techinoraclearcade;

/**
 *
 * @author Jose
 */
public class Reward {

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNecessaryTickets() {
        return necessaryTickets;
    }

    public void setNecessaryTickets(int necessaryTickets) {
        this.necessaryTickets = necessaryTickets;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private String name;
    private int necessaryTickets;
    private int quantity;
    private int category;
    
    public Reward(String name, int necessaryTickets, int quantity, int category){
        this.name = name;
        this.necessaryTickets = necessaryTickets;
        this.quantity = quantity;
        this.category = category;
    }
}
