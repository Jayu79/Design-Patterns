public class GoogleMaps {
    public void findPath(String from,String to,String mode){


//        if(mode = ....){
//            ......
//        }
//        else if(mode = ....){
//            .....
//        }
//        else{
//            .....
//        }  -> violates SRP and OCP

        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorByMode(mode);
        pathCalculatorStrategy.findPath(from, to);

    }
}
