import java.lang.*;

class Outer {
    String fName = "JAYESH";

    class Inner {
        String lName = "SONI";

        void innerDisplay() {
            System.out.print(fName);
            System.out.print(" " + lName);
        }
    }

    void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.lName);
    }
}

class nestedInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        // Object Creation to access members of inner class directly
        Outer.Inner i = new Outer().new Inner();
    }
}