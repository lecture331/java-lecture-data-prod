package bankapp.bank;

import java.util.ArrayList;
import java.util.List;

public class AccountList {

    // 테스트를 위해 데이터베이스 대용으로 사용
    private static final List<Account> accountList = new ArrayList<>();

    // 하나의 고객 계좌 확인 후 출력
    public static Account getAccount(String username, String password) {
        for (Account account : accountList) {
            if(account.getUsername().equals(username)) {
                if(account.getPassword().equals(password)) {
                    return account;
                }
            }
        }
        System.out.println("일치하는 계좌가 없습니다.");
        return null;
    }

    // 계좌 송금
    public static double accountTransfer(Account account, double cash) {
        if(checkAccount(account)) {
            account.setBalance(account.getBalance() - cash);
            return account.getBalance();
        } else {
            System.out.println("일치하는 계좌가 없습니다.");
            return 0;
        }
    }

    // 계좌 예금
    public static double depositToFromAccount(Account account, double cash) {
        if(checkAccount(account)) {
            account.setBalance(account.getBalance() + cash);
            return account.getBalance();
        } else {
            System.out.println("일치하는 계좌가 없습니다.");
            return 0;
        }
    }

    // 계좌 출금
    public static double withdrawFromAccount(Account account, double cash) {
        if(checkAccount(account)) {
            account.setBalance(account.getBalance() - cash);
            return account.getBalance();
        } else {
            System.out.println("일치하는 계좌가 없습니다.");
            return 0;
        }
    }

    // 전체 고객 계좌 출력
    public static List<Account> getAccountList() {
        return accountList;
    }

    // 개설한 계좌 등록
    public static void setAccount(Account account) {
        accountList.add(account);
    }

    // 계좌 확인
    private static boolean checkAccount(Account account) {
        return accountList.contains(account);
    }

}

