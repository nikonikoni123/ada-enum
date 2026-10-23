package Enum;
import java.util.Scanner;

class input {
    private final Scanner scanner = new Scanner(System.in);
    private double value;

    protected void getInput() {
        value = scanner.nextDouble();
    } 

    protected double getValue() {
        return getValueInRange(0.0, 5.0);
    }

    protected double getPercentage() {
        return getValueInRange(0.0, 100.0);
    }

    private double getValueInRange(double minimum, double maximum) {
        while (true) {
            getInput();
            if (value >= minimum && value <= maximum) {
                return value;
            }
            System.out.println("Error al ingresar dato, ingrese nuevamente:");
        }
    }

    protected int getNotes() {
        int n = scanner.nextInt();
        return n;
    }
}
