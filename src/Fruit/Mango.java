/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruit;

import cocktail1.Color;
import cocktail1.Fruits;

/**
 *
 * @author MohammadSaleh & AhmadHoryzat
 */
public class Mango extends Fruits {


    public Mango(double volume) {
        super("Mango", volume,255,130,67);

    }
    
    //One Liter of Mangos approximately equals 0.42 kcal.
    @Override
    public double getCalories() {
        return volume*0.42;
    }
    @Override
      public double getVolume(){
          return volume;
    }
      @Override
      public Color getColor(){
        return color;
    }
    
}
