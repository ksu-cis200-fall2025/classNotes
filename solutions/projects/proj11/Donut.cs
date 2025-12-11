public class Donut : CountableItem, DiscountedItem {
    public bool Frosted { get; init; }

    private int _count = 1;
    public int Count {
        get => _count;
        set {
            if (value >= 1 && value <= 12) {
                _count = value;
            }
        }
    }

    public string Name {
        get {
            if (Frosted) return "Frosted Donut";
            else return "Plain Donut";
        }
    }

    public double UnitPrice {
        get {
            if (Frosted) return 1.50;
            else return 1.25;
        }
    }

    public double FullPrice => Count*UnitPrice;

    public double DiscountPrice => 0.7 * FullPrice;

    public override string ToString() {
        return $"{Name}, count: {Count}, price: {FullPrice:C}";
    }
}