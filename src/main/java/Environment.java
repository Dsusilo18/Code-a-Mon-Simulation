

public class Environment {

    private Weather weatherType;
    private String buffedType;
    private String debuffedType;
    private double buffModifier;
    private double debuffModifier;

    public Environment() {
        this(Weather.neutral);
    }

    public Environment(Weather weather) {
        this.weatherType = weather;
        this.buffModifier = 1.25;
        this.debuffModifier = 0.75;
        switch (weather) {
            case sunny:
                this.buffedType = "Fire";
                this.debuffedType = "Water";
                break;
            case rainy:
                this.buffedType = "Water";
                this.debuffedType = "Fire";
                break;
            default:
                this.buffedType = "";
                this.debuffedType = "";
                break;
        }
    }

    //SER316 TASK 2 SPOT-BUGS FIX
    public String getBuffedType() {
        return buffedType;
    }

    public String getDebuffedType() {
        return debuffedType;
    }

    public enum Weather {
        sunny, rainy, neutral
    }

    public double getDebuffMod() {
        return debuffModifier;
    }

    public double getBuffMod() {
        return buffModifier;
    }

    public Weather getWeather() {
        return weatherType;
    }
}
