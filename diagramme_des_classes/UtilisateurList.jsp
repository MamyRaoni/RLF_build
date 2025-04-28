<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Utilisateur List</title>
</head>
<body>
<center>
<h1>Utilisateur List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID_user(PK)</td>
		<td>Nom</td>
		<td>Mdp</td>
		<td>Type</td>
		<td>Verification_Identite(FK)</td>
		<td></td>
	</tr>
<%
diagramme_des_classes.Utilisateur[] utilisateurs = diagramme_des_classes.Utilisateur.listUtilisateurByQuery(null, null);
for(int i = 0; i < utilisateurs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(utilisateurs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getMdp());
		out.println("</td>");
		out.print("<td>");
		out.print(utilisateurs[i].getType());
		out.println("</td>");
		
		diagramme_des_classes.Verification_Identite verification_Identite = utilisateurs[i].getVerification_Identite();
		if(verification_Identite != null) {
			out.print("<td>");
			out.print("<a href=\"Verification_Identite.jsp?action=search&ID_verif=");
			out.print(verification_Identite.getORMID());
			out.print("\">");
			out.print(verification_Identite.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Utilisateur.jsp?action=search&ID_user=");
		out.print(utilisateurs[i].getORMID());
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
<a href="Utilisateur.jsp">Add Utilisateur</a>
</center>
</body>
</html>
