package abstraction.pointInRectangle;

public class Rectangle {
    private final Point X;
    private final Point Y;

    public Rectangle(Point x, Point y) {
        this.X = x;
        this.Y = y;
    }

    public boolean isInside(Point S) {

        return (S.getX() >= X.getX() && S.getX() <= Y.getX())
                &&
                S.getY() >= X.getY() && S.getY() <= Y.getY();
    }
}
