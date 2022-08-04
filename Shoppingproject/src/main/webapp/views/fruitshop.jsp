<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center>
<style>
body{
background-image:url("https://images.creativemarket.com/0.1.0/ps/5779879/1820/1213/m1/fpnw/wm1/rnn5cz4jc5zcortw9rxcqqtgutjk1nenwqx9l25ptnphfqysefer909sxqzgvt83-.jpg?1548691158&s=2f2accb808b5e06c9777d7c60bcd68c5");
background-repeat:no-repeat;
background-size:cover;
}</style>
<h1>Fruits Shop</h1></center>
<form:form action="/sc/shop" method="POST"><center>
<input type="hidden" name="shop" value="vegetableshop">
  <input type="radio" name="apple" value="rs50">Apple
<input type="radio" name="mango" value="rs30">Mango
<input type="radio" name="orange" value="rs20">Orange
<input type="submit" value="Next Shop...."></center>
</form:form>