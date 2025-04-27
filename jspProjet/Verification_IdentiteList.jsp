<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Verification_Identite List</title>
</head>
<body>
<center>
<h1>Verification_Identite List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID_verif(PK)</td>
		<td>Utilisateur</td>
		<td>Etat</td>
		<td>Utilisateur_val(FK)</td>
		<td></td>
	</tr>
<%
diagramme_des_classes.Verification_Identite[] verification_Identites = diagramme_des_classes.Verification_Identite.listVerification_IdentiteByQuery(null, null);
for(int i = 0; i < verification_Identites.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(verification_Identites[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(verification_Identites[i].getUtilisateur());
		out.println("</td>");
		out.print("<td>");
		out.print(verification_Identites[i].getEtat());
		out.println("</td>");
		
		diagramme_des_classes.Utilisateur utilisateur_val = verification_Identites[i].getUtilisateur_val();
		if(utilisateur_val != null) {
			out.print("<td>");
			out.print("<a href=\"Utilisateur.jsp?action=search&ID_user=");
			out.print(utilisateur_val.getORMID());
			out.print("\">");
			out.print(utilisateur_val.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Verification_Identite.jsp?action=search&ID_verif=");
		out.print(verification_Identites[i].getORMID());
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
<a href="Verification_Identite.jsp">Add Verification_Identite</a>
</center>
</body>
</html>
