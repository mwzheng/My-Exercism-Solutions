class Darts {
    private double x, y;
    private double distanceFromCenter;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
        this.distanceFromCenter = distanceFromCenter(x, y);
    }

    int score() {
        double distance = this.distanceFromCenter;
        if (distance <= 1) return 10;
        if (distance <= 5 && distance > 1) return 5;
        if (distance > 5 && distance <= 10) return 1;
        return 0;
    }

    // Using distance formula (d = sqrt(((x2-x1)^2 + (y2-y1)^2))
    private static double distanceFromCenter(double x2, double y2) {
        double deltaXSquared = Math.pow(x2 - 0, 2);
        double deltaYSquared = Math.pow(y2 - 0, 2);
        return Math.sqrt((deltaXSquared + deltaYSquared));
    }
}
