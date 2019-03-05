public static class Coordinates {

    private final int x;
    private final int y;

    static private final Coordinates maxCoordinates = new Coordinates(100, 100);

    private Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinates getCoordinates(int x, int y) {
        return new Coordinates(x, y);
    }

    public static Coordinates doubleCoordinates(int x, int y) {
        return new Coordinates(x * 2, y * 2);
    }

    public static Coordinates maximumCoordinates() {
        return maxCoordinates;
    }

    public String toString() {
        return x + " " + y;
    }
} 