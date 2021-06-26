<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <style>
        header {
            display: flex;
            flex-direction: row;
            margin-top: 30px;
        }
        
        .money {
            border: 2px solid gray;
            width: 150px;
            margin-left: 25px;
        }
        
        .huge {
            display: flex;
            flex-direction: row;
            justify-content: space-evenly;
            text-align: center;
            margin-top: 50px;
        }
        
        .well {
            border: 2px solid gray;
            height: 300px;
            padding-top: 23%;
            margin: 15px;
        }
    </style>
</head>

<body>
    <header>
        <h3>Your Gold: </h3>
        <h3 class="money">${totalGold}</h3>
    </header>
    <div class="huge">
        <div class="col-md-3">
            <div class="well">
                <h2>Farm</h2>
                <h5 class="text-default">
                    (earns 10-20 GOLD)
                </h5>
                <form action="/" method="POST">
                    <input type="hidden" name="building" value="farm.">
                    <input type="submit" class="btn btn-success shadow-lg p-3 pull-right" value="Find Gold!">
        </form>
            </div>
        </div>
        <div class="col-md-3">
            <div class="well">
                <h2>Cave</h2>
                <h5 class="text-default">
                    (earns 5-10 GOLD)
                </h5>
                <form action="/" method="POST">
                    <input type="hidden" name="building" value="cave.">
                    <input type="submit" class="btn btn-success shadow-lg p-3 pull-right" value="Find Gold!">
        </form>
            </div>
        </div>
        <div class="col-md-3">
            <div class="well">
                <h2>House</h2>
                <h5 class="text-default">
                    (earns 2-5 GOLD)
                </h5>
                <form action="/" method="POST">
                    <input type="hidden" name="building" value="house.">
                    <input type="submit" class="btn btn-success shadow-lg p-3 pull-right" value="Find Gold!">
        </form>
            </div>
        </div>
        <div class="col-md-3">
            <div class="well">
                <h2>Casino</h2>
                <h5 class="text-default">
                    (earns/takes 0-50 GOLDS)
                </h5>
                <form action="/" method="POST">
                    <input type="hidden" name="building" value="casino.">
                    <input type="submit" class="btn btn-success shadow-lg p-3 pull-right" value="Find Gold!">
        </form>
            </div>
        </div>
    </div>
    <div class="row">
        <h3>Activities:</h3>
        <div class="col-lg-12" style="height: 237px; overflow: scroll">
            <c:forEach items="${ activities }" var = "activity">
            
            <h4 class="text-success">${activity}</h4>
            </c:forEach>
           

        </div>
    </div>
</body>

</html>