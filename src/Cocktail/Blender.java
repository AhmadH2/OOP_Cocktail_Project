/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocktail;

/**
 *
 * @author MohammadSaleh & AhmadHoryzat
 */
public class Blender {
    private double calories;
    private double capacity;
    private String contents;
    private double volume=0;
    private Color colorblender;
    private boolean BlendDetector=false; 
    
    public Blender(double capacity) {
        this.capacity = capacity;
    }
    
    public String Add(Sugar sugar){
//    if  (volume<capacity)
//    {
////        this.volume=fruit.getVolume()+milk.getVolume();
        this.calories+=sugar.getCalories();
        return "Added";
////        this.contents=fruit.getVolume()+" of "+fruit.getName()+" and "+milk.getVolume()+" of "+milk;
////        return "added";
//    }
//       return "over capacity";
    }
    
    public boolean Add(Milk milk){
    if  (volume<capacity)
        if ((capacity-volume)>milk.getVolume())
    {
        this.volume+=milk.getVolume();
        this.calories+=milk.getCalories();
//        this.contents=fruit.getVolume()+" of "+fruit.getName()+" and "+milk.getVolume()+" of "+milk;
        return true;
    }
    return false;
    }
    
    public String Add(Fruits fruit){
        double Space = this.capacity - this.volume;
        if  (Space>0)       
            if (Space>fruit.getVolume())
    {
        this.volume+=fruit.getVolume();
        this.calories+=fruit.getCalories();
        return "added";
        
    }
    return "over capacity";
    }
    
//    public String Add(Fruits fruit,Milk milk,Sugar sugar){
//    if  (volume<capacity)
//    {
//        this.volume=fruit.getVolume()+milk.getVolume();
//        this.calories=fruit.getCalories()+milk.getCalories();
//        this.contents=fruit.getVolume()+" of "+fruit.getName()+" and "+milk.getVolume()+" of "+milk;
//        return "added";
//    }
//    return "over capacity";
//    }
    
//    public void Add(Fruits fruit1,Fruits fruit2,Milk milk,Sugar sugar){
//        double EmptySpace = capacity - volume;
//    if  (volume<capacity) {
//        if ( fruit1.getVolume()+fruit2.getVolume()+milk.getVolume()<=EmptySpace )
//    {
//        this.volume=fruit1.getVolume()+fruit2.getVolume()+milk.getVolume();
//        this.calories=fruit1.getCalories()+fruit2.getCalories()+milk.getCalories();
//        this.contents=fruit1.getVolume()+" of "+fruit1.getName()+" and "+fruit2.getVolume()+" of "+fruit2.getName()+" and "+milk.getVolume()+" of milk ";
////        return "added";
//    }
//    }}
//    return "over capacity";
    

    public void Blend(){
            BlendDetector=true;
//        this.colorblender.setR(Math.round((fr.getR()+mlk.getR())/2));
//        this.colorblender.setG(Math.round((fr.getG()+mlk.getG())/2));
//        this.colorblender.setB(Math.round((fr.getB()+mlk.getB())/2));
//        
    }
    
    public void Pour(Cup cup){
        double x=this.calories/volume;
        if (this.volume>0)
            {
            if(this.volume>=cup.capacity)
                        {
                cup.volume=cup.capacity;
                this.volume-=cup.capacity;
                this.calories=this.volume*x;
                cup.calories=cup.volume*x;
                        }
            else
                        {
                cup.calories=this.calories;
                cup.volume=this.volume;
                this.volume=0;
                this.calories=0;
                        }
            }
            this.contents="Empty";
    }
    
    public String getInfo(){        
        if (BlendDetector)
                    return "Volume = "+volume+"\n"+
                     "Calories = "+calories+"\n";
//                   "Color = "+colorblender.getR();
        else 
                    return "Contents ="+contents+"\n"+
                   "Volume = "+volume+"\n"+
                   "Calories = "+calories+"\n";
    }
    
}
