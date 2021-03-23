public class variableArguments {
    static void showList(int start, String... S) {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start + ". " + S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList(1, "Jayesh Soni", "Mayank Gupta", "Mohit Jain", "Shubhanshu Singhal");
    }
}