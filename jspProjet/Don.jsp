<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="DonBean" scope="page" class="diagramme_des_classes.DonProcessor" />
<jsp:setProperty name="DonBean" property="*" />
<% String result = DonBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'DonList.jsp';
		return true;
	}
// -->
</script>
<head><title>Don</title>
</head>
<body>
<h1>Don</h1>
<form method="POST" name="form1" action=Don.jsp>
	<table>
		<tr>
			<td>*ID_don : </td>
			<td><input type=text name="ID_don" value="<jsp:getProperty name="DonBean" property="ID_don"/>" /></td>
		</tr>
		<tr>
			<td>Montant : </td>
			<td><input type=text name="montant" value="<jsp:getProperty name="DonBean" property="montant"/>" /></td>
		</tr>
		<tr>
			<td>Date : </td>
			<td><input type=text name="date" value="<jsp:getProperty name="DonBean" property="date"/>" /></td>
		</tr>
		<tr>
			<td>Contributeur : </td>
			<td><input type=text name="contributeur" value="<jsp:getProperty name="DonBean" property="contributeur"/>" /></td>
		</tr>
		<tr>
			<td>Projet : </td>
			<td><input type=text name="projet" value="<jsp:getProperty name="DonBean" property="projet"/>" /></td>
		</tr>
		<tr>
			<td>Utilisateur_utilisateurID_user : </td>
			<td><input type=text name="utilisateur_utilisateurID_user" value="<jsp:getProperty name="DonBean" property="utilisateur_utilisateurID_user"/>" /></td>
		</tr>
		<tr>
			<td>Projet_don_projetID_projet : </td>
			<td><input type=text name="projet_don_projetID_projet" value="<jsp:getProperty name="DonBean" property="projet_don_projetID_projet"/>" /></td>
		</tr>
		<tr>
			<td>Paiement_paiementID_paiement : </td>
			<td><input type=text name="paiement_paiementID_paiement" value="<jsp:getProperty name="DonBean" property="paiement_paiementID_paiement"/>" /></td>
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
