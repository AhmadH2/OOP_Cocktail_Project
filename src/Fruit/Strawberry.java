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
public class Strawberry extends Fruits {

    //One gram of Lemons approximately equals 2.46 ml.
    public Strawberry(double volume) {
        super(volume*1.96,225,5,33);
        name="Strawberry";

    }  
    
    //One Liter of Lemons approximately equals 0.19 kcal.
    @Override
    public double getCalories() {
        return volume*0.36;
    }
    @Override
      public double getVolume(){
        return volume*1.96;
    }
      @Override
      public Color getColor(){
        return color;
    }
    
}
