package beans;

public class Bike {
    private String make;
    private String model;
    private int year;
    private String cc;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void getBikeDetails(){
        System.out.println(String.format("%-10s: %s\n%-10s: %s\n%-10s: %d\n%-10s: %s\n", "Make", this.getMake(), "Model", this.getModel(), "Year", this.getYear(), "CC", this.getCc()));
    }
}
