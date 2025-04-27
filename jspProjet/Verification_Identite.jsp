<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="Verification_IdentiteBean" scope="page" class="diagramme_des_classes.Verification_IdentiteProcessor" />
<jsp:setProperty name="Verification_IdentiteBean" property="*" />
<% String result = Verification_IdentiteBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'Verification_IdentiteList.jsp';
		return true;
	}
// -->
</script>
<head><title>Verification_Identite</title>
</head>
<body>
<h1>Verification_Identite</h1>
<form method="POST" name="form1" action=Verification_Identite.jsp>
	<table>
		<tr>
			<td>*ID_verif : </td>
			<td><input type=text name="ID_verif" value="<jsp:getProperty name="Verification_IdentiteBean" property="ID_verif"/>" /></td>
		</tr>
		<tr>
			<td>Utilisateur : </td>
			<td><input type=text name="utilisateur" value="<jsp:getProperty name="Verification_IdentiteBean" property="utilisateur"/>" /></td>
		</tr>
		<tr>
			<td>Etat : </td>
			<td><input type=text name="etat" value="<jsp:getProperty name="Verification_IdentiteBean" property="etat"/>" /></td>
		</tr>
		<tr>
			<td>Utilisateur_val_utilisateurID_user : </td>
			<td><input type=text name="utilisateur_val_utilisateurID_user" value="<jsp:getProperty name="Verification_IdentiteBean" property="utilisateur_val_utilisateurID_user"/>" /></td>
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
