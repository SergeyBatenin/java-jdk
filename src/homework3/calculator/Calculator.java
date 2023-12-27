package homework3.calculator;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T firstOperand, V secondOperand) {
        return firstOperand.doubleValue() + secondOperand.doubleValue();
    }
    public static <T extends Number, V extends Number> double subtract(T firstOperand, V secondOperand) {
        return firstOperand.doubleValue() - secondOperand.doubleValue();
    }
    public static <T extends Number, V extends Number> double divide(T firstOperand, V secondOperand) {
        if (secondOperand.doubleValue() == 0) throw new ArithmeticException("Divide by zero");
        return firstOperand.doubleValue() / secondOperand.doubleValue();
    }
    public static <T extends Number, V extends Number> double multiply(T firstOperand, V secondOperand) {
        return firstOperand.doubleValue() * secondOperand.doubleValue();
    }
}
