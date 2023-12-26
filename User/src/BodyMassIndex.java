public class BodyMassIndex {
    private User user;

    public BodyMassIndex(User user) {
        this.user = user;
    }

    public double calculateBMI() {
        // BMI formula: BMI = weight / (height * height)
        return user.weight / (user.height * user.height);
    }

    public void suggestDiet() {
        // You can implement your diet suggestion logic here based on the BMI or other factors.
        System.out.println("Suggested Diet: [Your diet suggestion goes here]");
    }

    public void suggestExercise() {
        // You can implement your exercise suggestion logic here based on the BMI or other factors.
        System.out.println("Suggested Exercise: [Your exercise suggestion goes here]");
    }

    public static void main(String[] args) {
        // Example usage
        User user = new User("John Doe", "1990-01-01", "A+", 33, 75.0, 1.80);
        user.saveInfo();

        BodyMassIndex bmiCalculator = new BodyMassIndex(user);
        double bmi = bmiCalculator.calculateBMI();
        System.out.println("Body Mass Index (BMI): " + bmi);

        bmiCalculator.suggestDiet();
        bmiCalculator.suggestExercise();
    }
}

5[=]