<!DOCTYPE html>
<%@page import="model.Prodotto"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Funziona Web</h1>
<%

// qui posso scrivere codice java incorporato in html.


//su local host ci sono tanti servizi.
//tomcat ripsnde alla porta 8080.
//mysql risponde alla porta numero 3306.
//ogni servizio occupa una porta.

//spazio web che utilizeremo per fare applicaizoni web.
//la cartella webapp rappresenta il mio spazio web.

//il codice java che vorremmo scrivere  non lo mettiamo dentor webappp ma dentro java results

//spring per usare web application

//@ è una direttiva
//%= è una shortcut

Prodotto p = new Prodotto();

p.nome = "giacca";


%>
<h2><% 
// al posto di out.print(p) possiamo mettere un = dopo il primo % 
out.print(p); %></h2>
</body>
</html>