<%@page import ="java.sql.*"%>
<%
Connection con = null;
PreparedStatement ps=null;
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/dell";
String user="root";
String pass ="root";
con= DriverManager.getConnection(url,user,pass);
ps=con.prepareStatement("insert into appointment(name,doa,toa,specialisation,status,dname) values(?,?,?,?,?,?)");
String username=request.getParameter("name");
String doa=request.getParameter("doa");
String toa=request.getParameter("toa");
String specialisation=request.getParameter("specialisation");
ps.setString(1,username);
ps.setString(2,doa);
ps.setString(3,toa);
ps.setString(4,specialisation);
ps.setString(5,"Pending");
ps.setString(6,"None");
int x=ps.executeUpdate();
if(x!=0){
	response.sendRedirect("./applyappintment.html");
}

%>