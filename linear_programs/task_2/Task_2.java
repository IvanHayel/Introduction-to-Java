package linear_programs.task_2;

import static java.lang.Math.*;

public class Task_2 {
    public static void main(String[] args) {
        Expression e = new Expression(3.14, 1.59, 2.65);
        e.showResult();
        System.out.println(e);
    }
}

final class Expression {
    private double a;
    private double b;
    private double c;

    public Expression(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void showResult(){
        System.out.println("Expression value is " +
                getExpressionValue());
    }

    @Override
    public String toString() {
        return Double.toString(getExpressionValue());
    }

    public double getExpressionValue() {
        return (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) -
                pow(a, 3) * c +
                pow(b, -2);
    }

}