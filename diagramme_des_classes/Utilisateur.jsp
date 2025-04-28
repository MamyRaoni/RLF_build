<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="UtilisateurBean" scope="page" class="diagramme_des_classes.UtilisateurProcessor" />
<jsp:setProperty name="UtilisateurBean" property="*" />
<% String result = UtilisateurBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'UtilisateurList.jsp';
		return true;
	}
// -->
</script>
<head><title>Utilisateur</title>
</head>
<body>
<h1>Utilisateur</h1>
<form method="POST" name="form1" action=Utilisateur.jsp>
	<table>
		<tr>
			<td>*ID_user : </td>
			<td><input type=text name="ID_user" value="<jsp:getProperty name="UtilisateurBean" property="ID_user"/>" /></td>
		</tr>
		<tr>
			<td>Nom : </td>
			<td><input type=text name="nom" value="<jsp:getProperty name="UtilisateurBean" property="nom"/>" /></td>
		</tr>
		<tr>
			<td>Mdp : </td>
			<td><input type=text name="mdp" value="<jsp:getProperty name="UtilisateurBean" property="mdp"/>" /></td>
		</tr>
		<tr>
			<td>Type : </td>
			<td><input type=text name="type" value="<jsp:getProperty name="UtilisateurBean" property="type"/>" /></td>
		</tr>
		<tr>
			<td>Verification_Identite_verification_IdentiteID_verif : </td>
			<td><input type=text name="verification_Identite_verification_IdentiteID_verif" value="<jsp:getProperty name="UtilisateurBean" property="verification_Identite_verification_IdentiteID_verif"/>" /></td>
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
