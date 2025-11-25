// class Calculator<T extends Number> {
//     public double add(T a, T b) {
//         return a.doubleValue() + b.doubleValue();
//     }
//     public double subtract(T a, T b) {
//         return a.doubleValue() - b.doubleValue();
//     }
//     public double multiply(T a, T b) {
//         return a.doubleValue() * b.doubleValue();
//     }
//     public double divide(T a, T b) {
//         if (b.doubleValue() == 0) {
//             throw new ArithmeticException("Division by zero not allowed");
//         }
//         return a.doubleValue() / b.doubleValue();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator<Integer> intCalc = new Calculator<>();
//         System.out.println("Integer Addition: " + intCalc.add(10, 5));
//         System.out.println("Integer Subtraction: " + intCalc.subtract(10, 5));
//         System.out.println("Integer Multiplication: " + intCalc.multiply(10, 5));
//         System.out.println("Integer Division: " + intCalc.divide(10, 5));

//         Calculator<Double> doubleCalc = new Calculator<>();
//         System.out.println("Double Addition: " + doubleCalc.add(10.5, 5.2));
//         System.out.println("Double Subtraction: " + doubleCalc.subtract(10.5, 5.2));
//         System.out.println("Double Multiplication: " + doubleCalc.multiply(10.5, 5.2));
//         System.out.println("Double Division: " + doubleCalc.divide(10.5, 5.2));
//     }
// }
