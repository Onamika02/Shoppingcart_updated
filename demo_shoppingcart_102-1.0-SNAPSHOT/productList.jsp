
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.modelPackage.LoginCredentials"%>
<%@ page import="com.modelPackage.ProductListModel"%>
<%! int i=0;%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<div class=container">
    <p style="color: chartreuse;align-items: center;margin-left:650px;font-family: Calibri;font-weight: bold;font-size: 50px">BUY NOW!</p>
    <div class="mx-3 d-flex flex-row bd-highlight mb-3 position-absolute top-0 end-0">
        <a  href="showCartServlet" class="mx-2 text-decoration-none" id="cart" style="color: blueviolet;font-size: 30px;display: inline-block">Your Cart</a>
        <p id="shoppingcartValue" style="color: blueviolet;font-size: 30px;"><%=LoginCredentials.loginuserCart%></p>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="logoutServlet" class="mx-2 text-decoration-none" style="color: blueviolet;font-size: 30px;display: inline-block" >Log Out</a>

    </div>

    <div class="d-flex flex-row bd-highlight mb-3">
        <% for(i=0;i<ProductListModel.productLists.size();i++){%>
        <div class="p-2 bd-highlight">
            <div class="product-top">
                <img src="<%=ProductListModel.productLists.get(i).imageSrc%>" width="230px" height="220px">
            </div>
            <div class="product-bottom text-center">
                <h3><%=ProductListModel.productLists.get(i).productName%></h3>
                <h5><%=ProductListModel.productLists.get(i).productPrice%> Taka</h5>
                <button id="<%=ProductListModel.productLists.get(i).productID%>" onclick='buyProduct(this.id)' type="button" class="btn btn-secondary">Buy Now</button>
            </div>
        </div>
        <%}%>
    </div>
</div>

<script>
    function buyProduct(clickedID) {
        var xhttp = new XMLHttpRequest();
        var parameter;
        var value = document.getElementById("shoppingcartValue").innerHTML;
        value++;
        document.getElementById("shoppingcartValue").innerHTML = value;
        parameter ="id=".concat(clickedID);
        xhttp.open("POST","shoppingCartServlet",true);
        xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhttp.send(parameter);
        window.location.reload();

    }
</script>
</body>
</html>
