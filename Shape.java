public class Shape {
    public void draw() {
        System.out.println("Menggambar bentuk umum.");
    }
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Menggambar lingkaran.");
    }
    
    public void draw(int x, int y, int radius) {
        System.out.println("Menggambar lingkaran dengan titik tengah (" + x + ", " + y + ") dan radius " + radius + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Circle circle1 = new Circle();
        shape1.draw();
        circle1.draw();
        circle1.draw(0, 0, 5);
    }
}


