
package animalageservice;

public class CatAgeCalculator implements AnimalAgeCalculator {
    private double catAge;
    
    public CatAgeCalculator(double catAge){
        this.setCatAge(catAge);
    }
    
    public double getCatAge(){
        return catAge;
    }
    
    public final void setCatAge(double catAge){
        if (catAge < 0){
            throw new IllegalArgumentException("Invalid entry; age must be greater than 0.");
        }
        else{
            this.catAge = catAge;
        }
    }
    
    //this method assumes the average cat age is 15 and the average human age is 79
    @Override
    public double calculateHumanAge(double catAge){
        return catAge * 5.3;
    }
}
