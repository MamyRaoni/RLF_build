<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Don List</title>
</head>
<body>
<center>
<h1>Don List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID_don(PK)</td>
		<td>Montant</td>
		<td>Date</td>
		<td>Contributeur</td>
		<td>Projet</td>
		<td>Utilisateur(FK)</td>
		<td>Projet_don(FK)</td>
		<td>Paiement(FK)</td>
		<td></td>
	</tr>
<%
diagramme_des_classes.Don[] dons = diagramme_des_classes.Don.listDonByQuery(null, null);
for(int i = 0; i < dons.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(dons[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(dons[i].getMontant());
		out.println("</td>");
		out.print("<td>");
		out.print(dons[i].getDate());
		out.println("</td>");
		out.print("<td>");
		out.print(dons[i].getContributeur());
		out.println("</td>");
		out.print("<td>");
		out.print(dons[i].getProjet());
		out.println("</td>");
		
		diagramme_des_classes.Utilisateur utilisateur = dons[i].getUtilisateur();
		if(utilisateur != null) {
			out.print("<td>");
			out.print("<a href=\"Utilisateur.jsp?action=search&ID_user=");
			out.print(utilisateur.getORMID());
			out.print("\">");
			out.print(utilisateur.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		diagramme_des_classes.Projet projet_don = dons[i].getProjet_don();
		if(projet_don != null) {
			out.print("<td>");
			out.print("<a href=\"Projet.jsp?action=search&ID_projet=");
			out.print(projet_don.getORMID());
			out.print("\">");
			out.print(projet_don.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		diagramme_des_classes.Paiement paiement = dons[i].getPaiement();
		if(paiement != null) {
			out.print("<td>");
			out.print("<a href=\"Paiement.jsp?action=search&ID_paiement=");
			out.print(paiement.getORMID());
			out.print("\">");
			out.print(paiement.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Don.jsp?action=search&ID_don=");
		out.print(dons[i].getORMID());
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
<a href="Don.jsp">Add Don</a>
</center>
</body>
</html>
