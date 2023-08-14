public class ChocoChips implements IceCreamConstituents{

    private IceCreamConstituents iceCreamConstituents;


    public ChocoChips(IceCreamConstituents iceCreamConstituents){
        this.iceCreamConstituents = iceCreamConstituents;
    }

    public int getCost(){
        return iceCreamConstituents.getCost() + 7;
    }

    public String getDescription(){
        return iceCreamConstituents.getDescription()+" Choco Chips";
    }
}
