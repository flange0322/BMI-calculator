package example.tw.bmisimple;

public abstract class BMI_Data{

    protected double length;
    protected double weight;

    public BMI_Data(){
        length = 0.0;
        weight = 0.0;
    }

    public void setLength(String length) throws NullException{
        if(length.equals(""))
            throw new NullException();
        this.length = Double.parseDouble(length);
    }

    public void setWeight(String weight) throws NullException{
        if(weight.equals(""))
            throw new NullException();
        this.weight = Double.parseDouble(weight);
    }

    public void setMember(String length, String weight) throws NullException{
        setLength(length);
        setWeight(weight);
    }

    public abstract double getBMI() throws Length_NO_ZERO;
}
