import com.google.common.collect.ImmutableMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import play.db.Database;
import play.db.Databases;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class WithDBTest {

    Database database;

    @Before
    public void createDatabase() {
        database = Databases.createFrom(
                "org.postgresql.Driver",
                "jdbc:postgresql://localhost:5432/test",
                ImmutableMap.of(
                        "user", "playtest",
                        "password", "11111111",
                        "jndiName", "DefaultDS",
                        "schema", "play_test"
                )
        );
    }

    @Test
    public void testDb1() throws SQLException {
        assertEquals(database.getConnection().getSchema(), "play_test");
    }

    @After
    public void shutdownDatabase() {
        database.shutdown();
    }
}
