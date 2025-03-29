package basic.oop1.ex;

public class Account {
    int balance;
    int deposit(int amount){
        balance+=amount;
        return balance;
    }
    int withdraw(int amount) {
        if(amount>balance){
            System.out.println("잔액 부족");
        }else{
            balance-=amount;
        }
        return balance;
    }
}
