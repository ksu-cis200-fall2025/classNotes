public class Eggs : DiscountedItem {
    public string Name => "Eggs";

    public double FullPrice=> 3.50;

    public double DiscountPrice => 2.50;

    public override string ToString() {
        return $"{Name}, price: {FullPrice:C}";
    }
}