package iiitb.org.ScientificCalculator.servlets;

import iiitb.org.ScientificCalculator.entities.MathXpr;
import iiitb.org.ScientificCalculator.models.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorServlet extends HttpServlet {
    private Model model = Model.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MathXpr> display = model.getHistory();
        Collections.reverse(display);
        req.setAttribute("display", display);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(("views/calculator.jsp"));
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String xpr = req.getParameter("xpr");
        if(!xpr.isEmpty()) {
            model.compute(xpr);
        }
        doGet(req,resp);
    }
}
