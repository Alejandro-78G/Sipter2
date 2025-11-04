package Calculadora;

public class operaciones {
    public double operar(double num1, double num2, String operador) {
        switch (operador) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 != 0) return num1 / num2;
                else throw new ArithmeticException("División entre cero");
            default: return 0;
        }
    }

}
