import prefs.DatabasePrefs;
import prefs.FlyWayPrefs;
import utils.FlywayUtils;

public class App {
    public static void main(String[] args) {
        System.out.println(FlyWayPrefs.getLocation());
        System.out.println(DatabasePrefs.getPassword());
        System.out.println(DatabasePrefs.getUrl());
        System.out.println(DatabasePrefs.getUser());

        FlywayUtils.getInstance().migrate();
    }
}
