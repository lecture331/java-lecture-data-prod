package bankapp.adminapp;

import bankapp.bank.Account;
import bankapp.bank.AccountList;
import bankapp.bank.Vault;
import bankapp.bankinterface.AdminInterface;
import bankapp.bankinterface.WorkInterface;
import bankapp.workapp.WorkApplication;

import java.util.List;

public class AdminApplication implements AdminInterface {
    @Override
    public double getVaultCash() {
        Vault vault = new Vault();
        return vault.getVaultCash();
    }

    @Override
    public List<Account> getAccountList() {
        return AccountList.getAccountList();
    }

    public static void main(String[] args) {

        AdminInterface adminApplication = new AdminApplication();
        System.out.println("현재 통장잔고 확인 = " + adminApplication.getVaultCash());

        System.out.println();
        // 기능 테스트를 위해 계좌 개설
        WorkInterface workInterface = new WorkApplication();
        workInterface.createAccount("robbie", "1234", 200000);
        workInterface.createAccount("bin", "54321", 111888);
        System.out.println();


        System.out.println("전체 고객 계좌 목록");
        for (Account account : adminApplication.getAccountList()) {
            System.out.println(account.getUsername());
            System.out.println(account.getPassword());
            System.out.println(account.getBalance());
            System.out.println();
        }

    }
}
