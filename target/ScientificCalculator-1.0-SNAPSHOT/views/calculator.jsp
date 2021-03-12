<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta http-equiv="x-ua-compatible" content="ie=edge" />
    <title>Material Design for Bootstrap</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <!-- Google Fonts Roboto -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <!-- Material Design Bootstrap -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css">
    <!-- Your custom styles (optional) -->
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
<div class="container my-4">

    <hr class="mb-5"/>


    <div class="calculator card">

        <input type="text" class="calculator-screen z-depth-1" value="" disabled />

        <div class="calculator-keys">

            <button type="button" class="operator btn btn-info" value="+">+</button>
            <button type="button" class="operator btn btn-info" value="-">-</button>
            <button type="button" class="operator btn btn-info" value="*">&times;</button>
            <button type="button" class="operator btn btn-info" value="/">&divide;</button>

            <button type="button" value="7" class="btn btn-light waves-effect">7</button>
            <button type="button" value="8" class="btn btn-light waves-effect">8</button>
            <button type="button" value="9" class="btn btn-light waves-effect">9</button>


            <button type="button" value="4" class="btn btn-light waves-effect">4</button>
            <button type="button" value="5" class="btn btn-light waves-effect">5</button>
            <button type="button" value="6" class="btn btn-light waves-effect">6</button>


            <button type="button" value="1" class="btn btn-light waves-effect">1</button>
            <button type="button" value="2" class="btn btn-light waves-effect">2</button>
            <button type="button" value="3" class="btn btn-light waves-effect">3</button>


            <button type="button" value="0" class="btn btn-light waves-effect">0</button>
            <button type="button" class="decimal function btn btn-secondary" value=".">.</button>
            <button type="button" class="all-clear function btn btn-danger btn-sm" value="all-clear">AC</button>

            <button type="button" class="equal-sign operator btn btn-default" value="=">=</button>

        </div>
    </div>
</div>
<!-- jQuery -->
<%--<script type="text/javascript" src="js/jquery.min.js"></script>--%>
<%--<!-- Bootstrap tooltips -->--%>
<%--<script type="text/javascript" src="js/popper.min.js"></script>--%>
<%--<!-- Bootstrap core JavaScript -->--%>
<%--<script type="text/javascript" src="js/bootstrap.min.js"></script>--%>
<%--<!-- MDB core JavaScript -->--%>
<%--<script type="text/javascript" src="js/mdb.min.js"></script>--%>
<%--<!-- Your custom scripts -->--%>
<%--<script type="text/javascript" src="js/script.js"></script>--%>
</body>
</html>