public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects (t1 and t2).
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set initial times for t1 and t2.
        t1.setTime(21, 10, 15);  // 9:10:15 PM
        t2.setTime(10, 20, 25);  // 10:20:25 AM

        // Section header for clarity
        System.out.println();
        System.out.println("============INITIAL STATES===========");
        System.out.println("t1 = " + t1); 
        System.out.println("t2 = " + t2);

        // Perform nextSecond() on t1 and previousSecond() on t2
        t1.nextSecond();
        t2.previousSecond();

        // Section header for clarity
        System.out.println("============AFTER CHANGES============");
        System.out.println("t1 (after nextSecond) = " + t1);
        System.out.println("t2 (after previousSecond) = " + t2);

        // Another separation line or section if desired
       
        System.out.println("=================End================= ");
        System.out.println();
    }
}
