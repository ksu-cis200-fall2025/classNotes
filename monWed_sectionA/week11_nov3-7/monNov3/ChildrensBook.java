public class ChildrensBook extends Book {
    //Fields for the title, author, year, pages, illustrated, hardcover
    private boolean illustrated;
    private boolean hardcover;

    public ChildrensBook(String t, String a, int y, int p, boolean i, boolean h) {
        super(t, a, y, p);
        illustrated = i;
        hardcover = h;
    }
    
    //constructor to initialize fields
    
    //Price
    //  $9.99 for paperback and non-illustrated
    // $5 each for the add-ons

    //Override toString method 
}