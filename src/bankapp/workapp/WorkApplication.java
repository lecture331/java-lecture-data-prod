package bankapp.workapp;

import bankapp.adminapp.AdminApplication;
import bankapp.bank.Account;
import bankapp.bank.AccountList;
import bankapp.bank.Vault;
import bankapp.bankinterface.AdminInterface;
import bankapp.bankinterface.WorkInterface;

public class WorkApplication implements WorkInterface {
    @Override
    public double withdrawCashFromVault(double cash) {
        Vault vault = new Vault();
        vault.withdrawCashFromVault(cash);
        return cash;
    }

    @Override
    public double depositCashToVault(double cash) {
        Vault vault = new Vault();
        vault.depositCashToVault(cash);
        return vault.getVaultCash();
    }

    @Override
    public Account getAccountInfo(String username, String password) {
        return AccountList.getAccount(username, password);
    }

    @Override
    public Account createAccount(String username, String password, double cash) {
        return Account.createAccount(username, password, cash);
    }

    public static void main(String[] args) {
        WorkInterface workInterface = new WorkApplication();
        // 테스트를 위해 admin
        AdminInterface adminInterface = new AdminApplication();

        System.out.println("출금: " + workInterface.withdrawCashFromVault(1000000));;
        System.out.println("금고 잔액 확인 : " + adminInterface.getVaultCash());
        System.out.println("예금: " + workInterface.depositCashToVault(2000000));

        System.out.println();
        // 계좌 개설 및 정보 확인
        workInterface.createAccount("robbie","12345", 10000);

        Account customerInfo = workInterface.getAccountInfo("robbie", "12345");
        System.out.println("고객 계좌 이름: " + customerInfo.getUsername());
        System.out.println("고객 계죄 잔금: " + customerInfo.getBalance());

    }
}

