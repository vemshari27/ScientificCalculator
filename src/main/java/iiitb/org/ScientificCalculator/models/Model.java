package iiitb.org.ScientificCalculator.models;

import iiitb.org.ScientificCalculator.entities.MathXpr;
import iiitb.org.ScientificCalculator.entities.ScientificCalculator;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static Model instance = null;
    private ScientificCalculator scal;
    private int acc_val;
    private int curr_buff;
    private char op;
    private List<MathXpr> history;

    private Model(){
        scal = new ScientificCalculator(0);
        acc_val = 0;
        curr_buff = 0;
        op = '\0';
        history = new ArrayList<MathXpr>();
    }

    public static Model getInstance() {
        if(instance == null){
            return new Model();
        }
        return instance;
    }

    public ScientificCalculator getScal() {
        return scal;
    }

    public void setScal(ScientificCalculator scal) {
        this.scal = scal;
    }

    public int getAcc_val() {
        return acc_val;
    }

    public void setAcc_val(int acc_val) {
        this.acc_val = acc_val;
    }

    public int getCurr_buff() {
        return curr_buff;
    }

    public void setCurr_buff(int curr_buff) {
        this.curr_buff = curr_buff;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public List<MathXpr> getHistory() {
        return history;
    }

    public void setHistory(List<MathXpr> history) {
        this.history = history;
    }

    public void compute(String xpr){
        double res = scal.compute_expression(xpr);
        history.add(new MathXpr(xpr, res));
    }
}
