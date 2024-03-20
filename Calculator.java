public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
    
    public double add(double x, double y) {
        return x + y;
    }
    
    public int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.5, 2.5));
        System.out.println(calculator.add(1, 2, 3));
    }
}




