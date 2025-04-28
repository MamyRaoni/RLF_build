<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Paiement List</title>
</head>
<body>
<center>
<h1>Paiement List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID_paiement(PK)</td>
		<td>Don</td>
		<td>Etat</td>
		<td>RecuEnvoyé</td>
		<td>Don_paiement(FK)</td>
		<td></td>
	</tr>
<%
diagramme_des_classes.Paiement[] paiements = diagramme_des_classes.Paiement.listPaiementByQuery(null, null);
for(int i = 0; i < paiements.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(paiements[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(paiements[i].getDon());
		out.println("</td>");
		out.print("<td>");
		out.print(paiements[i].getEtat());
		out.println("</td>");
		out.print("<td>");
		out.print(paiements[i].getRecuEnvoyé());
		out.println("</td>");
		
		diagramme_des_classes.Don don_paiement = paiements[i].getDon_paiement();
		if(don_paiement != null) {
			out.print("<td>");
			out.print("<a href=\"Don.jsp?action=search&ID_don=");
			out.print(don_paiement.getORMID());
			out.print("\">");
			out.print(don_paiement.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Paiement.jsp?action=search&ID_paiement=");
		out.print(paiements[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Paiement.jsp">Add Paiement</a>
</center>
</body>
</html>
