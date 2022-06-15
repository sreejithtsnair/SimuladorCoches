<jsp:include page="head.jsp" />
<jsp:include page="nav_var.jsp">
    <jsp:param name="page" value="create" />
</jsp:include>

<h1>Alta de coches</h1>

<div>${error}</div>

<form action="" method="POST">
    <div class="row">
        <div class="col"><input class="form-control" name="marca" value="${datos.marca}" placeholder="marca"
                type="text"></div>
        <div class="col"><input class="form-control" name="tipo" value="${datos.tipo}" placeholder="tipo" type="text">
        </div>
        <div class="col"><input class="form-control" name="velocidad" value="${datos.velocidad}" placeholder="velocidad"
                type="number"></div>
        <div class="col"><input class="form-control" name="power" value="${datos.CV}" placeholder="power" type="number">
        </div>
        <button class="btn btn-primary">Crear</button>
    </div>
</form>

<jsp:include page="foot.jsp" />