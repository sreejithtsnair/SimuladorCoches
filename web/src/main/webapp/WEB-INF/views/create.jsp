<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear coches</title>
</head>
<body>
    <h1>Alta de coches</h1>

    <div>${error}</div>

    <form action="" method="POST">
        <div><input name="marca" value="${datos.marca}" placeholder="marca" type="text"></div>
        <div><input name="tipo" value="${datos.tipo}" placeholder="tipo" type="text"></div>
        <div><input name="velocidad" value="${datos.velocidad}" placeholder="velocidad" type="number"></div>
        <div><input name="power" value="${datos.CV}" placeholder="power" type="number"></div>
        <button>Crear</button>
    </form>
    
</body>
</html>