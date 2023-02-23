package bankapp.bank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Account {

    private String username;
    private String password;
    private double balance;
    private Date expirationDate;


    private Account(String username, String password, double balance, Date expirationDate) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.expirationDate = expirationDate;
    }

    // 고객 Bank Application 진입 및 로그인
    public static Account loginAccount(String username, String password) {
        return AccountList.getAccount(username, password);
    }

    // 계좌 정보 출력
    public String accountInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "사용자 이름: " + this.username +
                "\n계좌 잔액: " + this.balance +
                "\n계좌 만료일: " + new SimpleDateFormat("yyyy-MM-dd").format(this.expirationDate);
    }

    // 계좌 송금
    public double accountTransfer(double cash) {
        // 실제 계좌 이체 로직 생략
        return AccountList.accountTransfer(this, cash);
    }

    // 계좌 예금
    public double depositToFromAccount(double cash) {
        return AccountList.depositToFromAccount(this, cash);
    }

    // 계좌 출금
    public double withdrawFromAccount(double cash) {
        return AccountList.withdrawFromAccount(this, cash);
    }

    // 계좌 개설
    public static Account createAccount(String username, String password, double cash) {
        Account account = new Account(username, password, cash, new Date(System.currentTimeMillis() +  (1000 * 24 * 60 * 60000L) ));
        AccountList.setAccount(account);
        System.out.println(username + "님 계좌 개설 성공");
        return account;
    }

    // 전체 계좌 리스트 확인
    public List<Account> getAccountList() {
        return AccountList.getAccountList();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}