public class Main {
    public static void main(String[] args) {
        IceCreamConstituents iceCreamConstituents = new ChocoChips(
                new VanilaScoop(
                        new StrawberryScoop(
                                new OrangeCone(
                                        new ChocoChips(
                                                new ChocolateCone()
                                        )
                                )
                        )
                )
        );

        System.out.println(iceCreamConstituents.getCost());
        System.out.println(iceCreamConstituents.getDescription());

    }
}