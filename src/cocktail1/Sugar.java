/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;

import java.io.Serializable;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public class Sugar extends Ingredients implements Serializable{
    
    public Sugar() {
        super("sugar", 255 , 255 ,255);
        super.setCalories(getCalories());
    }
      
    @Override
    public double getCalories(){
       return 5;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", volume= ignored "; 
    }
    @Override
      public Color getColor(){
        return color;
}}
