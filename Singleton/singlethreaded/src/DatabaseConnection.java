public class DatabaseConnection {
    private static DatabaseConnection instance = null;

    private DatabaseConnection(){

    }

//    Will not work in concurrent environment
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance =  new DatabaseConnection();
        }
        return instance;
    }
}
