/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author jaan_
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String name = "Lucy";
    
    
    public void printVariables(){
    System.out.println(maxSpeed);
    System.out.println(minSpeed);
    System.out.println(weight);
    System.out.println(isTheCarOn);
    System.out.println(condition);
     System.out.println(name);
    }
    public void upgradeMinSpeed(){
    minSpeed = maxSpeed;
    maxSpeed= maxSpeed+1;
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         Car familyCar = new Car();
         familyCar.printVariables(); 
         
         familyCar.upgradeMinSpeed();
    
         familyCar.printVariables();
    }
    
}
