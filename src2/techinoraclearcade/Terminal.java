/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techinoraclearcade;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Terminal {

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    private int money;
    private Cards Card;
    private Reward Reward;
    private int category;
    
    public Terminal(Reward Reward, int category){
        this.Reward = Reward;
        this.category = category;
    }

    
    public int moneyToCredit(int money, Cards Card){ //retorna o valor inserido como creditos x2
        int credit = money * 2;
        Card.setCreditBalance(credit);
        return Card.getCreditBalance();
    }
    
    public void consultBalance(Cards Card){
        System.out.println("Cartão: " + Card.getCardNumber());
        System.out.println("Créditos disponiveis: " + Card.getCreditBalance());
        System.out.println("Tickets disponiveis: " + Card.getTicketBalance());
    }
    
    public void transferCredit(Cards Card1, Cards Card2){
        if (Card1.getCreditBalance() <= 0 || Card2.getCreditBalance() <= 0 || Card1.getTicketBalance() <=0 || Card2.getTicketBalance() <= 0){
            System.out.println("Créditos insulficientes para transferência.");
        } else{
           System.out.println("Cartão: " + Card1.getCardNumber() + " possue " + Card1.getCreditBalance() +  " créditos e " + Card1.getTicketBalance() +  " tickets.");
           System.out.println("Cartão: " + Card2.getCardNumber() + " possue " + Card2.getCreditBalance() +  " créditos e " + Card2.getTicketBalance() +  " tickets.");
           
           Scanner sc = new Scanner(System.in);
           System.out.println("Escolha a quantidade de créditos e tickets a serem transferidos: ");
           int creditsToTransfer = sc.nextInt();
           int ticketsToTransfer = sc.nextInt();
           
           Card1.setCreditBalance(Card1.getCreditBalance() - creditsToTransfer);
           Card1.setTicketBalance(Card1.getTicketBalance() - ticketsToTransfer);
           
           Card2.setCreditBalance(Card2.getCreditBalance() + creditsToTransfer);
           Card2.setTicketBalance(Card2.getTicketBalance() + ticketsToTransfer);
           
           consultBalance(Card1);
           consultBalance(Card2);
           sc.close();
        }
    }
    
    
    
    public void exchangeTickets(Cards Card, int category){
           if(Card.getTicketBalance() < Reward.getNecessaryTickets() || Reward.getQuantity() == 0){
               System.out.println("Item fora de estoque.");
           } else {
               System.out.println("O item " + Reward.getName() + " foi adiquirido.");
               Reward.setQuantity(Reward.getQuantity() - 1);
               System.out.println(Reward.getQuantity() + " itens restantes.");
           }
        }   
}
