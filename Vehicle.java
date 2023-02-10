
/**
 * Creating a java program that describes a Vehicle.
 * Vehicle has many attributes
 * @author (Aaryan Jha)
 */
public class Vehicle
{
    /* Declaring five attributes of vehicle as instance variables 
       and also declaring them private*/ 
    private int vehicleID;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;
    /**
     * Creating constructors of Vechicle class and adding suitable parameters 
     */
    public Vehicle(int vehicleID,String vehicleName,String vehicleWeight,String vehicleColor)
    {
        //Using this keyword to initialize the values of the instance variables with the parameter's variable
        this.vehicleID=vehicleID;
        this.vehicleName=vehicleName;
        this.vehicleWeight=vehicleWeight;
        this.vehicleColor=vehicleColor;
    }
    /**
     * Using getter method to access private instance variable
     * and also returning them 
     */ 
    public int getVehicleID() 
    {
        return this.vehicleID;
    }
    public String getVehicleName() 
    {
        return this.vehicleName;
    }
    public String getVehicleWeight() 
    {
        return this.vehicleWeight;
    }
    public String getVehicleColor() 
    {
        return this.vehicleColor;
    }
    public String getVehicleSpeed() 
    {
        return this.vehicleSpeed;
    }
    /**
     * Using setter method to access private instance variables
     * and also initializing those variables
     */
    public void setVehicleColor(String vehicleColor) 
    {
        this.vehicleColor = vehicleColor;
    }
    public void setVehicleSpeed(String vehicleSpeed) 
    {
        this.vehicleSpeed = vehicleSpeed;
    }
    /** Using display method to display all the returned values 
     * also using void so that the method should not return a value
     */
    public void display()
    {
        System.out.println("The vehicle is"+" "+this.getVehicleID());
        System.out.println("The name of the vehicle is"+" "+this.getVehicleName());
        System.out.println("The color of the following vehicle"+" "+this.getVehicleColor());
        System.out.println("The speed of the vehicle is"+" "+this.getVehicleSpeed());
        /* Using if statement to check if our vehicleWeight is empty
         * if it's empty then the empty message is displayed*/
        if(this.getVehicleWeight().equals(""))
        {
        System.out.println("The weight of the vehicle is given empty");
        }
        else
        {
            System.out.println("The weight of the vehicle is"+" "+this.getVehicleWeight());
        }
    }

}