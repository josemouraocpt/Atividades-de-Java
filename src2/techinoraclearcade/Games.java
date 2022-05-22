/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techinoraclearcade;
import java.util.Random;
/**
 *
 * @author Jose
 */
public class Games {
    private int neededCredits;
    private Cards Cards;
    
    public Games(int neededCredits, Cards Cards){
        this.neededCredits = neededCredits;
        this.Cards = Cards;
    }
    
    public void readCard(Cards Card){
        if(Card.getCreditBalance() < neededCredits){ //testa se o cartão possui os creditos necessarios 
            System.out.println("Créditos insuficientes.");
        } else{
            Random r = new Random();
            int tickets = r.nextInt(1,100); //gera um valor aleatorio de ticktes
            
            Card.setCreditBalance(Card.getCreditBalance() - neededCredits); //altera os creditos disponiveis do cartão

            Card.setTicketBalance(Card.getTicketBalance() + tickets); //adiciona os tickets recebidos ao cartão

            System.out.println("Cartão: " + Card.getCardNumber());
            System.out.println("Créditos restantes: " + Card.getCreditBalance());
            System.out.println("Tiquetes ganhos: " + tickets);
            System.out.println("Total de ticktes: " + Card.getTicketBalance());  
        }
    
}
}
