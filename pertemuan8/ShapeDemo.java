public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0, "Merah", true);

        System.out.println("----- Rectangle -----");
        System.out.println("Warna \t: " + rectangle.getColor());
        System.out.println("Tinggi \t: " + rectangle.getLength());
        System.out.println("Lebar \t: " + rectangle.getWidth());
        System.out.println("Luas \t: " + rectangle.getArea());
        System.out.println();

        Circle circle = new Circle(7.0, "Kuning", true);

        System.out.println("------- Circle -------");
        System.out.println("Warna \t: " + circle.getColor());
        System.out.println("Radius \t: " + circle.getRadius());
        System.out.println("Luas \t: " + circle.getArea());
        System.out.println("Keliling: " + circle.getPerimeter());
        System.out.println();

        Square square = new Square(5.0, "Putih", true);

        System.out.println("------- Square -------");
        System.out.println("Warna \t: " + square.getColor());
        System.out.println("Sisi \t: " + square.getSide());
        System.out.println("Luas \t: " + square.getArea());
        System.out.println("Keliling: " + square.getPerimeter());
    }
}