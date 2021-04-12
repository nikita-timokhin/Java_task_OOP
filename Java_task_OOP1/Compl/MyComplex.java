package Java_task_OOP1.Compl;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "MyComplex = " + real + " + " + imag + "i";
    }

    public boolean isReal() {
        return (real == 0);
    }

    public boolean isImaginary() {
        return (imag == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (another.imag == this.imag && another.real == this.real);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public double argument() {
        double result = 0.0;
        if (this.real > 0) {
            result = Math.atan(this.imag / this.real);
        } else if (this.real < 0 && this.imag > 0) {
            result = Math.PI + Math.atan(this.imag / this.real);
        } else if (this.real < 0 && this.imag < 0) {
            result = (-1) * Math.PI + Math.atan(this.imag / this.real);
        }
        return result;
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newInst = new MyComplex();
        newInst.real = this.real + right.real;
        newInst.imag = this.imag + right.imag;
        return newInst;
    }

    public MyComplex subtruct(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newInst = new MyComplex();
        newInst.real = this.real - right.real;
        newInst.imag = this.imag - right.imag;
        return newInst;
    }

    public MyComplex multiply(MyComplex right) {
        double r, i;
        r = (this.real * right.real) - (this.imag * right.imag);
        i = (this.real * right.imag) + (this.imag * right.real);
        this.real = r;
        this.imag = i;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double r, i;
        r = ((this.real * right.real) + (this.imag * right.imag)) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        i = ((right.real * this.imag) - (this.real * right.imag)) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.real = r;
        this.imag = i;
        return this;
    }

    public MyComplex conjugate() {
        this.imag *= -1;
        return this;
    }
}
