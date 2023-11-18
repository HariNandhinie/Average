public class Average {

    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            double average = (num1 + num2) / 2.0;
            System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please provide two valid numbers.");
            e.printStackTrace();
        }
    }
}
