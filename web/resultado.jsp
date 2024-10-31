<%-- 
    Document   : resultado
    Author     : Axel
--%>

<%@ page import="model.Usuario" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado del IAC</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Resultado del Índice de Adiposidad Corporal (IAC)</h1>

    <%
        Usuario usuario = (Usuario) request.getAttribute("usuario");
    %>

    <p>Nombre: <%= usuario.getNombre() %></p>
    <p>Edad: <%= usuario.getEdad() %></p>
    <p>Sexo: <%= usuario.getSexo() %></p>
    <p>Estatura: <%= usuario.getEstatura() %> metros</p>
    <p>Cadera: <%= usuario.getCadera() %> cm</p>
    <p><strong>IAC Calculado: <%= usuario.getIAC() %></strong></p>

    <a href="index.html">Volver</a>
</body>
</html>
