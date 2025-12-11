public class Chips : DiscountedItem {
    public string Name => "Chips";

    public double DiscountPrice => 3.99;

    public double FullPrice => 5.99;

    public override string ToString() {
        return $"{Name}, price: {FullPrice:C}";
    }
}