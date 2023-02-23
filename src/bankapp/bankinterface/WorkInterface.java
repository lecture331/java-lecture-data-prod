package bankapp.bankinterface;

import bankapp.bank.Account;

public interface WorkInterface {
    // 은행 금고 출금
    // 은행 금고 예금
    // 고객 계좌 정보 확인
    // 계좌 개설

    double withdrawCashFromVault(double cash);
    double depositCashToVault(double cash);

    Account getAccountInfo(String username, String password);
    Account createAccount(String username, String password, double cash);
}
