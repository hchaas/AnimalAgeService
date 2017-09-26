
package animalageservice;

public class DogAgeCalculator implements AnimalAgeCalculator{
    private double dogAge;
    
    public DogAgeCalculator(double DogAge){
        this.setDogAge(DogAge);
    }
    
    public double getDogAge(){
        return dogAge;
    }
    
    public final void setDogAge(double dogAge){
        if (dogAge <0){
            throw new IllegalArgumentException("Inavlid entry; age must be greater than 0.");
        }
        else{
            this.dogAge = dogAge;
        }
    }
    
    //this method assumes the average dog age is 12 and the average human age is 79
    @Override
    public double calculateHumanAge(double dogAge){
        return dogAge * 6.6;
    }
}
