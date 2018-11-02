package example.tw.bmisimple;

public abstract class BMI_Data {

    protected double length;
    protected double weight;

    public BMI_Data(){
        length = 0.0;
        weight = 0.0;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setMember(double length, double weight){
        setLength(length);
        setWeight(weight);
    }

    public abstract double getBMI() throws Length_NO_ZERO;
}
