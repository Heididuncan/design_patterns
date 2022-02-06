/**
 * Written by Heidi Duncan
 */
package FactoryDesign;

public class SedanCar extends Car {

    public SedanCar(String make, String model)
    {
        super(make, model);
    }
    /**
     * @see addFrame        Method displays discription for Sadan frame
     */
    @Override
    public void addFrame() {
        System.out.println("Adding a three part frame");
        
    }

    @Override
    public void addAccessories() {
        Accessory one = Accessory.FLOOR_MATTS;
        Accessory two = Accessory.PHONE_CHARGER;
        Accessory three = Accessory.BACK_UP_CAMERA;
        Accessory four = Accessory.EXTRA_CUP_HOLDERS;
        Accessory five = Accessory.HEATED_SEATS;

        accessories.add(one);
        accessories.add(two);
        accessories.add(three);
        accessories.add(four);
        accessories.add(five);
        
        
        
    }
    
}
