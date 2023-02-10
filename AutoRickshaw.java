
/**
 * Creating a subclass of Vehicle called AutoRickshaw
 * AutoRickshow is a Vehicle
 * @author (Aaryan Jha)
 */
public class AutoRickshaw extends Vehicle {
    /* Declaring eight attributes of AutoRickshaw as instance variables 
       and also declaring them private*/
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
    
    /**
     * Passing nine parameters in Constructor
     */  
    public AutoRickshaw(int vehicleID, String vehicleName,String vehicleColor,String vehicleWeight,String vehicleSpeed,int engineDisplacement,String torque,
    int fuelTankCapacity,String groundClearance)
    {
        //Calling superclass constructor with four parameters
        super(vehicleID, vehicleName, vehicleWeight, vehicleColor);
        //Assigning the values of parameters to instance variable
        this.engineDisplacement=engineDisplacement;
        this.torque=torque;
        this.fuelTankCapacity=fuelTankCapacity;
        this.groundClearance=groundClearance;   
        super.setVehicleColor(vehicleColor);
        super.setVehicleSpeed(vehicleSpeed);
        this.isBooked=false;     
    }//constructor closed
    
    /** Accessing private instance variables of Auto Rickshaw class using getter method 
     *  and also returning them
     */
    public int getEngineDisplacement()
    {
        return this.engineDisplacement;
    }
    public String getTorque()
    {
        return this.torque;
    }
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
    public int getFuelTankCapacity()
    {
        return this.fuelTankCapacity;
    }
    public String getGroundClearance()
    {
        return this.groundClearance;
    }
    public int getChargeAmount()
    {
        return this.chargeAmount;
    }
    public String getBookedDate()
    {
        return this.bookedDate;
    }
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
    //Using setter method to access and set new Charge Amount
    public void setChargeAmount(int chargeAmount)
    {
        this.chargeAmount=chargeAmount;
    }
    //Using setter method to access and set new Number of Seats
    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats=numberOfSeats;
    }
    
    /** 
     * Creating a book method with three parameters to check if the AutoRickshaw is booked or not
     */
    public void book(String bookedDate,int chargeAmount,int numberOfSeats)
    {
        if(!this.getIsBooked())
        {
            this.bookedDate=bookedDate;
            this.chargeAmount=chargeAmount;
            this.numberOfSeats=numberOfSeats;
            this.isBooked=true;
            System.out.println("The vehicle"+" "+getVehicleID()+" "+"is booked ");
        }
        else
        {
            System.out.println("AutoRickshaw is already booked"+" "+this.isBooked);
        }
        
    }//book closed
    /** 
     * Using display method to display all the values 
     * also using void so that the method should not return a value
     */
    public void display()
    {
        super.display(); //Displaying display method of super class Vehicle
        if(this.getIsBooked()==true)
        {
            System.out.println("The Engine Displacement of vehicle is"+" "+this.getEngineDisplacement());
            System.out.println("The Torque of vehicle is"+" "+this.getTorque());
            System.out.println("The Fuel Tank Capacity is"+" "+this.getFuelTankCapacity());
            System.out.println("The Ground Clearance is"+" "+this.getGroundClearance());
            System.out.println("The Booked Date is"+" "+this.getBookedDate());
            
            /* Using if statement to check if Charge amount is empty
             * if it's empty then the empty message is displayed*/
            if(this.getChargeAmount()==0)
            {
                System.out.println("The charge amount is not given");
            }
            else
            {
                System.out.println("The charge amount is"+" "+this.getChargeAmount());
            }
             /* Using if statement to check if our Number of seats is empty
             * if it's empty then the empty message is displayed*/
            if(this.getNumberOfSeats()==0)
            {
                System.out.println("The number of seats is not given");
            }
            else
            {
                System.out.println("The number of seats are"+" "+this.getNumberOfSeats());
            }
        }
    }//display closed
}//class closed

