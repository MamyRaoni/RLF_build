<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="MessageBean" scope="page" class="diagramme_des_classes.MessageProcessor" />
<jsp:setProperty name="MessageBean" property="*" />
<% String result = MessageBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'MessageList.jsp';
		return true;
	}
// -->
</script>
<head><title>Message</title>
</head>
<body>
<h1>Message</h1>
<form method="POST" name="form1" action=Message.jsp>
	<table>
		<tr>
			<td>*ID_message : </td>
			<td><input type=text name="ID_message" value="<jsp:getProperty name="MessageBean" property="ID_message"/>" /></td>
		</tr>
		<tr>
			<td>Contenu : </td>
			<td><input type=text name="contenu" value="<jsp:getProperty name="MessageBean" property="contenu"/>" /></td>
		</tr>
		<tr>
			<td>DeteEnvoi : </td>
			<td><input type=text name="deteEnvoi" value="<jsp:getProperty name="MessageBean" property="deteEnvoi"/>" /></td>
		</tr>
		<tr>
			<td>Expediteur : </td>
			<td><input type=text name="expediteur" value="<jsp:getProperty name="MessageBean" property="expediteur"/>" /></td>
		</tr>
		<tr>
			<td>Projet : </td>
			<td><input type=text name="projet" value="<jsp:getProperty name="MessageBean" property="projet"/>" /></td>
		</tr>
		<tr>
			<td>Projet_message_projetID_projet : </td>
			<td><input type=text name="projet_message_projetID_projet" value="<jsp:getProperty name="MessageBean" property="projet_message_projetID_projet"/>" /></td>
		</tr>
		<tr>
			<td>Utilisateur_utilisateurID_user : </td>
			<td><input type=text name="utilisateur_utilisateurID_user" value="<jsp:getProperty name="MessageBean" property="utilisateur_utilisateurID_user"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
