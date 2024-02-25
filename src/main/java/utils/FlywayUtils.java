package utils;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.internal.configuration.models.DataSourceModel;
import org.flywaydb.core.internal.jdbc.DriverDataSource;
import prefs.DatabasePrefs;
import prefs.FlyWayPrefs;

import javax.sql.DataSource;

public class FlywayUtils {
    private static final Flyway INSTANCE;

    static {
        INSTANCE = Flyway.configure()
                .dataSource(DatabasePrefs.getUrl(),
                        DatabasePrefs.getUser(),
                        DatabasePrefs.getPassword())
                .locations(FlyWayPrefs.getLocation())
                .load();

    }

    private FlywayUtils() {
        throw new UnsupportedOperationException();
    }


    public static Flyway getInstance() {
        return INSTANCE;
    }
}

