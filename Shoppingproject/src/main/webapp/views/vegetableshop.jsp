<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/sc/shop" method="POST"><center>
<style>
body{
background-image:url("https://static.vecteezy.com/system/resources/previews/000/448/736/original/fresh-vegetables-with-banner-vector.jpg");
background-repeat:no-repeat;
background-size:cover;
}</style>

<h1>vegetables Shop</h1>
<input type="hidden" name="shop" value="cooldrinks">
  <input type="radio" name="Cucumber" value="rs50">Cucumber
<input type="radio" name="Brinjal" value="rs30">Brinjal
<input type="radio" name="Onion" value="rs20">Onion
<input type="submit" value="Next Shop....">
</center>
</form:form>