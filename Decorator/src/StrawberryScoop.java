public class StrawberryScoop implements IceCreamConstituents{

    private IceCreamConstituents iceCreamConstituents;

    public void StrawberryScoop(IceCreamConstituents iceCreamConstituents){
        this.iceCreamConstituents = iceCreamConstituents;
    }

    public int getCost(){
        return iceCreamConstituents.getCost()+5;
    }

    public String getDescription(){
        return iceCreamConstituents.getDescription()+" Strawberry Scoop";
    }

}
