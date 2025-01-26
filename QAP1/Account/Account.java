public class Account{
    // Attributes
    private String id;
    private String name;
    private int balance;
    //Constructors
    public Account(String id, String name){
        this.id = id;
        this.name = name;

    }

    public Account(String id, String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance; 

    }
    //Behaviours/Methods

    public String getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }

//Credit Method
    public int credit(int amount){
       this.balance = this.balance + amount;
       // Return the new Balance
       return this.balance;

    }

// Debit Method
    public int debit(int amount){
        if (amount <= this.balance){

            this.balance-=amount;
            return this.balance;
        }else{
            this.balance-=amount;

            System.out.println("Ammount exceeded balance");
            return this.balance;
        }
        
    }

    public int transferTo(Account another, int amount){


        if (amount <= another.balance){

            this.balance -= amount;
            another.balance += amount;
            
        }else{
            

            System.out.println("Ammount exceeded balance");
            
        }
        return this.balance;
    }

    public String toString(){
        return "Account[" + "id=" + id + ", " + "name=" + name + ", " + "balance=" + balance + "]";
    }
} 