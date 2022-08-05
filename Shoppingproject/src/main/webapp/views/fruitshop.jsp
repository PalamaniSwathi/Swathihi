<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.io.OutputStream"%>

<center>
<style>
body{
background-image:url("https://images.creativemarket.com/0.1.0/ps/5779879/1820/1213/m1/fpnw/wm1/rnn5cz4jc5zcortw9rxcqqtgutjk1nenwqx9l25ptnphfqysefer909sxqzgvt83-.jpg?1548691158&s=2f2accb808b5e06c9777d7c60bcd68c5");
background-repeat:no-repeat;
background-size:cover;
}</style>
<h1>Fruits Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/sc/shop" method="post">
<input type="hidden" name="shop" value="vegetableshop">
<% rs=db.checkTable("fruitshop"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/sc/shopimg?shopname=fruitshop&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %>
    <input type="submit" value="Next">
</form>
