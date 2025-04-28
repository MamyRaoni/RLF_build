<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="PaiementBean" scope="page" class="diagramme_des_classes.PaiementProcessor" />
<jsp:setProperty name="PaiementBean" property="*" />
<% String result = PaiementBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PaiementList.jsp';
		return true;
	}
// -->
</script>
<head><title>Paiement</title>
</head>
<body>
<h1>Paiement</h1>
<form method="POST" name="form1" action=Paiement.jsp>
	<table>
		<tr>
			<td>*ID_paiement : </td>
			<td><input type=text name="ID_paiement" value="<jsp:getProperty name="PaiementBean" property="ID_paiement"/>" /></td>
		</tr>
		<tr>
			<td>Don : </td>
			<td><input type=text name="don" value="<jsp:getProperty name="PaiementBean" property="don"/>" /></td>
		</tr>
		<tr>
			<td>Etat : </td>
			<td><input type=text name="etat" value="<jsp:getProperty name="PaiementBean" property="etat"/>" /></td>
		</tr>
		<tr>
			<td>RecuEnvoyé : </td>
			<td><input type=text name="recuEnvoyé" value="<jsp:getProperty name="PaiementBean" property="recuEnvoyé"/>" /></td>
		</tr>
		<tr>
			<td>Don_paiement_donID_don : </td>
			<td><input type=text name="don_paiement_donID_don" value="<jsp:getProperty name="PaiementBean" property="don_paiement_donID_don"/>" /></td>
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
