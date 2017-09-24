
package animalageservice;

public class RabbitAgeCalculator implements AnimalAgeCalculator{
    private double rabbitAge;
    
    public RabbitAgeCalculator(double rabbitAge){
        this.rabbitAge = rabbitAge;
    }
    
    //this method assume the average rabbit age is 9 and the average human age is 79
    @Override
    public double calculateHumanAge(double rabbitAge){
        return rabbitAge * 8.8;
    }
}
