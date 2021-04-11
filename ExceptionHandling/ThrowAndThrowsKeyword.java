public class ThrowAndThrowsKeyword {

    static int meth1(int x, int y) throws Exception {
        if (x < 0 || y < 0) {
            throw new Exception("Length and Breadth must be +ve.");
        }
        int area = x * y;
        return area;
    }

    static void area() {
        try {
            int area = meth1(10, -20);
            System.out.println("Area = " + area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        area();
    }
}
