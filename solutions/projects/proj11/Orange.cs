public class Orange : CountableItem {
    public bool Organic { get; init; }

    public String Name {
        get {
            if (Organic) return "Organic Orange";
            else return "Orange";
        }
    }

    private int _count = 1;
    public int Count {
        get => _count;
        set {
            if (value >= 1 && value <= 3) {
                _count = value;
            }
        }
    }

    public double UnitPrice {
        get {
            if (Organic) return 1.25;
            else return 0.99;
        }
        
    }

    public double FullPrice => Count*UnitPrice;

    public override string ToString() {
        return $"{Name}, count: {Count}, price: {FullPrice:C}";
    }
}