/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package techinoraclefootball;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jose
 */
public class TechinOracleFootball {


    public static void main(String[] args) {
       ArrayList<Integer> temps = new ArrayList();
       ArrayList<Game> games = new ArrayList();
       Team t1 = new Team("time 1");
       Team t2 = new Team("time 2");
       Team t3 = new Team("time 3");
       Team t4 = new Team("time 4");
       Team[] teamsArray = {t1, t2 , t3, t4};
       int count = 0;
       int id = 1;
       while(count < 3){ 
           int temp = Program.setTemp();
           if(temp >= 15){ // caso a temperatura seja maior que 15 realiza dois jogos no dia
                List<Team> teams = Arrays.asList(teamsArray);
                Collections.shuffle(teams);
                teams.toArray(teamsArray);
                Team[] jogo1 = {teamsArray[0],teamsArray[1]};
                Team[] jogo2 = {teamsArray[2],teamsArray[3]};
                Game game1 = new Game(temp, id);
                game1.setTeams(jogo1);
                game1.setGameResult();
                Game game2 = new Game(temp, id+1);
                game2.setTeams(jogo2);
                game2.setGameResult();
                games.add(game1);
                games.add(game2);
                id = id + 2;
                temps.add(temp);
            }
           else{
               count++;
           }
       }
       System.out.println("**********RESULTADOS**********");
       for(Team team : teamsArray){
            System.out.println(team.getName());
            System.out.println(
                   "Vitórias: " + team.getWins()
                   + "    Derrotas:" + team.getLosses()
                   + "    Empates: " + team.getTies());
            System.out.println(
                    "Gols feitos:  " + team.getScoredPoints()
                    +"    Gols sofridos: " + team.getAllowedPoints());
            System.out.println();
       }
       System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
       for(Game game : games){
           System.out.println("Jogo #" + game.getGameNumber());
           System.out.println("Temperatura: " + game.getTemp());
           for(int i = 0; i<2 ; i++){
               System.out.println(game.getTeams()[i].getName() + game.getGols()[i]);
           }
       }
       int tot = 0;
       int avg = 0;
       for(Integer temp : temps){
           tot += temp;   
       }
       avg = tot / temps.size();
       Collections.sort(temps);//oredena o array de temperaturas
       System.out.println("Temperatura mais alta: " + temps.get(temps.size()-1));//retorna a maior temperatura
       System.out.println("Temperatura média: " + avg);//retorna a média das temperaturas
    }

}
