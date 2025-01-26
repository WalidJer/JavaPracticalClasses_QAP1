public class TestAccount {
    public static void main(String[] args) {
        
        System.out.println("============= TESTING ACCOUNT CLASS =============");
        
        // 1. Create two accounts
        Account Acc1 = new Account("A001", "Walid Jer", 5000);
        Account Acc2 = new Account("A002", "Matt Dan", 4000);

        System.out.println("\n--- INITIAL ACCOUNTS ---");
        System.out.println("Acc1: " + Acc1);
        System.out.println("Acc2: " + Acc2);

        System.out.println("\n--- BALANCES BEFORE TRANSFER ---");
        System.out.println("Balance of " + Acc1.getName() + " (" + Acc1.getID() + ") = $" + Acc1.getBalance());
        System.out.println("Balance of " + Acc2.getName() + " (" + Acc2.getID() + ") = $" + Acc2.getBalance());

        // 2. Transfer $1000 from Acc1 to Acc2
        System.out.println("\nTransferring $1000 from " + Acc1.getID() + " to " + Acc2.getID() + "...");
        Acc1.transferTo(Acc2, 1000);

        System.out.println("\n--- BALANCES AFTER TRANSFER ---");
        System.out.println("Balance of " + Acc1.getName() + " (" + Acc1.getID() + ") = $" + Acc1.getBalance());
        System.out.println("Balance of " + Acc2.getName() + " (" + Acc2.getID() + ") = $" + Acc2.getBalance());

        System.out.println("\n=================== END OF TEST ===================");
    }
}
