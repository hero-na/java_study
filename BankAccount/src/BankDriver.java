


public class BankDriver {
    public static void main(String[] main){
        Person p1 = new Person();
        p1.setName("김신의");
        p1.setAge(28);
        p1.setCashAmount(300000);

        //Test
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p1.cashAmount);


        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);
        p1.setAccount(a1);
        a1.setOwner(p1);

        //a1 Test
//        System.out.println(a1.balance);
//
//        System.out.println(p1.account.balance);

        Person p2 = new Person();
        p2.setName("김신의");
        p2.setAge(28);
        p2.setCashAmount(100000);


        // 은행 계좌 생성
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);
        a2.deposit(1111);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

    }

}
