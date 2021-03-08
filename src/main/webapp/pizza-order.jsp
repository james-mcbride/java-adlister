<%--
  Created by IntelliJ IDEA.
  User: jimmiemcbride
  Date: 3/8/21
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<form method="POST" action="pizza-order">

    <label for="address">Address</label>
    <input id="address" name="address" type="text">
    <br>

    <div class="card-header bg-primary text-white">
        Choose size and crust
    </div>
    <div class="card crust">
        <div class="card-header">
            Hand Tossed
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item">Garlic seasoned crust with a rich, buttery taste</li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="sizeAndCrust" id="crustSize1"
                           value="garlic crust 10in">
                    <label class="form-check-label" for="crustSize1">
                        Small (10")
                    </label>
                </div>
            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="sizeAndCrust" id="crustSize2"
                           value="garlic crust 12in" checked>
                    <label class="form-check-label" for="crustSize2">
                        Medium (12")
                    </label>
                </div>
            </li>
        </ul>
    </div>
    <div class="card crust">
        <div class="card-header">
            Crispy Thin
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item">Thin enough for optimum crispy to crunchy ratio.</li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="sizeAndCrust" id="crustSize3"
                           value="thin crust 12in">
                    <label class="form-check-label" for="crustSize3">
                        Medium (12")
                    </label>
                </div>
            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="sizeAndCrust" id="crustSize4"
                           value="thin crust 14in" checked>
                    <label class="form-check-label" for="crustSize4">
                        Large (14")
                    </label>
                </div>
            </li>
        </ul>
    </div>
    <div class="card-header bg-primary text-white">
        Choose cheese and sauce
    </div>
    <div class="card crust">
        <div class="card-header">
            Cheese
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item">
                <div class="form-group">
                    <label for="amountOfCheese">How much?</label>
                    <select class="form-control" id="amountOfCheese" name="amountOfCheese">
                        <option>Light</option>
                        <option>Normal</option>
                        <option>Extra</option>
                    </select>
                </div>
            </li>

        </ul>
    </div>
    <div class="card crust">
        <div class="card-header">
            Sauce
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item">
                <div class="form-group">
                    <label for="typeOfSauce">What type?</label>
                    <select class="form-control" id="typeOfSauce" name="typeOfSauce">
                        <option>Tomato Sauce</option>
                        <option>Marinara Sauce</option>
                        <option>BBQ Sauce</option>
                        <option>Alfredo Sauce</option>
                    </select>
                </div>
            </li>
            <li class="list-group-item">
                <div class="form-group">
                    <label for="amountOfSauce">How much?</label>
                    <select class="form-control" id="amountOfSauce" name="amountOfSauce">
                        <option>Light</option>
                        <option>Normal</option>
                        <option>Extra</option>
                    </select>
                </div>
            </li>
        </ul>
    </div>

    <div class="card-header bg-primary text-white">
        Choose Toppings
    </div>
    <div class="card crust">
        <div class="card-header">
            Choose Meats
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="beef" id="beef" name="beef">
                    <label class="form-check-label" for="beef">
                        Beef
                    </label>
                </div>
            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="ham" id="ham" name="ham">
                    <label class="form-check-label" for="ham">
                        Ham
                    </label>
                </div>

            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="steak" name="steak" id="steak">
                    <label class="form-check-label" for="steak">
                        Philly Steak
                    </label>
                </div>

            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="bacon" id="bacon" name="bacon">
                    <label class="form-check-label" for="bacon">
                        Bacon
                    </label>
                </div>

            </li>
        </ul>
    </div>
    <div class="card crust">
        <div class="card-header">
            Choose Non-Meats
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="peppers" id="peppers" name="peppers">
                    <label class="form-check-label" for="peppers">
                        Green Peppers
                    </label>
                </div>
            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="mushrooms" id="mushrooms" name="mushrooms">
                    <label class="form-check-label" for="mushrooms">
                        Mushrooms
                    </label>
                </div>

            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="onions" id="onions" name="onions">
                    <label class="form-check-label" for="onions">
                        Onions
                    </label>
                </div>

            </li>
            <li class="list-group-item">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="jalepenos" id="jalepenos" name="jalepenos">
                    <label class="form-check-label" for="jalepenos">
                        Jalepeno Peppers
                    </label>
                </div>

            </li>
        </ul>
    </div>
    <div class="card-footer text-muted text-right">
        <input type="submit">
    </div>
    <div>
        You ordered from: ${address}
    </div>
</form>

</body>
</html>
