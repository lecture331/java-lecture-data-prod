package bankapp.customerapp;

import bankapp.bank.Account;
import bankapp.bankinterface.AccountInterface;
import bankapp.bankinterface.WorkInterface;
import bankapp.workapp.WorkApplication;

public class BankApplication implements AccountInterface {

    Account user;

    public BankApplication(Account user) {
        this.user = user;
    }

    @Override
    public String accountInfo() {
        return user.accountInfo();
    }

    @Override
    public double accountTransfer(double cash) {
        return user.accountTransfer(cash);
    }

    @Override
    public double depositToFromAccount(double cash) {
        return user.depositToFromAccount(cash);
    }

    @Override
    public double withdrawFromAccount(double cash) {
        return user.withdrawFromAccount(cash);
    }


    public static void main(String[] args) {
        // 테스트를 위한 회원가입
        WorkInterface workInterface = new WorkApplication();
        workInterface.createAccount("robbie", "12345", 202020220);

        // 로그인 진행
        Account user = Account.loginAccount("robbie", "12345");
        System.out.println("로그인 확인용: " + user.getUsername());
        System.out.println();

        // 은행 앱 실행
        AccountInterface bankApp = new BankApplication(user);
        System.out.println("사용자 정보 확인");
        System.out.println(bankApp.accountInfo());
        System.out.println();

        System.out.println("송금 진행: " + bankApp.accountTransfer(1000));
        System.out.println("예금 진행: " + bankApp.accountTransfer(9999));
        System.out.println("출금 진행: " + bankApp.accountTransfer(20220));
    }

}
