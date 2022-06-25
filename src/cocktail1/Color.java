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
public class Color {
    private int R;
    private int G;
    private int B;

    public Color() {
    }
    
    public Color(int R, int G, int B) {
        setB(B);
        setG(G);
        setR(R);
    }

     public int getR() {
        return R;
    }

    public void setR(int R) {
        if (R>=0 & R<=255)
            this.R = R;
        else
            this.R = 0;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        if (G>=0 & G<=255)
            this.G = G;
        else
            this.G = 0;
        
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        if (B>=0 & B<=255)
            this.B = B;
        else
            this.B = 0;
    }

    public String getInfo() {
        return "Color ("+ R + "," + G + "," + B + ')';
                
    }
    public String Save() {
        return R + "\n" + G + "\n" + B;
                
    }
    
}
