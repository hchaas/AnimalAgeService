
package animalageservice;

public class AnimalAgeService {
    private AnimalAgeCalculator animalAgeCalculator;
    
    public AnimalAgeService (AnimalAgeCalculator animalAgeCalculator){
        this.animalAgeCalculator = animalAgeCalculator;
    }
    
    public double calculateHumanAge(double animalAge){
        return animalAgeCalculator.calculateHumanAge(animalAge);
    }
}
