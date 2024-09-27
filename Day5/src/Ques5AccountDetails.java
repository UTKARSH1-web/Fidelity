import java.util.Scanner;

public class Ques5AccountDetails {
    private int id;
    private String AccountType ;
    private double balance;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getAccountType(){
        return AccountType;
    }
    public void setAccountType(String AccountType){
        this.AccountType = AccountType;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public Ques5AccountDetails(){}

    public Ques5AccountDetails(int id, String AccountType, double balance){
        this.id = id;
        this.AccountType = AccountType;
        this.balance = balance;
    }
    public boolean Withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
    public String GetDetails(){
        return "ID: " + id + "\nAccount Type: " + AccountType + "\nBalance: " + balance;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Ques5AccountDetails acc = new Ques5AccountDetails();

         System.out.println("Enter Account id: ");
         acc.setId(sc.nextInt());

         System.out.println("Enter Account Type: ");
         sc.nextLine();
         acc.setAccountType(sc.next());

         System.out.println("Enter balance: ");
         acc.setBalance(sc.nextDouble());

         System.out.println(acc.GetDetails());

         System.out.println("Enter amount to withdraw: ");
         double amount = sc.nextDouble();

         if (acc.Withdraw(amount)){
             System.out.println("New balance: " + acc.getBalance());
         }
         else {
             System.out.println("Insufficient balance");
         }
         sc.close();
    }
}
