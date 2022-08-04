<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/sc/shop" method="POST"><center>
<style>
body{
background-image:url("https://thumbs.dreamstime.com/b/bottles-assorted-global-soft-drinks-poznan-poland-jan-drink-market-dominated-brands-few-multinational-companies-founded-84848646.jpg");
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