class Outer {
    void Display() {
        class Inner {
            void innerDisplay() {
                System.out.println("JAYESH SONI");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Display();
    }
}
