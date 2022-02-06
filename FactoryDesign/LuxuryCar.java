/**
 * Written by Heidi Duncan
 */
package FactoryDesign;


public class LuxuryCar extends Car {
    
    public LuxuryCar(String make, String model)
    {
        super(make, model);
    }
/**
 * @see addFrame        Method displays discription for Luxury frame
 * @see addEngine       Method displays discription for Luxury engine
 * @see addAccessories  Method that adds every Accessory in the Accessory Emuneration for the LuxuryCar Class.
 */
    @Override
    public void addFrame() {
        
        System.out.println("Adding a beautiful frame");
    }

    @Override
    public void addEngine()
    {
        System.out.println("Adding a Supped Up Engine");
    }

    @Override
    public void addAccessories() {
        
        Accessory one = Accessory.FLOOR_MATTS;
        Accessory two = Accessory.PHONE_CHARGER;
        Accessory three = Accessory.BACK_UP_CAMERA;
        Accessory four = Accessory.EXTRA_CUP_HOLDERS;
        Accessory five = Accessory.HEATED_SEATS;
        Accessory six = Accessory.SPORTS_SEATS;
        Accessory seven = Accessory.WINDOW_TINT;
        Accessory eight = Accessory.HIGH_END_SOUND;
        Accessory nine = Accessory.TRUNK_ORGANIZER;
        Accessory ten = Accessory.BLUE_TOOTH;

        accessories.add(one);
        accessories.add(two);
        accessories.add(three);
        accessories.add(four);
        accessories.add(five);
        accessories.add(six);
        accessories.add(seven);
        accessories.add(eight);
        accessories.add(nine);
        accessories.add(ten);
        
    }
}
