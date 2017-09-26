package animalageservice;

public class RabbitAgeCalculator implements AnimalAgeCalculator {

    private double rabbitAge;

    public RabbitAgeCalculator(double rabbitAge) {
        this.setRabbitAge(rabbitAge);
    }

    public double getRabbitAge() {
        return rabbitAge;
    }

    public void setRabbitAge(double rabbitAge) {
        if (rabbitAge < 0) {
            throw new IllegalArgumentException("Inavlid entry; age must be greater than 0.");
        } else {
            this.rabbitAge = rabbitAge;
        }
    }

    //this method assume the average rabbit age is 9 and the average human age is 79
    @Override
    public double calculateHumanAge(double rabbitAge) {
        return rabbitAge * 8.8;
    }
}
