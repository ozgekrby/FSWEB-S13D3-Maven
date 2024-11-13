package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double wi, double he){
         width=wi;
         height=he;
    }
    public double getWidth (){
        return width;
    }
    public double getHeight  (){
        return height;
    }
    public void setWidth (double wi){
        if(wi<0){
            this.width=0;
        }else{
            this.width=wi;
        }
    }
    public void setHeight (double he){
        if(he<0){
            this.height=0;
        }else{
            this.height=he;
        }
    }
    public double getArea   (){
        return height*width;
    }
}
