import com.google.common.collect.ImmutableMap;
import org.junit.After;
import org.junit.Before;
import play.db.Database;
import play.db.Databases;

public class WithDBTest {

    Database database;

    @Before
    public void createDatabase() {
        database = Databases.createFrom(
                "com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost/test",
                ImmutableMap.of("user", "codenforcer", "password", "111111")
        );
    }

    @After
    public void shutdownDatabase() {
        database.shutdown();
    }
}
