
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;

import java.util.ArrayList;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh  
 */
public class Blender {
    private double calories;
    private double capacity;
    private double volume;
    private Color colorblender;
    ArrayList<Ingredients> ingredients = new ArrayList<>();

    public Blender() {
    }
    
    public Blender(double capacity){
        setCapacity(capacity);
        calories = 0;
        volume = 0;   
        colorblender = new Color(255, 255, 255);
    }
    
    public Color getColorBlender() {
        return colorblender;
    }
    
    public void setColorblender(Color colorblender) {
        this.colorblender = colorblender;
    }
    
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity > 0)
            this.capacity = capacity;
        else
            this.capacity = 0;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if(volume > 0)
            this.volume = volume;
        else
            this.volume = 0;
    }
    
    public void add(Sugar sugar){
        ingredients.add(sugar);
        volume += sugar.getVolume();
        calories += sugar.getCalories();
    }
    
    public void Add(Fruits fruit){
        try{
            if ((capacity - volume) < fruit.getVolume()){
                throw new Exception("No enough space in the blender!");
            
            }
            ingredients.add(fruit);
            volume += fruit.getVolume();
            calories += fruit.getCalories();
        }catch(Exception er) {
                //System.out.println(er.getMessage());
        } 
    }   

    public void add(Milk milk){
        try{
            if ((capacity - volume) < milk.getVolume())
                throw new Exception("No enough space in the blender!");
            ingredients.add(milk);
            volume += milk.getVolume();
            calories += milk.getCalories();
        }catch(Exception er) {
                //System.out.println(er.getMessage());
        }
    }
    
    int counter =0;
    public void Blend(){
        
       
        int r = 0;
        int g = 0;
        int b = 0;
        int i = 0 ;
       
        int index = ingredients.size();
        int[] rList = new int[index];
        int[] gList = new int[index];
        int[] bList = new int[index];
        double[] ingrVolume = new double[index];
        double sumVol = 0;
        double sumCal = 0;
           
        for(Ingredients ing : ingredients){
            sumCal += ing.getCalories();
            sumVol += ing.getVolume();
            ingrVolume[i] = ing.getVolume();
            rList[i] = ing.color.getR();
            gList[i] = ing.color.getG();
            bList[i] = ing.color.getB();
            i++;     
        }
       
        for(int j = 0; j< index; j++){ 
            r += (int) (rList[j] * ingrVolume[j] / sumVol); 
            g += (int) (gList[j] * ingrVolume[j] / sumVol);
            b += (int) (bList[j] * ingrVolume[j] / sumVol);
        }
            
        // counter == 0 when volume == 0 before adding ingredients
        if(counter != 0) {
            double totalVolume = volume + sumVol;
            double presentage = sumVol / totalVolume;
            r = (int)( r * presentage + colorblender.getR() * (1-presentage));
            g = (int)( g * presentage + colorblender.getG() * (1-presentage));
            b = (int)( b * presentage + colorblender.getB() * (1-presentage));
        }          
            
        colorblender = new Color(r, g, b);            
        ingredients.removeAll(ingredients);
        counter++;

    }
    
    public void Pour(Cup cup){
        try{
            if(this.volume == 0)
                throw new Exception("Blender is empty!");
            if(this.volume >= cup.getCapacity()) {
                cup.setVolume(cup.getCapacity());
                cup.setCalories(cup.getVolume() * this.calories / this.getVolume());
                volume -= cup.getCapacity();
                this.calories -= cup.getCalories();
            }
                
            else if(this.volume > 0) {
                cup.setVolume(volume);
                cup.setCalories(cup.getVolume() * this.calories / this.getVolume());
                volume = 0;
                this.calories = 0;
                colorblender = new Color(255, 255, 255);
                counter = 0;
            }

            
        }catch(Exception er){
            //System.out.println(er.getMessage());
        }
    }
    
    public String getInfo(){   

        return "Capacity = "+ getCapacity() 
            +"\nVolume = " + volume  + "\n"  
            +  colorblender.getInfo()
            + "\nCalories = " + calories + "\n";
    }        
    public String Save(){   
        return getCapacity() +"\n" 
                + volume  + "\n" 
                + colorblender.Save() + "\n" 
                + calories + "\n";
    }  

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
    
    public String printIngredients() {
        String str = "";
        for(Ingredients in: ingredients) {
            str += in.getInfo() + "\n";
        }
        return str;
    }
}
