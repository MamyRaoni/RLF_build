<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Projet List</title>
</head>
<body>
<center>
<h1>Projet List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID_projet(PK)</td>
		<td>Titre</td>
		<td>Description</td>
		<td>ObjectifMontant</td>
		<td>MontantActuel</td>
		<td>DateDebut</td>
		<td>DateFin</td>
		<td>Statut</td>
		<td>Utilisateur(FK)</td>
		<td></td>
	</tr>
<%
diagramme_des_classes.Projet[] projets = diagramme_des_classes.Projet.listProjetByQuery(null, null);
for(int i = 0; i < projets.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(projets[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(projets[i].getTitre());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getDescription());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getObjectifMontant());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getMontantActuel());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getDateDebut());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getDateFin());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getStatut());
		out.println("</td>");
		
		diagramme_des_classes.Utilisateur utilisateur = projets[i].getUtilisateur();
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
		
		out.print("<td>");
		out.print("<a href=\"Projet.jsp?action=search&ID_projet=");
		out.print(projets[i].getORMID());
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
<a href="Projet.jsp">Add Projet</a>
</center>
</body>
</html>
