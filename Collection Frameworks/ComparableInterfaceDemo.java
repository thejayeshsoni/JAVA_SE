import java.util.TreeSet;

class Point implements Comparable {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }

    @Override /* This method is used to compare the objects of same class */
    public int compareTo(Object object) {
        Point p = (Point) object;
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else {
            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        TreeSet<Point> treeSet = new TreeSet<>(); /*
                                                   * This TreeSet class doesn't know about how to store the Point class
                                                   * objects as sorted order because Treeset Class stores information in
                                                   * sorted order, Thus we have used Comparable interface.
                                                   */
        treeSet.add(new Point(1, 1));
        treeSet.add(new Point(5, 5));
        treeSet.add(new Point(5, 2));

        System.out.println(treeSet);
    }
}
