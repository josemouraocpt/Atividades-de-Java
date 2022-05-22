/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package techinoraclearcade;

/**
 *
 * @author Jose
 */
public class TechInOracleArcadeTest {

    public static void main(String[] args) {
          Reward r1 = new Reward("O um anel", 1000, 1, 0);
          Reward r2 = new Reward("O caramujo", 2000, 1, 1);
          Reward r3 = new Reward("Borracha", 20, 30, 2);
        
        Cards c1 = new Cards(0001);
        Cards c2 = new Cards(0002);
        
        Terminal t1 = new Terminal(r1, 0);
        Terminal t2 = new Terminal(r2, 1);
        Terminal t3 = new Terminal(r3, 2);
        
        t1.moneyToCredit(500, c1);
        t1.moneyToCredit(500, c2);

        
        Games g1 = new Games(100, c1);
        g1.readCard(c1);
        Games g2 = new Games(300, c1);
        g2.readCard(c1);
        Games g3 = new Games(50, c1);
        g3.readCard(c1);
        
        Games g4 = new Games(100, c2);
        g4.readCard(c2);
        Games g5 = new Games(300, c2);
        g5.readCard(c2);
        Games g6 = new Games(50, c2);
        g6.readCard(c2);
        
        t1.transferCredit(c1, c2);
        t3.exchangeTickets(c2, 2);
        
        g1.readCard(c1);
        
        t1.exchangeTickets(c1,0);
        

    }
    
}
