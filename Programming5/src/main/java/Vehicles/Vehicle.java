package Vehicles;

import java.time.LocalDateTime;

public class Vehicle {
    private Long id;
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDateTime creationDate;
    private Integer enginePower;
    private Long numberofWheels;
    private float fuelConsumption;
    private VehicleType type;

    public Vehicle(Long id, String name, Coordinates coordinates, LocalDateTime creationDate, Integer enginePower,
                   Long numberofWheels, float fuelConsumption, VehicleType type ) {
        this.id = id ;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.enginePower = enginePower;
        this.numberofWheels = numberofWheels;
        this.fuelConsumption = fuelConsumption;
        this.type= type;

    }

    public Long getId(){return id;}
    public String getName(){ return name;}
    public Coordinates getCoordinates(){return coordinates;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public Integer getEnginePower(){return enginePower;}
    public Long getNumberofWheels(){return numberofWheels;}
    public float getFuelConsumption(){return fuelConsumption;}
    public VehicleType getType(){return type;}

}
