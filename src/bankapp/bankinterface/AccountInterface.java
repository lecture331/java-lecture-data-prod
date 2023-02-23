package bankapp.bankinterface;

import bankapp.bank.Account;

public interface AccountInterface {
    // 계좌 정보 출력
    // 계좌 송금
    // 계좌 예금
    // 계좌 출금
    String accountInfo();
    double accountTransfer(double cash);
    double depositToFromAccount(double cash);
    double withdrawFromAccount(double cash);
}
