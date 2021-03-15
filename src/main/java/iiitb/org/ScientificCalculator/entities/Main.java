package iiitb.org.ScientificCalculator.entities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    public void app(int x) {
        logger.info("Using Web App");
        Scanner cli_inp = new Scanner(System.in);
        ScientificCalculator scal = new ScientificCalculator(0);

        int menu_op;
        System.out.println("Menu options: 1. Scientific Calculator 2. Expression Solver");
        menu_op = 2;
        if(menu_op == 1){
            System.out.println("Menu options: 1. sqrt 2. fact 3. ln 4. power");
            menu_op = 4;
            if(menu_op == 1){
                menu_op = 4;
                System.out.println(scal.squareRoot(menu_op));
            }
            else if(menu_op == 2){
                menu_op = 2;
                System.out.println(scal.factorial(menu_op));
            }
            else if(menu_op == 3){
                menu_op = 3;
                System.out.println(scal.ln(menu_op));
            }
            else if(menu_op == 4){
                menu_op = 1;
                int tmp = 2;
                System.out.println(scal.power(menu_op,tmp));
            }
        }
        else if(menu_op == 2){
            System.out.println("Enter expression: ");
            String tmp = "2+2";
            System.out.println(scal.compute_expression(tmp));
        }
    }
}
