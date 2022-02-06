/**
 * Written by Heidi Duncan
 */
package FactoryDesign;

import java.util.ArrayList;

/**
 * The methods responsiple for passing the information through and displaying the elements to each car.
 */
public abstract class Car {

    String make;
    String model;
    protected ArrayList<Accessory> accessories = new ArrayList<Accessory>();

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void assemble()
    {
       addFrame();
       addWheels();
       addEngine();
       addWindows();
       addAccessories();
       displayAccessories();
    }

    public abstract void addFrame();
    
    public void addWheels()
    {
        System.out.println("Adding the Wheels");
    }
    public void addEngine()
    {
        System.out.println("Adding a Standard Engine");
    }
    public void addWindows()
    {
        System.out.println("Adding Windows");
    }

    public abstract void addAccessories();

    /**
     * @see displayAccessories  Puts the ArrayList into the desired list thats one after another not side-by-side.
     * @see Car                 Holds the ArrayList and declears the varibles
     * 
     */
    public void displayAccessories()
    {

        System.out.println("Accessories:");
        for(Accessory accessory : accessories)
       {
           System.out.println(" - "+accessory);
       }
    }

}
