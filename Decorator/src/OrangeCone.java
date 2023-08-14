public class OrangeCone implements IceCreamConstituents{

    private IceCreamConstituents iceCreamConstituents;
    public void IceCreamConstituents(){
    }

    public void IceCreamConstituents(IceCreamConstituents iceCreamConstituents){
        this.iceCreamConstituents = iceCreamConstituents;
    }

    public int getCost(){
        if(iceCreamConstituents!=null){
            return iceCreamConstituents.getCost()+15;
        }
        return 15;
    }
    public String getDescription(){
        if(iceCreamConstituents!=null){
            return iceCreamConstituents.getDescription()+" Orange Cone";
        }
        return " Orange Cone";
    }
}
