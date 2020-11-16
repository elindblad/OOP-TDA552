public class TestOverlaps {
    public static void main(String[] args) {

        Square sq = new Square(100, 100);
        Triangle tri = new Triangle(150, 150);
        Rectangle rec = new Rectangle(110, 50);

        tri.overlaps(sq);
        sq.overlaps(rec);
        rec.overlaps(sq);
    }
}
