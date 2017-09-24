
package animalageservice;

public class RabbitAgeCalculator implements AnimalAgeCalculator{
    private double rabbitAge;
    
    public RabbitAgeCalculator(double rabbitAge){
        this.rabbitAge = rabbitAge;
    }
    
    @Override
    public double calculateHumanAge(double rabbitAge){
        return rabbitAge * 8.8;
    }
}
