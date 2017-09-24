
package animalageservice;

public class CatAgeCalculator implements AnimalAgeCalculator {
    private double catAge;
    
    public CatAgeCalculator(double catAge){
        this.catAge = catAge;
    }
    
    @Override
    public double calculateHumanAge(double catAge){
        return catAge * 5.3;
    }
}
