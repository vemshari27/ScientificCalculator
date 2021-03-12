<%@ page import="java.util.List" %>
<%@ page import="iiitb.org.ScientificCalculator.entities.MathXpr" %><%--
  Created by IntelliJ IDEA.
  User: srihari
  Date: 12/03/21
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Scientific Calculator</title>--%>
<%--    <!-- Latest compiled and minified CSS -->--%>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="col container-fluid p-3 my-3 border">--%>
<%--    <div class="form-group row">--%>
<%--        <label for="xpr">Mathematical Expression:</label>--%>
<%--        <input type="text" class="form-control" id="xpr" name="xpr">--%>
<%--        <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--    </div>--%>
<%--    <div class="row container">--%>
<%--        121--%>
<%--    </div>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expression solver</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-padding-16 w3-center">
    <h1>Expression solver</h1>
</div>
<div>
    <form method="post" class="w3-selection w3-light-grey w3-padding">
        <label>Mathematical Expression:
            <input type="text" name="xpr" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
        </label>
        <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Submit</button>
    </form>
</div>
<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-light-blue">
            <h2>History</h2>
        </div>
        <%
            List<MathXpr> names = (List<MathXpr>) request.getAttribute("display");

            if (names != null && !names.isEmpty()) {
                out.println("<table class=\"w3-table w3-striped w3-bordered\">");
                boolean check = true;
                for (MathXpr s : names) {
                    if(check) {
                        out.println("<tr style=\"background-color:#666699\">\n<td>" + s.getXpr() + "</td>\n<td>" + s.getRes() + "</td>\n</tr>\n");
                        check = false;
                    }
                    else{
                        out.println("<tr>\n<td>"+s.getXpr()+"</td>\n<td>"+s.getRes()+"</td>\n</tr>\n");
                    }
                }
                out.println("</table>");

            }
        %>
    </div>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='index.jsp'">Back to main</button>
</div>
</body>
</html>