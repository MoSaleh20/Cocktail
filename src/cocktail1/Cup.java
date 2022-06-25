 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;


/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public class Cup {
    private double calories;
    private double capacity;

    public Color getColorcup() {
        return colorcup;
    }

    public void setColorcup(Color colorcup) {
        this.colorcup = colorcup;
    }
    private double volume;
    private Color colorcup;

    public Cup() {
    }
    
    public Cup(double capacity) {
        setCapacity(capacity);
        volume = 0;
        calories = 0;
    }
    
    public void setCalories(double calories){
        if(calories > 0)
            this.calories = calories;
        else
            this.calories = 0;
    }
    public double getCalories() {
        return calories;
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
        if(volume >= 0)
            this.volume = volume;
        else 
            this.volume = 0;
    }
    
    public String getInfo(){        
        return "Capacity = "+ getCapacity()
               + "\nVolume = "+this.volume
               + "\n" + colorcup.getInfo()
               + "\nCalories = "+this.calories+"\n";
        
    }
}
