package iiitb.org.ScientificCalculator.entities;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Scanner;

public class NormalCalculator implements Calculator {
    private double acc_val;

    public NormalCalculator(double acc_val) {
        this.acc_val = acc_val;
    }

    public double getAcc_val() {
        return acc_val;
    }

    public void setAcc_val(double acc_val) {
        this.acc_val = acc_val;
    }

    @Override
    public double compute_expression(String xpr) throws ArithmeticException{
//        int n = xpr.length();
//        ArrayList<Integer> pluses = new ArrayList<Integer>();
//        ArrayList<Integer> minuses = new ArrayList<Integer>();
//        ArrayList<Integer> asterisks = new ArrayList<Integer>();
//        ArrayList<Integer> slashes = new ArrayList<Integer>();
//        for(int i=0; i<n; i++){
//            if(xpr.charAt(i) == '+'){
//                pluses.add(i);
//            }
//            else if(xpr.charAt(i) == '-'){
//                minuses.add(i);
//            }
//            else if(xpr.charAt(i) == '*'){
//                asterisks.add(i);
//            }
//            else if(xpr.charAt(i) == '/'){
//                slashes.add(i);
//            }
//        }

        Expression e = new ExpressionBuilder(xpr).build();
        return e.evaluate();
    }

    public static void main(String[] args) {
        Scanner cli_inp = new Scanner(System.in);
        NormalCalculator ncal = new NormalCalculator(0);

        System.out.print("Enter your expression: ");
        String xpr = cli_inp.next();
        System.out.println("Result: "+ncal.compute_expression(xpr));
    }
}
