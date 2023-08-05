public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(String name){
        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
