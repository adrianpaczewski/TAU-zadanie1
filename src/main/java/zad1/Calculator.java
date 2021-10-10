package zad1;

public class Calculator {

    long calculate(long a, long b, OperationType operationType) {

        return switch (operationType) {

            // performs addition between numbers
            case ADD -> a + b;

            // performs subtraction between numbers
            case SUBTRACT -> a - b;

            // performs multiplication between numbers
            case MULTIPLY -> a * b;

            // performs division between numbers
            case DIVIDE -> a / b;
            default -> throw new IllegalStateException("Invalid operation: " + operationType);
        };

    }
}
