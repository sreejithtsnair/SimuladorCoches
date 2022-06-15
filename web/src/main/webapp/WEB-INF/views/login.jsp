<jsp:include page="head.jsp" />

    <h1>Login</h1>

    <div>${not empty error?"Datos incorrectos":""}</div>

    <form action="" method="POST">
        <div><input name="email" placeholder="email" type="email"></div>
        <div><input name="password" placeholder="password" type="password"></div>
        <div><button>Entrar</button></div>
    </form>

<jsp:include page="foot.jsp" />
