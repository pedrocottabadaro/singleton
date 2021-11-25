import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    @Test
    void setUsername() {
        Database.getDatabase().setUsername("PedroCB");
        assertEquals("PedroCB", Database.getDatabase().getUsername());
    }

    @Test
    void setIp() {
        Database.getDatabase().setIp("192.168.0.1");
        assertEquals("192.168.0.1", Database.getDatabase().getIp());
    }

    @Test
    void setPassword() {
        Database.getDatabase().setPassword("73pp32A2@2");
        assertEquals("73pp32A2@2", Database.getDatabase().getPassword());
    }
}