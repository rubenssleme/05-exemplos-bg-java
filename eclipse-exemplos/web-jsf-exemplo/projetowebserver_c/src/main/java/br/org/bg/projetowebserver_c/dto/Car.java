package br.org.bg.projetowebserver_c.dto;
/*
* @autor Rubens Leme 
*/

public class Car {
 
    private String id;
    private int year;
    private String color;
    private String brand;

    public Car() {
    }
    
    
    public Car(String randomId, int randomYear, String randomColor, String randomBrand) {
      
        this.id = randomId;
        this.year = randomYear;
        this.color =  randomColor;
        this.brand = randomBrand;
        
    }
    
}
