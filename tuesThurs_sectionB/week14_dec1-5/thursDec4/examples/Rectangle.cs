public class Rectangle {
    private int _length;
    private int _width;

    //make Length, Width properties
    //default Length/Width are each 1
    //don't allow Length/Width less than 1

    //make Area a property instead too

    //override ToString

    public Rectangle(int l, int w) {
        _length = l;
        _width = w;
    }

    public int Area() {
        return _length*_width;
    }
}