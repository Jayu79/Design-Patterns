public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculatorByMode(String mode){
        if(mode.equalsIgnoreCase("car")){
            return new CarPathCalculatorStrategy();
        } else if (mode.equalsIgnoreCase("bike")) {
            return new BikePathCalculatorStrategy();
        } else {
            return new WalkPathCalculatorStrategy();
        }
    }
}
