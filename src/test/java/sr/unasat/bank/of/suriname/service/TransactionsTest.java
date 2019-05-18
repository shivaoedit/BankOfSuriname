package sr.unasat.bank.of.suriname.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionsTest {

    @Test
    public void subtract(){
        Transactions t = Transactions.builder().build();
        assertEquals(2, t.subtract(3, 1));
    }

}