class SpaceAge {
    private final double seconds;
    private static final int secondsInAYear = 31557600;
    private static final double mercuryPeriodEarthYrs = 0.2408467;
    private static final double venusPeriodEarthYrs = 0.61519726;
    private static final double marsPeriodEarthYrs = 1.8808158;
    private static final double jupiterPeriodEarthYrs = 11.862615;
    private static final double saturnPeriodEarthYrs = 29.447498;
    private static final double uranusPeriodEarthYrs = 84.016846;
    private static final double neptunePeriodEarthYrs = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds() / secondsInAYear;
    }

    double calculateAgeOnPlanet(double orbitalPeriod) {
        return onEarth() * (1 / orbitalPeriod);
    }

    double onMercury() {
        return calculateAgeOnPlanet(mercuryPeriodEarthYrs);
    }

    double onVenus() {
        return calculateAgeOnPlanet(venusPeriodEarthYrs);
    }

    double onMars() {
        return calculateAgeOnPlanet(marsPeriodEarthYrs);
    }

    double onJupiter() {
        return calculateAgeOnPlanet(jupiterPeriodEarthYrs);
    }

    double onSaturn() {
        return calculateAgeOnPlanet(saturnPeriodEarthYrs);
    }

    double onUranus() {
        return calculateAgeOnPlanet(uranusPeriodEarthYrs);
    }

    double onNeptune() {
        return calculateAgeOnPlanet(neptunePeriodEarthYrs);
    }
}
