package iiitb.org.ScientificCalculator.entities;

public class MathXpr {
    private String xpr;
    private double res;

    public MathXpr(String xpr, double res) {
        this.xpr = xpr;
        this.res = res;
    }

    public String getXpr() {
        return xpr;
    }

    public void setXpr(String xpr) {
        this.xpr = xpr;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "MathXpr{" +
                "xpr='" + xpr + '\'' +
                ", res=" + res +
                '}';
    }
}
