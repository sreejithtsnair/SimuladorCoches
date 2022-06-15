<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>

    <div>${not empty error?"Datos incorrectos":""}</div>

    <form action="" method="POST">
        <div><input name="email" placeholder="email" type="email"></div>
        <div><input name="password" placeholder="password" type="password"></div>
        <div><button>Entrar</button></div>
    </form>

</body>

</html>