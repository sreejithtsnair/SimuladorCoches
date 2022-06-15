<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="head.jsp"/>

    <jsp:include page="nav_var.jsp">
        <jsp:param name="page" value="lista"/>
    </jsp:include>

    <h1>Lista Coches</h1>

    <c:forEach var="unCoche" items="${listaCoche}">
        <div class="card" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">${unCoche.marca}</h5>
                <h6 class="card-subtitle mb-2 text-muted">${unCoche.tipo}</h6>
                <p class="card-text">Vel: ${unCoche.velocidad}</p>
                <p class="card-text">CV: ${unCoche.CV}</p>
            </div>
            </div>
    </c:forEach>

    

<jsp:include page="foot.jsp"/>
