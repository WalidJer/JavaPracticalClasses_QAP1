public class TestDate {
    public static void main(String[] args) {
        Date D1= new Date(9, 1, 1990);

       
        System.out.println("=============DATE TEST PROGRAM===========");
        System.out.println();
        System.out.println("Created a Date object: " + D1);
        System.out.println();

        System.out.println("========= Extra Testing for Date =========");
        // Test setDay()
       
        System.out.println("Test: setDay(20)");
        System.out.println("----------------");
        System.out.println("Before: " + D1);
        D1.setDay(20);
        System.out.println("After : " + D1);
        System.out.println(); 

        // Test setMonth()
        System.out.println("------------------------------------------");
        System.out.println("Test: setMonth(12)");
        System.out.println("----------------");
        System.out.println("Before: " + D1);
        D1.setMonth(12);
        System.out.println("After : " + D1);
        System.out.println();

        // Test setYear()
        System.out.println("------------------------------------------");
        System.out.println("Test: setYear(2025)");
        System.out.println("----------------");
        System.out.println("Before: " + D1);
        D1.setYear(2025);
        System.out.println("After : " + D1);
        System.out.println();

        // Test setDate()
        System.out.println("------------------------------------------");
        System.out.println("Test: setDate(1, 1, 2000)");
        System.out.println("----------------");
        System.out.println("Before: " + D1);
        D1.setDate(1, 1, 2000);
        System.out.println("After : " + D1);
        System.out.println("------------------------------------------");

    }
    
}
