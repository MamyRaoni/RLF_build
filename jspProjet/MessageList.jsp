<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Message List</title>
</head>
<body>
<center>
<h1>Message List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID_message(PK)</td>
		<td>Contenu</td>
		<td>DeteEnvoi</td>
		<td>Expediteur</td>
		<td>Projet</td>
		<td>Projet_message(FK)</td>
		<td>Utilisateur(FK)</td>
		<td></td>
	</tr>
<%
diagramme_des_classes.Message[] messages = diagramme_des_classes.Message.listMessageByQuery(null, null);
for(int i = 0; i < messages.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(messages[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(messages[i].getContenu());
		out.println("</td>");
		out.print("<td>");
		out.print(messages[i].getDeteEnvoi());
		out.println("</td>");
		out.print("<td>");
		out.print(messages[i].getExpediteur());
		out.println("</td>");
		out.print("<td>");
		out.print(messages[i].getProjet());
		out.println("</td>");
		
		diagramme_des_classes.Projet projet_message = messages[i].getProjet_message();
		if(projet_message != null) {
			out.print("<td>");
			out.print("<a href=\"Projet.jsp?action=search&ID_projet=");
			out.print(projet_message.getORMID());
			out.print("\">");
			out.print(projet_message.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		diagramme_des_classes.Utilisateur utilisateur = messages[i].getUtilisateur();
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
		out.print("<a href=\"Message.jsp?action=search&ID_message=");
		out.print(messages[i].getORMID());
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
<a href="Message.jsp">Add Message</a>
</center>
</body>
</html>
