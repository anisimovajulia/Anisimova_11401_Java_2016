/**
 * Created by Julia on 25.02.2016.
 */
public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber(){
        this.a = 0;
        this.b = 0;
    }

    public ComplexNumber(double i, double i1) {
        a=i;
        b=i1;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public void setA(double i){
        a=i;
    }
    public void setB(double i){
        b=i;
    }

    public ComplexNumber add(ComplexNumber y) {
        double c=this.a+y.a;
        double d=this.b+y.b;
        ComplexNumber x2 = new ComplexNumber(c,d);
        return (x2);
    }
    public void add2(ComplexNumber y){
        this.a+=y.a;
        this.b+=y.b;
    }
    public ComplexNumber sub(ComplexNumber y){
        ComplexNumber sub = new ComplexNumber();
        sub.a = this.a-y.a;
        sub.b = this.b-y.b;
        return sub;
    }
    public void sub2(ComplexNumber y){
        this.a -=y.a;
        this.b-=y.b;
    }
    public ComplexNumber multNumber(double d){
        ComplexNumber multnumb = new ComplexNumber();
        multnumb.a = this.a*d;
        multnumb.b = this.b*d;
        return multnumb;
    }
    public void multNumber2(double d){
        this.a*=d;
        this.b*=d;
    }
    public ComplexNumber mult(ComplexNumber y){
        ComplexNumber mult = new ComplexNumber();
        mult.a = this.a*y.a-this.b*y.b;
        mult.b = this.a*y.b+this.b*y.a;
        return mult;

    }
    public void mult2(ComplexNumber y){

        this.a = this.a*y.a-this.b*y.b;
        this.b = this.a*y.b+this.b*y.a;
    }
    public ComplexNumber div(ComplexNumber y){
        ComplexNumber c = new ComplexNumber();
        c.a = (this.a*y.a+this.b*y.b)/(y.a*y.a+y.b*y.b);
        c.b = (this.b*y.a-this.a*y.b)/(y.a*y.a+y.b*y.b);
        return c;
    }
    public void div2(ComplexNumber y){
        this.a = (this.a*y.a+this.b*y.b)/(y.a*y.a+y.b*y.b);
        this.b = (this.b*y.a-this.a*y.b)/(y.a*y.a+y.b*y.b);
    }
    public double length(){
        double leng = Math.sqrt(this.a*this.a+this.b*this.b);
        return leng;
    }

    public String toString(){
        String s;
        if(b<0){
            s = this.a+"-"+Math.abs(this.b)+"*i";
        }else if(b>0){
            s=this.a+"+"+this.b+"*i";
        }else{
            s = this.a+"";
        } if(b<0){
            s = this.a+"-"+Math.abs(this.b)+"*i";
        }else if(b>0){
            s=this.a+"+"+this.b+"*i";
        }else{
            s = this.a+"";
        }
        return s;
    }
    public double arg(){

        double arg = Math.acos(b/Math.sqrt(a*a+b*b));
        return arg;
    }
    public ComplexNumber pow(double d){
        double p=1;
        for(int i = 1;i<=d;i++){
            p*=d;
        }
        ComplexNumber pow = new ComplexNumber();
        pow.a = p*Math.cos(d*this.arg());
        pow.b = p*Math.sin(d*this.arg());
        return pow;
    }
    public boolean equals(ComplexNumber y){
        boolean flag = false;
        if((this.a==y.a)&&(this.b==y.b)){
            flag = true;
        }
        return flag;
    }
    public String string(){
        return("a="+this.a+", b="+this.b);
    }
}
