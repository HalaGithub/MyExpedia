<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Expedia Client</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="css/Master.css" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.theme.css" type="text/css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>

  $( function() {

    $( "#datepicker" ).datepicker();
    $( "#datepicker2" ).datepicker();

  } );

  </script>


</head>
<body>
<div id="content">
<div id="main-container">
<div class="requestSide">

<table align="center">
    <tbody>
        <tr>
            <td class="warning"> ${warningMsg}
            </td>
        </tr>
    </tbody>
</table>
<form name="expediaClient" method="post" action="GetMyOffers">

<p>Welcome, please let me know what you are looking for!</p>

<table>
	<tr>
		<td colspan="4" style="font-weight: bold;" colspan="2"></td>
	</tr>
	<tr>
		<td class="rowheader">Destination</td>
		<td colspan="3"><input type="text" name="destination"
			class=textfield /></td>
	</tr>
	<tr>
        <td class="rowheader">Length of Stay</td>
        <td colspan="3"><input type="text" name="lengthOfStay"
            class=textfield /></td>
    </tr>

	<tr>
		<td class="rowheader">Min Star Rating</td>
		<td><select name="minStarRate" class="textfield">
		    <option value="">--select--</option>
			<option value="1.0">*</option>
			<option value="2.0">**</option>
			<option value="3.0">***</option>
			<option value="4.0">****</option>
			<option value="5.0">*****</option>
			</html:select></td>

		<td class="rowheader">Max Star Rating</td>
		<td><select name="maxStarRate" class="textfield">
            <option value="">--select--</option>
			<option value="1.0">*</option>
			<option value="2.0">**</option>
			<option value="3.0">***</option>
			<option value="4.0">****</option>
			<option value="5.0">*****</option>
			</html:select></td>
	</tr>

	<tr>
		<td class="rowheader">Min Guest Rating</td>
		<td><select name="minGuestRate" class="textfield">
            <option value="">--select--</option>
			<option value="1.0">1</option>
			<option value="2.0">2</option>
			<option value="3.0">3</option>
			<option value="4.0">4</option>
			<option value="5.0">5</option>
			<option value="6.0">6</option>
			<option value="7.0">7</option>
			<option value="8.0">8</option>
			<option value="9.0">9</option>
			</html:select></td>

		<td class="rowheader">Max Guest Rating</td>
		<td><select name="maxGuestRate" class="textfield">
            <option value="">--select--</option>
			<option value="1.0">1</option>
			<option value="2.0">2</option>
			<option value="3.0">3</option>
			<option value="4.0">4</option>
			<option value="5.0">5</option>
			<option value="6.0">6</option>
			<option value="7.0">7</option>
			<option value="8.0">8</option>
			<option value="9.0">9</option>
			</html:select></td>
	</tr>

	<tr>
		<td class="rowheader">Min Total Rate</td>
		<td><select name="minTotalRate" class="textfield">
            <option value="">--select--</option>
			<option value="1.0">1</option>
			<option value="2.0">2</option>
			<option value="3.0">3</option>
			<option value="4.0">4</option>
			<option value="5.0">5</option>
			<option value="6.0">6</option>
			<option value="7.0">7</option>
			<option value="8.0">8</option>
			<option value="9.0">9</option>
			</html:select></td>

		<td class="rowheader">Max Total Rate</td>
		<td><select name="maxTotalRate" class="textfield">
            <option value="">--select--</option>
			<option value="1.0">1</option>
			<option value="2.0">2</option>
			<option value="3.0">3</option>
			<option value="4.0">4</option>
			<option value="5.0">5</option>
			<option value="6.0">6</option>
			<option value="7.0">7</option>
			<option value="8.0">8</option>
			<option value="9.0">9</option>
			</html:select></td>
	</tr>

	<tr>
		<td class="rowheader">Trip Start Date</td>
		<td><input type="text" name="tripStartDate" class=textfield
			id="datepicker" /></td>

		<td class="rowheader">Trip End Date</td>
		<td><input type="text" name="tripEndDate" class=textfield
			id="datepicker2" /></td>
	</tr>
	<tr>
		<td colspan="2" align="right"><input type="submit" class="button" value="Submit" /><br />
		</td>
	</tr>

</table>

</form>
</div>
</div>
</div>
</body>
</html>