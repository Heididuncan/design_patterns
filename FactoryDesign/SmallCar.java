/**
 * Written by Heidi Duncan
 */
package FactoryDesign;

public class SmallCar extends Car {
    
    public SmallCar(String make, String model)
    {
        super(make, model);
    }

    @Override
    public void addFrame() {
        System.out.println("Adding a small frame");
        
    }

    @Override
    public void addAccessories() {
        
       Accessory one = Accessory.FLOOR_MATTS;
       Accessory two = Accessory.PHONE_CHARGER;
       accessories.add(one);
       accessories.add(two);
         
    }
}
