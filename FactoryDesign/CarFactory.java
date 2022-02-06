/**
 * Written by Heidi Duncan
 */
package FactoryDesign;

/**
 * The methods below take the information coming from CarStore as called and sort it into the approiate
 * class so the right functions are applied.
 */

public class CarFactory {

    Car car;

    public CarFactory(Car car)
    {
        this.car = car;
    }
        
    /**
     * 
     * @param type    A string that will decide which if Statement function will be applied and class the car 
     *                falls in
     * @param make    A string that is displayed for the Title of what car name is being made
     * @param model   A string that is displayed for the Title of what car name is being made
     * @return        returns the car desired with accessories specified based on the type
     * 
     */
    
    public static Car createCar(String type, String make, String model)
    {
        
         Car car;
       
        if(type.equals("small"))
        {           
            car = new SmallCar(make, model);
            System.out.println("Creating a "+make+" "+model);
            car.assemble();
            
        }
        else if(type.equals("sedan"))
        {
            car = new SedanCar(make, model);
            System.out.println("Creating a "+make+" "+model);
            car.assemble();
        }
        else
        {
            car = new LuxuryCar(make, model);
            System.out.println("Creating a "+make+" "+model);
            car.assemble();
        }
        return car;
        
    } 

 
}
