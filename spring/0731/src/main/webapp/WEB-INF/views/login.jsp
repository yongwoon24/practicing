<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form action="<c:url value='/login'/>" method="post">
        <div>
            <label>Username: <input type="text" name="username" /></label>
        </div>
        <div>
            <label>Password: <input type="password" name="password" /></label>
        </div>
        <div>
            <input type="submit" value="Login" />
        </div>
    </form>
</body>
</html>
