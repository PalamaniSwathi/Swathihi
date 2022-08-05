<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.io.OutputStream"%>
<center>
<style>
body{
background-image:url("https://thumbs.dreamstime.com/b/bottles-assorted-global-soft-drinks-poznan-poland-jan-drink-market-dominated-brands-few-multinational-companies-founded-84848646.jpg");
background-repeat:no-repeat;
background-size:cover;
}</style>

<h1>CoolDrinks Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/sc/shop" method="post">
<input type="hidden" name="shop" value="invoice">
<% rs=db.checkTable("cooldrinks"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/sc/shopimg?shopname=cooldrinks&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %>
    <input type="submit" value="Next">
</form>