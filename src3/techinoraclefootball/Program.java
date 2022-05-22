/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techinoraclefootball;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Program {
    
    public static int setTemp(){
        Scanner sc = new Scanner(System.in);
        int temperature = 0;  
        System.out.println("Insira uma temperatura: ");
        temperature = sc.nextInt();
        return temperature;
    }         
}

