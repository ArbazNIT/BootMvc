    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <c:choose> 
    <c:when test="${!empty emplist}">
    <h1 style="color:blue;text-align:center">Employee Show All Report</h1>
    
    <table border="2" align="center" bgcolor="cyan">
    <tr style="color:black"> <th>Empno</th><th>EmpName</th><th>JOB</th><th>SALARY</th><th>OPERATION</th> </tr>
    <c:forEach var="emp" items="${emplist}">
   <b><tr style="color:green"></b>
    <td>${emp.empno}</td>
    <td>${emp.empName}</td>
    <td>${emp.job}</td>
    <td>${emp.salary}</td>
   
   <td> 
    
  	<a href="emp_edit?no=${emp.empno}"><img src="https://th.bing.com/th/id/OIP.GqoSsj683zSZRecI9EZeDwHaHa?w=204&h=204&c=7&r=0&o=5&dpr=1.5&pid=1.7"width="40px" height="40px"></a>
  	<a href="emp_delete?no=${emp.empno}"onclick="return confirm('do you want to delete employee')"><img src="https://th.bing.com/th/id/OIP.N7aJ1ps82Tic2Q3pWUmrMAHaGP?w=234&h=197&c=7&r=0&o=5&dpr=1.5&pid=1.7 "width="40px" height="40px"></a>
  	
   </td>
    </tr>
    </c:forEach>
    </table>
    </c:when>
    
    <c:otherwise> 
    <h1 style="color:black;text-align:center">Employee Record Not Found</h1>
    </c:otherwise>
    
    </c:choose>
    
   <center>
   <h2 style="color:blue;text-align:center">${resultMsg}</h2>
  
   
    <a href="register"><img src= "https://th.bing.com/th?id=OIP.203uFdk86jSoUgNMdUfsngHaHH&w=255&h=245&c=8&rs=1&qlt=90&o=6&dpr=1.5&pid=3.1&rm=2"width="50px" height="50px"></a> &nbsp;&nbsp;&nbsp;
     <a href="./"><img src= "https://th.bing.com/th/id/OIP.iDonFX4JXSo6C5YjiuuNFwAAAA?w=193&h=192&c=7&r=0&o=5&dpr=1.5&pid=1.7" width="50px" height="50px"></a>
</center>