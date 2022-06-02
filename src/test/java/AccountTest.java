package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import main.java.Account;

public class AccountTest {
    private final Account account = new Account("Odhran", 100);

    @Test
    public void testGetBalance() {
        assertEquals(100.0, account.getBalance(), 0);
        assertNotEquals(100, account.getBalance());
    }

    @Test
    public void testGetName() {
        assertEquals("Odhran", account.getName());
    }
}
