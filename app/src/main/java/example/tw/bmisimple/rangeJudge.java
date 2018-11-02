package example.tw.bmisimple;

public class rangeJudge {

    protected double BMI;
    public rangeJudge(){
        BMI = 0.0;
    }

    public void setBMI(double BMI){
        this.BMI = BMI;
    }

    public String getString(){
        String ans = null;
        if(BMI<18.5)
            ans = "體重過輕!";
        else if(24>BMI&&BMI>=18.5)
            ans = "正常範圍";
        else if(27>BMI&&BMI>=24)
            ans = "過重";
        else if(30>BMI&&BMI>=27)
            ans = "輕度肥胖";
        else if(35>BMI&&BMI>=30)
            ans = "中度肥胖";
        else
            ans = "重度肥胖";
        return ans;
    }
}
