/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectA;

/**
 *
 * @author HERMI
 */
public class Data_sheet {
    
    
    Data_sheet(String id ,String title , String description , String director, String producer , int release_date , int rt_score){
        this.id = id;
        this.title = title;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.release_date = release_date;
        this.rt_score = rt_score;
    }
    
    public String getID(){
        return id;

    }
       
    public String getTitle(){
        return title;

    } 
    
    public String getDescription(){
        return description;

    }
    
    public String getProducer(){
        return producer;
    }
    
    public String getDirector(){
        return director;
    }
    
    public int getRelease_Date(){
        return release_date;
    }
    
    public int getRT_Score(){
        return rt_score;
    }
    
    
    private String id ;
    private String title;
    private String description;
    private String director;
    private String producer;
    private int release_date;
    private int rt_score;
    
    
    
}
