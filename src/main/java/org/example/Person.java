package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String hairColor;
    String eyesColor;
    double height;

    public Person(String fi, String last, int agep){
        firstName=fi;
        lastName=last;
        age=agep;
    }
    public Person(String fi, String last, int agep,String hC, String eC,double he){
        this(fi,last,agep);
        hairColor=hC;
        eyesColor=eC;
        height=he;
    }
    public String getFirstName(){
       return firstName;
    }
    public String getLastName (){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public Boolean isTeen(){
        if(age>=13 && age<=19){
            return true;
        }
        return false;
    }
}
