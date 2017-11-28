public enum Weather {
    SUNNY(25, "its hot"),
    SNOWY(-10, "its cold"),
    RAINY(10, "its ok");

    private int averageTemp;
    private String desc;

    Weather(int averageTemp, String desc){
        this.averageTemp = averageTemp;
        this.desc = desc;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getDesc() {
        return desc;
    }
}
