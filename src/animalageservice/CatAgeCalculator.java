
package animalageservice;

public class CatAgeCalculator implements AnimalAgeCalculator {
    private double catAge;
    
    public CatAgeCalculator(double catAge){
        this.catAge = catAge;
    }
    
    //this method assumes the average cat age is 15 and the average human age is 79
    @Override
    public double calculateHumanAge(double catAge){
        return catAge * 5.3;
    }
}
