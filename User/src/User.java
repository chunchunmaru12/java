import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String dob;
    private String blood_group;
    private int age;
    private double weight; // in kilograms
    private double height; // in meters
    private List<String> log;

    public User(String name, String dob, String blood_group, int age, double weight, double height) {
        this.name = name;
        this.dob = dob;
        this.blood_group = blood_group;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.log = new ArrayList<>();
    }

    public void saveInfo() {
        System.out.println("User Info:");
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Blood Group: " + blood_group);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
    }

    public void saveLog(String entry) {
        log.add(entry);
    }

    public void viewLog() {
        System.out.println("Log Entries:");
        for (String entry : log) {
            System.out.println(entry);
        }
    }
}

