

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color:green;text-align:center"> Employeee Registration From</h1>

<frm:form modelAttribute="emp">
<table bgcolor="cyan"border="1"align="center">

<tr>
<td>Employee Name</td>
<td><frm:input path="empName"/></td>
</tr>

<tr>
<td>Employee Job</td>
<td><frm:input path="job"/><td>
</tr>

<tr>
<td>Employee Salary</td>
<td><frm:input path="salary"/></td>
</tr>

<tr>
<td> <input type="submit" value="Register"></td>
</tr>

</table>



</frm:form>