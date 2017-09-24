
package animalageservice;

public class Startup {

    public static void main(String[] args) {
        
        AnimalAgeCalculator animalAge = new CatAgeCalculator(10);       
        AnimalAgeService animalAgeService = new AnimalAgeService(animalAge);
        double humanAge = animalAgeService.calculateHumanAge(10);
        
        System.out.println("The human age equivalent of this animal is " + humanAge + " years.");
    }
    
}
