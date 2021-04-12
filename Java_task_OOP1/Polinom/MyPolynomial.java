package Java_task_OOP1.Polinom;

public class MyPolynomial {
    double[] coef;

    public MyPolynomial(double[] coef) {
        this.coef = coef;
    }

    public int getDegree() {
        return coef.length - 1;
    }

    public double[] getCoef() {
        return coef;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(coef[coef.length - 1] + " x^" + (coef.length - 1));
        for (int i = 1;i<coef.length; i++){
            str.append(" + ").append(coef[coef.length - i - 1]).append(" * x^").append(coef.length - i - 1);
        }
        return str.toString();
    }

    public MyPolynomial() {
    }

    public double evaluate(double x) {
        double sum = 0;
        for (int i = coef.length; i > 0; i--) {
            System.out.println(sum + " " + i);
            System.out.println(coef[i - 1] + " " + i);
            sum += coef[i - 1] * Math.pow(x, i - 1);
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] c;

        if (this.coef.length >= right.coef.length) {
            c = this.coef;
        }
        c = right.coef;

        for (int i = 0; i < this.coef.length; i++) {
            for (int j = 0; j < right.coef.length; j++) {
                if (i == j) {
                    c[i] = this.coef[i] + right.coef[j];
                }
            }
        }
        return new MyPolynomial(c);
    }


    public MyPolynomial multiply(MyPolynomial right) {
        double[] res = new double[coef.length + right.getDegree()];
        for (int i = 0; i < coef.length; i++) {
            for (int j = 0; j < right.getDegree() + 1; j++) {
                res[i + j] += coef[i] * right.getCoef()[j];
            }
        }
        return new MyPolynomial(res);

    }
}
