public class ChocolateCone implements IceCreamConstituents{

    private IceCreamConstituents iceCreamConstituents;
    public void ChocolateCone(){
    }

    public void ChocolateCone(IceCreamConstituents iceCreamConstituents){
        this.iceCreamConstituents = iceCreamConstituents;
    }

    public int getCost(){
        if(iceCreamConstituents!=null){
            return iceCreamConstituents.getCost()+10;
        }
        return 10;
    }

    public String getDescription(){
        if(iceCreamConstituents!=null){
            return iceCreamConstituents.getDescription()+" Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
