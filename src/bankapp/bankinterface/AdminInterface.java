package bankapp.bankinterface;

import bankapp.bank.Account;

import java.util.List;

public interface AdminInterface {
    // 은행 금고 현금 확인
    // 전체 계좌 정보 확인
    double getVaultCash();
    List<Account> getAccountList();
}
