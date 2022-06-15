<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista Coches</title>
</head>

<body>
    <h1>Lista Coches</h1>
    <ul>
        <c:forEach var="unCoche" items="${listaCoche}">
            <li>
                <div>${unCoche.marca}</div>
                <div>${unCoche.tipo}</div>
                <div>${unCoche.velocidad}</div>
                <div>${unCoche.CV}</div>                
            </li>
       </c:forEach>
    </ul>

</body>

</html>