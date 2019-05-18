package sr.unasat.bank.of.suriname.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;


class UserTest {
    static User user;

    @BeforeAll
    private static void init() {
        // create mock
        user = Mockito.mock(User.class);
        // define return value for method getUniqueId()
        when(user.update(1)).thenReturn(1);
    }

    @Test
    public void testSimpleInt() {
        // use mock in test
        assertEquals(user.update(1), user.update(1));
    }

}