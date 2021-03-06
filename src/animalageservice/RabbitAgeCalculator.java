package animalageservice;

public class RabbitAgeCalculator implements AnimalAgeCalculator {

    private double rabbitAge;

    public RabbitAgeCalculator(double rabbitAge) {
        this.setRabbitAge(rabbitAge);
    }

    public final double getRabbitAge() {
        return rabbitAge;
    }

    public final void setRabbitAge(double rabbitAge) {
        if (rabbitAge < 0) {
            throw new IllegalArgumentException("Inavlid entry; age must be greater than 0.");
        } else {
            this.rabbitAge = rabbitAge;
        }
    }

    //this method assume the average rabbit age is 9 and the average human age is 79
    @Override
    public final double calculateHumanAge(double rabbitAge) {
        return rabbitAge * 8.8;
    }
}
