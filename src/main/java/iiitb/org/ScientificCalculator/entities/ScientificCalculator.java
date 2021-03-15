package iiitb.org.ScientificCalculator.entities;

import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.operator.Operator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ScientificCalculator implements Calculator {
    private double acc_val;
    private NormalCalculator ncal;
    private Logger logger = LogManager.getLogger(ScientificCalculator.class);

    public ScientificCalculator(int acc_val) {
        this.acc_val = acc_val;
        ncal = new NormalCalculator(acc_val);
    }

    public double getAcc_val() {
        return acc_val;
    }

    public void setAcc_val(int acc_val) {
        this.acc_val = acc_val;
    }

    public NormalCalculator getNcal() {
        return ncal;
    }

    public void setNcal(NormalCalculator ncal) {
        this.ncal = ncal;
    }

    public double squareRoot(double inp) throws ArithmeticException{
        logger.info("Computing squareRoot function");
        if(inp < 0){
            throw new ArithmeticException("Square root of a negative number found");
        }
        return Math.sqrt(inp);
    }

    public double factorial(double inp)throws ArithmeticException{
        logger.info("Computing factorial function");
        if(inp < 0){
            throw new ArithmeticException("Factorial of a negative number found");
        }
        int x = (int)inp;
        if(inp == 0){
            return 1;
        }
        return x*(factorial(x-1));
    }

    public double ln(double inp)throws ArithmeticException{
        logger.info("Computing log_e function");
        if(inp <= 0){
            throw new ArithmeticException("log of a non positive number found");
        }
        return Math.log(inp);
    }

    public double power(double inp1, double inp2)throws ArithmeticException{
        logger.info("Computing power function");
        if(inp1 == inp2 && inp1 == 0){
            throw new ArithmeticException("0^0 found");
        }
        double x = inp1;
        int y = (int)inp2;
        double ans = Math.pow(x,y);
        if(y%2 == 0){
            ans = Math.abs(ans);
        }
        return ans;
    }

    @Override
    public double compute_expression(String xpr) throws ArithmeticException{
        logger.info("Computing compute_expression function");
//        xpr= xpr.replaceAll("\\(","<");
//        xpr = xpr.replaceAll("\\)",">");
//        xpr = xpr.replaceAll("\\^","_");
//        int n = xpr.length();
//        ArrayList<Integer> spec_symbs = new ArrayList<>();
//        for(int i=0; i<n; i++){
//            if(xpr.charAt(i) == 's' || xpr.charAt(i) == '!' || xpr.charAt(i) == 'l' || xpr.charAt(i) == '_'){
//                spec_symbs.add(i);
//            }
//        }
//
//        int acc_red = 0;
//        for(Integer i: spec_symbs){
////            System.out.println(xpr+" "+i+" "+acc_red);
//            n -= acc_red;
//            if(xpr.charAt(i-acc_red) == 's'){
//                i = i-acc_red;
//                int j=i+5;
//                boolean check = false;
//                for(int k=i+5; k<n; k++){
//                    if(xpr.charAt(k) == '>'){
//                        check = true;
//                        j=k;
//                        break;
//                    }
//                }
//                if(!check){
//                    throw new ArithmeticException("Matching bracket for sqrt function at "+i+"not found");
//                }
//                String snum = xpr.substring(i+5,j);
//                double num = squareRoot(ncal.compute_expression(snum));
//                String snum1 = String.valueOf(num);
//                snum = xpr.substring(i,j+1);
//
//                int n1 = xpr.length();
//                xpr = xpr.replaceFirst(snum, snum1);
//                acc_red += n1 - xpr.length();
//            }
//            else if(xpr.charAt(i-acc_red) == '!'){
//                i -= acc_red;
//                int j=0;
//                for(int k=i-1; k>=0; k--){
//                    if(xpr.charAt(k) == '<' || xpr.charAt(k) == '+' || xpr.charAt(k) == '*' || xpr.charAt(k) == '/'){
//                        j=k+1;
//                        break;
//                    }
//                    else if(xpr.charAt(k) == '-'){
//                        if(k == 0){
//                            j=k;
//                            break;
//                        }
//                        else if(xpr.charAt(k-1) == '<' || xpr.charAt(k-1) == '+' || xpr.charAt(k-1) == '-' || xpr.charAt(k-1) == '*' || xpr.charAt(k-1) == '/'){
//                            j=k;
//                            break;
//                        }
//                    }
//                }
//                String snum = xpr.substring(j,i);
//                double num = factorial(ncal.compute_expression(snum));
//                String snum1 = String.valueOf(num);
//                snum = xpr.substring(j,i+1);
//
//                int n1 = xpr.length();
//                xpr = xpr.replaceFirst(snum, snum1);
//                acc_red += n1 - xpr.length();
//            }
//            else if(xpr.charAt(i-acc_red) == 'l'){
//                i = i-acc_red;
//                int j=i+3;
//                boolean check = false;
//                for(int k=i+3; k<n; k++){
//                    if(xpr.charAt(k) == '>'){
//                        check = true;
//                        j=k;
//                        break;
//                    }
//                }
//                if(!check){
//                    throw new ArithmeticException("Matching bracket for log function at "+i+"not found");
//                }
//                String snum = xpr.substring(i+3,j);
//                double num = ln(ncal.compute_expression(snum));
//                String snum1 = String.valueOf(num);
//                snum = xpr.substring(i,j+1);
//
//                int n1 = xpr.length();
//                xpr = xpr.replaceFirst(snum, snum1);
//                acc_red += n1 - xpr.length();
//            }
//            else if(xpr.charAt(i-acc_red) == '_'){
//                i = i-acc_red;
//                int j=0;
//                for(int k=i-1; k>=0; k--){
//                    if(xpr.charAt(k) == '<' || xpr.charAt(k) == '+' || xpr.charAt(k) == '*' || xpr.charAt(k) == '/'){
//                        j=k+1;
//                        break;
//                    }
//                    else if(xpr.charAt(k) == '-'){
//                        if(k == 0){
//                            j=k;
//                            break;
//                        }
//                        else if(xpr.charAt(k-1) == '<' || xpr.charAt(k-1) == '+' || xpr.charAt(k-1) == '-' || xpr.charAt(k-1) == '*' || xpr.charAt(k-1) == '/'){
//                            j=k;
//                            break;
//                        }
//                    }
//                }
//                String snum = xpr.substring(j,i);
//                double x = Double.parseDouble(snum);
//                int l = j;
//
//                j=i+2;
//                boolean check = false;
//                for(int k=i+2; k<n; k++){
//                    if(xpr.charAt(k) == '>'){
//                        check = true;
//                        j=k;
//                        break;
//                    }
//                }
//                if(!check){
//                    throw new ArithmeticException("Matching bracket for power function at "+i+" not found");
//                }
//                snum = xpr.substring(i+2,j);
//                double y = ncal.compute_expression(snum);
//                y = power(x,y);
//                String snum1 = String.valueOf(y);
//                snum = xpr.substring(l,j+1);
//
//                int n1 = xpr.length();
//                xpr = xpr.replaceFirst(snum, snum1);
//                acc_red += n1 - xpr.length();
//            }
//        }
//
//        xpr = xpr.replaceAll("<","\\(");
//        xpr = xpr.replaceAll(">","\\)");
////        System.out.println(xpr);
//        return ncal.compute_expression(xpr);
        Operator factorial_op = new Operator("!", 1, true, Operator.PRECEDENCE_POWER+1) {
            @Override
            public double apply(double... args) {
                return factorial(args[0]);
            }
        };

        double result = new ExpressionBuilder(xpr).operator(factorial_op).build().evaluate();
        return result;
    }

    public static void main(String[] args) {
        Scanner cli_inp = new Scanner(System.in);
        ScientificCalculator sc = new ScientificCalculator(0);

//        double inp;
//        System.out.print("Square Root Input: ");
//        inp = cli_inp.nextDouble();
//        System.out.println("Answer: "+sc.squareRoot(inp));
//
//        System.out.print("Factorial Input: ");
//        inp = cli_inp.nextDouble();
//        System.out.println("Answer: "+sc.factorial(inp));
//
//        System.out.print("Log_e Input: ");
//        inp = cli_inp.nextDouble();
//        System.out.println("Answer: "+sc.ln(inp));
//
//        System.out.print("Power Input: ");
//        inp = cli_inp.nextDouble();
//        double inp1 = cli_inp.nextDouble();
//        System.out.println("Answer: "+sc.power(inp, inp1));

        String inp;
        System.out.print("Enter math expression: ");
//        ((((2.0+8/ln(5))+-4^(2)))/((5!)))
        inp = cli_inp.next();
        System.out.println("Result: "+sc.compute_expression(inp));
    }
}
