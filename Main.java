class Main {
    public static void main(String[] args) {
        /*
         * *****
           *****
           *****
           *****
           *****
           For this Pattern Code Below.
         */

        /*
         * Tips When start Patterns using nested loops:
         * 1: Determine the rows
         * 2: Determine the Columns
         * 3:Whats write?
         * Outer loop is use for make rows
         * And inner loop is responsible for what print and other words make columns
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}