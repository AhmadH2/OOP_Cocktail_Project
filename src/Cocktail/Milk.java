/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocktail;

/**
 *
 * @author 97259
 */
public class Milk extends Ingredients {
    public double volume=0;
    public Color colormilk;
    
    public Milk() {
    }

    public Milk(String name, double volume,int a, int b, int c) {
        super(name);
        this.volume=volume;
        this.calories=volume*30;
        this.colormilk=new Color(a,b,c);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
}
