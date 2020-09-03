<%@page import ="java.sql.*"%>
<html>
<body bgcolor="wheat">
<br><br><br>
<center>
<h1>WELCOME TO THE DOCTOR PROFILE</h1>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
</center>
<table align="center" cellpadding="20" width="60%" height="300" border="2">
<tr><td>ID</td> <td>Name</td><td>Email</td><td>Phone</td><td>Specialisation</td></tr>

<%
Connection con = null;
PreparedStatement ps=null;
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/dell";
String user="root";
String pass ="root";
con= DriverManager.getConnection(url,user,pass);
	ps=con.prepareStatement("select * from doctor where name=?");
    Object o = session.getAttribute("name");
    String name=(String)o;
    ps.setString(1,name);
   
	ResultSet rs=ps.executeQuery();
       System.out.println(rs);
    	while(rs.next()){
    		%>
    		<tr>
    		<td><%=rs.getInt(1) %></td>
    		<td><%=rs.getString(2) %></td>
    		<td><%=rs.getString(4) %></td>
    		<td><%=rs.getString(5) %></td>
    		<td><%=rs.getString(6) %></td>
    		</tr>
    		
    		<%
    		
    	}
%>
</table>
</body>
</html>