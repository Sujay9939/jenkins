public class calculator {

    public static void main(String[] args) {

        double a = 10;
        double b = 5;
        char op = '+';

        double result = 0;

        switch(op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
        }

        System.out.println("Result: " + result);
    }
}
