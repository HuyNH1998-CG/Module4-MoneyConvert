<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Input currency and amount to convert into VND</h1>
  <form action="/convert" method="post">
    <input type="text" name="money">
    <select name="rate">
      <option value="22000">USD</option>
      <option value="200">JPY</option>
    </select>
    <button type="submit">Convert</button>
  </form>
  </body>
</html>
