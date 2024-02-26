import entity.ClientEntity;
import prefs.DatabasePrefs;
import prefs.FlyWayPrefs;
import service.ClientCrudService;
import service.PlanetCrudService;
import utils.FlywayUtils;

public class App {
    public static void main(String[] args) {
        ClientEntity client = new ClientEntity("Test testson");
        new ClientCrudService().save(client);
    }
}
