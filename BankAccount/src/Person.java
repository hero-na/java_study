public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public void setAge(int newAge){
        if(newAge >= 0){
            this.age = newAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getCashAmount(){
        return cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount(){
        return account;
    }

    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    // account와 account 간의 거래이므로, BankAccount 클래스의 transfer 메소드를 써야함.
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
