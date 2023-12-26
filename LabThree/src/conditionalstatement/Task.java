package conditionalstatement;

public class Task {
    public static void main(String[] args) {
        String color="red";
        switch (color){
            case "red":
                System.out.println("rose");
                break;
            case "blue":
                System.out.println("water");
                break;
            case "pink":
                System.out.println("girl");
                break;
            case "yellow":
                System.out.println("bumblebee");
            default:
                System.out.println("invalid");
                break;
        }
    }
}
