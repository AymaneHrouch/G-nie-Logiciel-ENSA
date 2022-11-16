package designPatterns.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;

    private DatabaseConnection() {}

    public void insert(String element) {
        System.out.println("Inserting " + element);
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
}
