package task4_rout;

public class Account {

    private int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account() {
        balance = 0;

    }

    public int getId() {
        return id;
    }


    public int getBalance() {
        return balance;
    }

    public int deposite(int amount) {
        balance = balance + amount;
        return balance;
    }

    public int withDraw(int amount) {//100  500
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("balance after withDraw =" + balance);
        } else {
            System.out.println("your balance is less then " + amount);
        }
        return balance;
    }

    public int TransferTo(int amount, Account father, Account dauter) {
        if (father.balance >= amount) {
            father.balance = father.balance - amount;
            dauter.balance = dauter.balance + amount;
            System.out.println("Successfully tranferd");
        } else {
            System.out.println("transfer is faild");
        }
        return father.balance;//100
    }

}
