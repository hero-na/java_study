public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int newBalance){
        balance = newBalance;
    }
    public int getBalance(){
        return balance;
    }
    public void setOwner(Person newOwner){
        owner = newOwner;
    }
    public Person getOwner(){
        return owner;
    }

    boolean deposit(int amount){
        if (amount < 0 || owner.getCashAmount() < amount){
            System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
            System.out.println("false");
            return false;
        }
        else{
            balance += amount;
            owner.setCashAmount(owner.getCashAmount()-amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;

        }
    }
    boolean withdraw(int amount){
        if ( amount < 0 || getBalance() < amount) {
            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
            System.out.println("false");
            return false;
        }
        else{
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount()+amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: "+ balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }
    }

    public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.owner.getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }

    // account와 account 간의 거래이므로, Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

}