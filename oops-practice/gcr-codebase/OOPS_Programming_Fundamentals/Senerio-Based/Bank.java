public class Bank {
    public static void main(String[] args) {
        BankAccount user1=new BankAccount(1,"Ankita Baghel",283474.34);
        BankAccount user2=new BankAccount(2,"Anupriya",28347344.34);
        BankAccount user3=new BankAccount(3,"Abc",2834.34);
        user1.getStatement();

    }
}

class BankAccount{
    int accountNumber;
    String holder;
    double balance;

    BankAccount(int accountNumber,String holder,double balance){
        this.accountNumber=accountNumber;
        this.holder=holder;
        this.balance=balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Sorry!! enter valid amount");
        }
        System.out.println("Your balance is now :"+balance);

    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Sorry!! enter valid amount");
        }
        System.out.println("Your balance is now:"+balance);
    }

    void getStatement(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holder);
        System.out.println("Balance: "+ balance);
    }

}