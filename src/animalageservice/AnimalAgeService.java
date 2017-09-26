
package animalageservice;

public class AnimalAgeService {
    private AnimalAgeCalculator animalAgeCalculator;
    
    public AnimalAgeService (AnimalAgeCalculator animalAgeCalculator){
        this.setAnimalAgeCalculator(animalAgeCalculator);
    }
    
    public final AnimalAgeCalculator getAnimalAgeCalculator(){
        return animalAgeCalculator;
    }
    
    public final void setAnimalAgeCalculator(AnimalAgeCalculator animalAgeCalculator){
        if (animalAgeCalculator == null){
            throw new IllegalArgumentException("No animal age calculator provided.");
        }
        else{
            this.animalAgeCalculator = animalAgeCalculator;
        }
    }
    
    public final double calculateHumanAge(double animalAge){
        return animalAgeCalculator.calculateHumanAge(animalAge);
    }
}
