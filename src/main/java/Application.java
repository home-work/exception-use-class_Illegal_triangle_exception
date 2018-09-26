public class Application {
    public static void main(String[] args) {
        checkTriangle(3,4,9);
    }

    public static void checkTriangle(int a, int b, int c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException("Not a triangle!");
            } else {
                System.out.println("Is a Triangle!");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}
