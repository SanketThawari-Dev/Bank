<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome to ABC Bank</title>
</head>
<body>

<h1>Welcome to ABC Bank</h1>

<p>
    ABC Bank is a secure and trusted banking platform.
    Manage your accounts, transactions, and services online.
</p>

<p>
    <strong>Services:</strong><br>
    • Online Banking<br>
    • Secure Transactions<br>
    • 24/7 Account Access
</p>

<br>

<form action="${pageContext.request.contextPath}/login" method="get">
    <button type="submit">Login</button>
</form>

</body>
</html>
