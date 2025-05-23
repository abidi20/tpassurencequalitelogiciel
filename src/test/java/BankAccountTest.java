import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        // Arrange
        BankAccount account = new BankAccount(100.0, 0.05);

        // Act
        account.deposit(50.0);

        // Assert
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testDeposit_NegativeAmount_ShouldThrowException() {
        // Arrange
        BankAccount account = new BankAccount(100.0, 0.05);

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }

    @Test
    void testWithdraw() {
        // Arrange
        BankAccount account = new BankAccount(100.0, 0.05);

        // Act
        account.withdraw(30.0);

        // Assert
        assertEquals(70.0, account.getBalance());
    }

    @Test
    void testWithdraw_InsufficientBalance_ShouldThrowException() {
        // Arrange
        BankAccount account = new BankAccount(50.0, 0.05);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> account.withdraw(100.0));
    }

    @Test
    void testTransfer() {
        // Arrange
        BankAccount account1 = new BankAccount(200.0, 0.05);
        BankAccount account2 = new BankAccount(50.0, 0.05);

        // Act
        account1.transfer(50.0, account2);

        // Assert
        assertEquals(150.0, account1.getBalance());
        assertEquals(100.0, account2.getBalance());
    }

    @Test
    void testTransfer_NullAccount_ShouldThrowException() {
        // Arrange
        BankAccount account = new BankAccount(200.0, 0.05);

        // Act & Assert
        assertThrows(NullPointerException.class, () -> account.transfer(50.0, null));
    }

    @Test
    void testAddInterest() {
        // Arrange
        BankAccount account = new BankAccount(100.0, 0.05);

        // Act
        account.addInterest();

        // Assert
        assertEquals(105.0, account.getBalance(), 0.01); // Tolérance pour arrondis
    }
    @Test
    void testTransferFailsWhenOtherIsNull() {
        BankAccount account = new BankAccount(100.0, 0.05);
        Exception exception = assertThrows(NullPointerException.class, () -> {
            account.transfer(50.0, null);
        });
        assertEquals(100.0, account.getBalance(), 0.001); // ✅ solde inchangé car transfert pas effectué
    }
    @Test
    void testNegativeInterestRateAllowed() {
        BankAccount account = new BankAccount(100.0, -0.1);
        account.addInterest(); // 💥 Réduit le solde !
        assertTrue(account.getBalance() < 100.0);}

}
