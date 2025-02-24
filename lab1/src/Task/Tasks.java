package Task;

public class Tasks {

    public String DataUser(){
        return "Wiktor, 20";
    }
    public void SumDiffMult(float a, float b){
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, a+b);
        System.out.printf("%.2f - %.2f = %.2f\n",a,b,a-b);
        System.out.printf("%.2f * %.2f = %.2f\n",a,b,a*b);
    }
    public boolean isEven(float a) {
        return a % 2 == 0;
    }
    public boolean isDivisible(float a) {
        return a % 3 == 0 && a % 5 == 0;
    }
    public float Cubed(float a){
        return a*a*a;
    }
    public float Sqrt(float a){
        return (float) Math.sqrt(a);
    }
    public boolean isTriangle(float a, float b, float c){
        return a*a + b*b == c*c;
    }
}
