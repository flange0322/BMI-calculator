package example.tw.bmisimple;

public class BMI_Cal extends BMI_Data{

    public BMI_Cal(){
        super();
    }

    @Override
    public double getBMI() throws Length_NO_ZERO{
        double total = weight / Math.pow((length/100),2);
        total *= 10;
        total = Math.floor(total);
        total /= 10;
        //double d = new BigDecimal(total).setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        if(length == 0)
            throw new Length_NO_ZERO();
        return total;
    }

}
