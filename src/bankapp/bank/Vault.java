package bankapp.bank;

public class Vault {

    // 데이터 베이스 대용으로 사용
    private static double vaultCash;
    static {
        vaultCash = 999_999_999;
    }

    public double getVaultCash() { // 금고 현금 확인
        return vaultCash;
    }

    public double withdrawCashFromVault(double cash) { // 금고에서 출금
        if(vaultCash - cash < 0) {
            System.out.println("금고 현금이 부족합니다.");
            return 0;
        }else {
            vaultCash -= cash;
            return cash;
        }
    }

    public double depositCashToVault(double vaultCash) { // 금고에 예금
        return Vault.vaultCash += vaultCash;
    }
}

