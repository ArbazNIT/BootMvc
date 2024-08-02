


<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<h1 style="color:red;text-align:center"> Employee Updated From</h1>

<frm:form modelAttribute="emp">
<table bgcolor="yellow" border="1"align="center">

<tr>
<td>Employee No</td>
<td><frm:input path="empno"/></td>
</tr>


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
<td> <input type="submit" value="Edit_Employee"></td>
</tr>

</table>
</frm:form>