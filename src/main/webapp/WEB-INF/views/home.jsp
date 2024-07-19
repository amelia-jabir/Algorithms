<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="../../static/css/styles.css">

</head>

<body>
<header>
    <h1>Choose a problem you'd like to solve</h1>
</header>
<main>
    <div class="container">
        <div class="row">
            <c:forEach items="${problemList}" var="problem">
                <a href="/problem/${problem.uri}" class="problem-forward">
                    <div class="col l4">${problem.displayname}</div>
                </a>
            </c:forEach>
        </div>
    </div>
</main>
</body>

</html>