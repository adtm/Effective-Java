class Coordinates {

    public x: number;
    public y: number;

    private static maximum: Coordinates = new Coordinates(100, 100)

    private constructor(x: number, y: number) {
        this.x = x;
        this.y = y;
    }

    static maximumValue() { return this.maximum }
    static create(x: number, y: number): Coordinates { return new Coordinates(x, y)}
    static double(x: number, y: number) { return new Coordinates(x * 2, y * 2) }
}
