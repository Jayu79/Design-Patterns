public class DatabaseConnection {
    private static DatabaseConnection instance = new DatabaseConnection();
    private DatabaseConnection(){
    }

//    Will not work in concurrent environment
    public static DatabaseConnection getInstance(){
        return instance;
    }

}
