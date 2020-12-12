package TestingNamuDarbai;

public class House {
    private int houseArea;
    private String district;
    private int builtYear;
    private String condition;

    public House (int houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }
    public int getBuiltYear () {
        return builtYear;
    }

    public String getCondition () {
        return condition;
    }

    public int getHouseArea () {
        return houseArea;
    }
}
