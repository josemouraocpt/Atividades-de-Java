/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techinoraclefootball;

/**
 *
 * @author Jose
 */
public class Team {

    public int[] getStatistics() {
        return statistics;
    }

    public String getName() {
        return name;
    }
    
    public int getWins(){
        return this.statistics[0];
    }
    
    public int getLosses(){
        return this.statistics[1];
    }
    
    public int getTies(){
        return this.statistics[2];
    }
    
    public int getScoredPoints(){
        return this.statistics[3];
    }
    
    public int getAllowedPoints(){
        return this.statistics[4];
    }
    
    private String name;
    private int[] statistics = new int[5];
    
    public Team(String name){
        this.name = name;
    }
    
    public void gameStatistics(Game game){
        
    }
    
    public void setScoredPoints(int gols){
        this.statistics[3] += gols;
    }
    
    public void setAllowedPoints(int gols){
        this.statistics[4] += gols;
    }
    
    public void setWins(){
        this.getStatistics()[0] ++;
    }
    
    public void setLosses(){
        this.getStatistics()[1] ++;
    }
    
    public void setTies(){
        this.getStatistics()[2] ++;
    }
}
