public class Rectangle {
    private int _length = 1;
    private int _width = 1;

    public int Length {
        //both get and set access
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
        //both get and set access
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
    public override string ToString() {
        return $"{Length}x{Width} rectangle, area {Area}";
    }


    //add Name property ("Rectangle")
    public string Name => "Rectangle";


    public int Area {
        get {
            return _length*_width;
        }
    }
}