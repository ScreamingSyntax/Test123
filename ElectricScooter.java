
/**
 * Creating a subclass of Vehicle called Electric Scooter 
 * Electric Scooter is a Vehicle
 * @author (Aaryan Jha)
 */
public class ElectricScooter extends Vehicle{
    /* Declaring eight attributes of Electric Scooter as instance variables 
       and also declaring them private*/
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    /**
     * Creating a constructor that accepts six parameters 
     */
    public ElectricScooter(int vehicleID,String vehicleName,String vehicleWeight, String vehicleColor,String vehicleSpeed, int batteryCapacity)
    {
        //Calling super class contructor with four parameters
        super(vehicleID,vehicleName,vehicleWeight,vehicleColor);
        super.setVehicleSpeed(vehicleSpeed);    //Calling and setting the Vehicle speed from super class
        super.setVehicleColor(vehicleColor);    //Calling and setting the Vehicle color from super class
        this.batteryCapacity=batteryCapacity;   //Giving the value of parameter's batteryCapacity to our instance variable
        //Initializing instance variables
        this.range=0;
        this.price=0;
        this.brand="";
        this.mileage="";
        this.chargingTime="";
        this.hasPurchased=false;
        this.hasSold=false;
    }
    
    /*** Accessing private instance variables of Electric Scooter class using getter method 
     * and also returning them 
     */
     
    public int getRange()
    {
        return this.range;
    }
    public int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getChargingTime()
    {
        return this.chargingTime;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public String getMileage()
    {
        return this.mileage;
    }
    public boolean getHasPurchased()
    {
        return this.hasPurchased;
    }
    public boolean getHasSold()
    {
        return this.hasSold;
    }
    
    /**
     *  Using setter method to access and set new Brand
     */
    public void setBrand(String brand)
    {
        //Checking the purchase status of Electric Scooter
        if(!this.getHasPurchased())
        {
            this.brand=brand;
        }
        else
        {
            System.out.println("It is not possible to change the brand");
        }
    }
    
    /**
     * Creating a purchase method that takes five parameters
     */
    public void purchase(String brand,int price,String chargingTime,String mileage,int range)
    {
        //Checking if the scooter is purchased or not
        if(!this.getHasPurchased())
        {
            this.setBrand(brand);// Using setter method to set the brand
            //Initializing these values with instance variables
            this.price=price;
            this.chargingTime=chargingTime;
            this.mileage=mileage;
            this.range=range;
            this.hasPurchased=true;
        }
    }
    /**
     * Creating a sell method to check whether the Electric Scooter is sold or not
     */
    public void sell(int price)
    {
        if(this.getHasSold()==false)
        {
            this.price=price;
            this.chargingTime="";
            this.mileage="";
            this.batteryCapacity=0;
            this.range=0;
            this.hasSold=true;
            this.hasPurchased=false;
        }
        else
        {
            System.out.println("The scooter is already sold");
        }
    }
    
    /**
     * Creating a display to display the details of the electric scooter 
     */
    public void display()
    {
        super.display(); //Displaying the display method from super class
        if(this.getHasPurchased()==true)
        {
            System.out.println("The brand of the Electric Scooter"+" "+this.getBrand());
            System.out.println("The battery capacity of the Electric Scooter"+" "+this.getBatteryCapacity());
            System.out.println("The mileage of the Electric Scooter"+" "+this.getMileage());
            System.out.println("The range of the Electric Scooter"+" "+this.getRange());
            System.out.println("The recharge time of the Electric Scooter"+" "+this.getChargingTime());
        }
    }//display closed
}//class closed