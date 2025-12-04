public class Rectangle {
    private int _length = 1;
    private int _width = 1;

    public int Length {
        //get, set, (init)
        get {
            return _length;
        }
        set {
            if (value >= 1) {
                _length = value;
            }
        }
    }

    public int Width {
        //get, set, (init)
        get {
            return _width;
        }
        set {
            if (value >= 1) {
                _width = value;
            }
        }
    }

    //make Length, Width properties
    //default Length/Width are each 1
    //don't allow Length/Width less than 1

    //make Area a property instead too

    //override ToString

    //make Name a property (always "Rectangle")


    public int Area {
        get {
            return Length*Width;
        }
    }

    public string Name => "Rectangle";


    public override string ToString() {
        return $"{Length}x{Width} {Name}, area {Area}";
    }
}