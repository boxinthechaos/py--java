import java.util.ArrayList;
import java.util.List;

public class Java_study12 {
    // Account 클래스 정의
    public static class Account {
        private String accountNumber;
        private String owner;
        private int balance;
        private List<String> transactions;

        // 생성자
        public Account(String accountNumber, String owner, int balance) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = balance;
            this.transactions = new ArrayList<>();
        }

        // 입금 메서드
        public int deposit(int amount) {
            balance += amount;
            System.out.println(amount + "가 입금 되었습니다");
            transactions.add("입금: " + amount + ", 잔액: " + balance);
            return balance;
        }

        // 출금 메서드
        public int withdraw(int amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + "가 출금 되었습니다");
                transactions.add("출금: " + amount + ", 잔액: " + balance);
                return balance;
            } else {
                System.out.println("잔액이 부족합니다");
                return balance;
            }
        }

        // 잔액 확인 메서드
        public int checkBalance() {
            System.out.println("현재 잔액: " + balance);
            return balance;
        }

        // 거래 내역 출력 메서드
        public void transactionsHistory() {
            System.out.println("거래 내역:");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    // 메인 메서드
    public static void main(String[] args) {
        Account account = new Account("12345", "홍kill동", 0);
        account.deposit(100);
        account.withdraw(10);
        account.transactionsHistory();
    }
}
