<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/sc/shop" method="POST"><center>
<style>
body{
background-image:url("https://thumbs.dreamstime.com/z/energy-drinks-sale-grocery-store-139866215.jpg");
background-repeat:no-repeat;
background-size:cover;
}</style>
<h1>CoolDrinks Shop</h1>
<input type="hidden" name="shop" value="invoice">
 <input type="checkbox" name="sprite" value="rs150">Sprite
<input type="checkbox" name="Thumsup" value="rs170">Thums up
<input type="checkbox" name="Maaza" value="rs140">Maaza
<input type="submit" value="Next Shop...."></center>
</form:form>