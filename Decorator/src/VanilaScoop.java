public class VanilaScoop implements IceCreamConstituents{

    private IceCreamConstituents iceCreamConstituents;
    public VanilaScoop(IceCreamConstituents iceCreamConstituents){
        this.iceCreamConstituents = iceCreamConstituents;
    }

    public int getCost(){
        return iceCreamConstituents.getCost()+5;
    }

    public String getDescription(){
        return iceCreamConstituents.getDescription()+" Vanila Scoop";
    }

}
