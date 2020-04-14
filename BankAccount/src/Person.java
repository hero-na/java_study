public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;


    public Person (String name, int age){
        this.name = name;
        if (age < 0 ){
            this.age=0;
        }else{
            this.age = age;
        }
        this.cashAmount = 0;
    }

    public Person(String name, int age, int cashAmount) {
        this.name = name;
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

        if (cashAmount < 0) {
            this.cashAmount = 12;
        } else {
            this.cashAmount = cashAmount;
        }

    }

    public void setAge(int age) {
        this.age = age;
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
