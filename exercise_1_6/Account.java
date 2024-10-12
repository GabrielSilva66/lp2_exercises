package exercise_1_6;

public class Account {
    private String ID;
    private String name;
    private int balance = 0;

    Account(String ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public Account(String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }


    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        return this.balance += amount;
    }

    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }

        return balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= balance){
            another.credit(amount);
            debit(amount);
        }
        else{
            System.out.println("Amount exceeded balance");
        }

        return balance;
    }
    


    @Override
    public String toString() {
        return "Account [id=" + ID + ",name=" + name + ",balance=" + balance + "]";
    }

    
}
