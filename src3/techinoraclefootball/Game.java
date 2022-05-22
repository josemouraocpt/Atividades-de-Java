/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techinoraclefootball;
import java.util.Random;

public class Game {

    public Team[] getTeams() {
        return teams;
    }

    public int[] getGols() {
        return gols;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public int getTemp() {
        return temp;
    }
    private int gameNumber;
    private Team[] teams = new Team[2];
    private int temp;
    private int[] gols = new int[2];
    
    public Game(int temp, int id){
        this.temp = temp;
        this.gameNumber = id;
    }
    
    public void setTeams(Team[] team){
        this.teams = team;
    }
    
    public void setGameResult(){
        int team2gols = 0 ;
        int team1gols = 0;
        if(this.getTemp() >= 25){//caso a temperatura >=25 realiza um jogo
            Random r = new Random();
            team1gols = (int) r.nextDouble(1, this.getTemp() * 0.25);
            this.getTeams()[0].setScoredPoints(team1gols);//define os gols marcados pela equipe 1
            this.getTeams()[1].setAllowedPoints(team1gols);//define os gols sofridos pela equipe 2
            team2gols = (int) r.nextDouble(1, this.getTemp() * 0.25);
            this.getTeams()[1].setScoredPoints(team2gols);//define os gols marcados pela equipe 2
            this.getTeams()[0].setAllowedPoints(team2gols);//define os gols sofridos pela equipe 1
        }
        else{ //caso a teperatura < 25, um jogo com menos gols
            Random r = new Random();
            team1gols = (int) r.nextDouble(1, 9);
            this.getTeams()[0].setScoredPoints(team1gols);
            this.getTeams()[1].setAllowedPoints(team1gols);
            team2gols = (int) r.nextDouble(1, 9);
            this.getTeams()[1].setScoredPoints(team2gols);
            this.getTeams()[0].setAllowedPoints(team2gols);
        }
        this.gols[0] = team1gols;
        this.gols[1] = team2gols;
        if(team1gols > team2gols){//decide quem foi o vencedor
            this.getTeams()[0].setWins();
            this.getTeams()[1].setLosses();
        } else if(team1gols < team2gols){
            this.getTeams()[1].setWins();
            this.getTeams()[0].setLosses();
        } else{
            this.getTeams()[0].setTies();
            this.getTeams()[1].setTies();
        }
    }
}
