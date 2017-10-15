<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet" href="css/Master.css" type="text/css">
<title>Expedia Client</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</script>


</head>
<body>
<div id="content">
<div id="main-container">
<div class="requestSide">

<form name="expediaClient" method="post" action="AcceptRequest">


<table>

	<tr>
		<td class="rowheader">Your Criteria</td>
		<td colspan="11"><textarea rows="5" cols="50"
			class="LARGTEXTFAREA">${searchCriteria}</textarea></td>

	</tr>

	<tr>
		<td colspan="12">You have Got the below offers</td>
	</tr>
	<c:forEach items="${offers.hotel.hotels}" var="offer" varStatus="loop">
		<tr>
		    <td class="offer">Offer  ${loop.index + 1} </user>
			<td class="rowheader">Destination </user>
			<td class="TEXTFIELD">${offer.destination.province}</user>
			<td class="ROWHEADERLIGHT">Hotel Name</user>
			<td class="TEXTFIELD">${offer.hotelInfo.hotelName}</user>
			<td class="rowheader">AVG Price per Night</user>
			<td class="TEXTFIELD">${offer.hotelPricingInfo.averagePriceValue}</user>
			<td class="ROWHEADERLIGHT">Numbers of Rooms Left</user>
			<td class="TEXTFIELD">${offer.hotelUrgencyInfo.numberOfRoomsLeft}</user>
			<td class="rowheader">Number of People Viewing</user>
			<td class="TEXTFIELD">${offer.hotelUrgencyInfo.numberOfPeopleViewing}</user>
			<td class="ROWHEADERLIGHT">Status</user>
			<td class="TEXTFIELD">${offer.hotelUrgencyInfo.almostSoldStatus}</user>
		</tr>

	</c:forEach>



	<tr>
		<td colspan="2" align="right"><input type="submit" class="button"
			value="Search Again!" /><br />
		</td>
	</tr>

</table>

</form>
</div>
</div>
</div>
</body>
</html>