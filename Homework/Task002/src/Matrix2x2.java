/**
 * Created by Julia on 24.02.2016.
 */
public class Matrix2x2 {
public double m[][] = new double[2][2];
    public Matrix2x2(){
        m[0][0]=0;
        m[0][1]=0;
        m[1][0]=0;
        m[1][1]=0;
    }

    public double getMas(int i,int j) {
        return m[i][j];
    }
    public Matrix2x2(double[][] mass){
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                m[i][j]=mass[i][j];
            }
        }
    }
    public Matrix2x2(double x1,double x2,double x3,double x4){
        m[0][0]=x1;
        m[0][1]=x2;
        m[1][0]=x3;
        m[1][1]=x4;
    }
    public Matrix2x2 add(Matrix2x2 a){
        Matrix2x2 m1 = new Matrix2x2();
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                m1.m[i][j]=this.m[i][j]+a.m[i][j];
            }
        }
        return m1;
    }
    public void add2(Matrix2x2 a){
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                this.m[i][j] += a.m[i][j];
            }
        }
    }
    public Matrix2x2 sub(Matrix2x2 a){
        Matrix2x2 m1 = new Matrix2x2();
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                m1.m[i][j]=this.m[i][j]-a.m[i][j];
            }
        }
        return m1;
    }
    public Matrix2x2 multNumber(double d){
        Matrix2x2 m1 = new Matrix2x2();
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                m1.m[i][j]=this.m[i][j]*d;
            }
        }
        return m1;
    }
    public Matrix2x2 mult(Matrix2x2 a){
        Matrix2x2 m1 = new Matrix2x2();
        m1.m[0][0]=m[0][0]*a.m[0][0]+m[0][1]*a.m[1][0];
        m1.m[0][1]=m[0][0]*a.m[0][1]+m[0][1]*a.m[1][1];
        m1.m[1][0]=m[1][0]*a.m[0][0]+m[1][1]*a.m[1][0];
        m1.m[1][1]=m[1][0]*a.m[0][1]+m[1][1]*a.m[1][1];
        return m1;
    }
    public double det(){
        double d = m[0][0]*m[1][1]-m[1][0]*m[0][1];
        return d;
    }
    public void transpon(){
        double c = m[0][1];
        m[0][1]=m[1][0];
        m[1][0]=c;
    }
    public Matrix2x2 inverse(){
        Matrix2x2 m1 = new Matrix2x2();
        double det = this.det();
        if (det!=0){
            m1.m[0][0]=m[1][1]/(det);
            m1.m[0][1]=-1*(m[0][1]/(det));
            m1.m[1][0]=-1*(m[1][0]/(det));
            m1.m[1][1]=m[0][0]/(det);
        }else {
            System.out.println("error,det =0");
            m1.m[0][0]=1;
            m1.m[0][1]=0;
            m1.m[1][0]=0;
            m1.m[1][1]=1;

        }
        return m1;

    }
    public Matrix2x2 equal(){
        Matrix2x2 m1 = new Matrix2x2();
        m1.m[0][0]=m[0][0];
        m1.m[0][1]=m[0][1];
        m1.m[1][0]=0;
        m1.m[1][1]=m[1][1]*m[0][0]-m[0][1]*m[1][0];
        return m1;
    }
    public boolean equals(Object matr){
        try {
            Matrix2x2 m2 = (Matrix2x2) matr;
            return (m[0][0] == m2.m[0][0]&&m[0][1] == m2.m[0][1]&&m[1][0] == m2.m[1][0] &&m[1][1] == m2.m[1][1]);
        }catch (ClassCastException e){
            return false;
        }
    }

    public static void main(String[] args) {
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        System.out.println(-m1.m[1][0]*m1.m[0][1]);
        System.out.println(m1.det());
        Matrix2x2 m2 = m1.inverse();
        System.out.println(m2.m[0][0]+" "+m2.m[0][1]+" "+m2.m[1][0]+" "+m2.m[1][1]);
    }
}
