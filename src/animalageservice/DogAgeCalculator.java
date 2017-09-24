
package animalageservice;

public class DogAgeCalculator implements AnimalAgeCalculator{
    private double dogAge;
    
    public DogAgeCalculator(double DogAge){
        this.dogAge = dogAge;
    }
    
    @Override
    public double calculateHumanAge(double dogAge){
        return dogAge * 6.5;
    }
}
