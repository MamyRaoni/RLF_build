<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="ProjetBean" scope="page" class="diagramme_des_classes.ProjetProcessor" />
<jsp:setProperty name="ProjetBean" property="*" />
<% String result = ProjetBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ProjetList.jsp';
		return true;
	}
// -->
</script>
<head><title>Projet</title>
</head>
<body>
<h1>Projet</h1>
<form method="POST" name="form1" action=Projet.jsp>
	<table>
		<tr>
			<td>*ID_projet : </td>
			<td><input type=text name="ID_projet" value="<jsp:getProperty name="ProjetBean" property="ID_projet"/>" /></td>
		</tr>
		<tr>
			<td>Titre : </td>
			<td><input type=text name="titre" value="<jsp:getProperty name="ProjetBean" property="titre"/>" /></td>
		</tr>
		<tr>
			<td>Description : </td>
			<td><input type=text name="description" value="<jsp:getProperty name="ProjetBean" property="description"/>" /></td>
		</tr>
		<tr>
			<td>ObjectifMontant : </td>
			<td><input type=text name="objectifMontant" value="<jsp:getProperty name="ProjetBean" property="objectifMontant"/>" /></td>
		</tr>
		<tr>
			<td>MontantActuel : </td>
			<td><input type=text name="montantActuel" value="<jsp:getProperty name="ProjetBean" property="montantActuel"/>" /></td>
		</tr>
		<tr>
			<td>DateDebut : </td>
			<td><input type=text name="dateDebut" value="<jsp:getProperty name="ProjetBean" property="dateDebut"/>" /></td>
		</tr>
		<tr>
			<td>DateFin : </td>
			<td><input type=text name="dateFin" value="<jsp:getProperty name="ProjetBean" property="dateFin"/>" /></td>
		</tr>
		<tr>
			<td>Statut : </td>
			<td><input type=text name="statut" value="<jsp:getProperty name="ProjetBean" property="statut"/>" /></td>
		</tr>
		<tr>
			<td>Utilisateur_utilisateurID_user : </td>
			<td><input type=text name="utilisateur_utilisateurID_user" value="<jsp:getProperty name="ProjetBean" property="utilisateur_utilisateurID_user"/>" /></td>
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
