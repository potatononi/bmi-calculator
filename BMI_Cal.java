// PROGRAM: BMI CALCULATOR
import javax.swing.JOptionPane;
/*
* BMI Formula:  BMI = weight (kg) / (height (m) * height (m))
* CATEGORIES
* > OVERWEIGHT
* > NORMAL
* > UNDERWEIGHT
* > OBESE
*/
public class BMI_Cal {
    public static void main(String[] args) {

        // Input Dialog for weight
        String weightInput = JOptionPane.showInputDialog(
                "Enter your weight in kilograms(kg): ");

        // Input Dialog for height
        String heightInput = JOptionPane.showInputDialog(
                "Enter your height in meters(m) (example = 1.70m (5'7)): ");

        // Convert String inputs to double values
        double weight = Double.parseDouble(weightInput);
        double height = Double.parseDouble(heightInput);

        // This is to compute BMI using arithmetic operators (* and /)
        double bmi = weight / (height * height);

        // Variable to hold the health category
        String category;

        // Conditional statements using relational operators (>=) (if-else else-if)
        if (bmi < 18.5) {
            category = "You are Underweight.";
        } else if (bmi <= 24.9) {
            category = "You are Normal.";
        } else if (bmi <= 29.9) {
            category = "You are Overweight.";
        } else {
            category = "You are Obese.";
        }

        // Round BMI to 2 decimal places for display
        String bmiFormatted = String.format("%.2f", bmi);

        // This is to display the final result
        JOptionPane.showMessageDialog(null,
                "Weight: " + weight + " kg\n" +
                        "Height: " + height + " m\n" +
                        "Your BMI is: " + bmiFormatted + "\n" +
                        "Health Category: " + category);
    }
}