<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/11/2021
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="asset/css/bootstrap.css">

  </head>
  <style>
    *{
      margin: 0 auto;
    }
    .header{
      height: 120px;
    }
    .menu{
      height: 80px;
    }
    .navMenu{
      height: 80px;
    }
    .navMenu ul li{
      margin-left: 45px;
    }
    .row{
      --bs-gutter-x : 0;
    }
    .ten{
      top: 20px;
      right: 15px;
      position: absolute;
      font-size: 30px;
    }
    .content{
      height: 500px;

    }
    .item-left ul li{
      list-style-type: none;
      font-size: 30px;
    }
  </style>
  <body>

  <div class="container-fluid">
    <div class="row header" style="background: blue">
      <div class="col-12">
        <img src="bao.png" alt="" width="150px" height="120px">
        <p style="text-align: center" class="ten">Hoàng Gia Bảo</p>
      </div>

    </div>

    <div class="row menu " >
      <div class="col-12 ">
        <nav class="navbar navbar-expand-lg navbar-light bg-light navMenu">
          <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                  <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/employee">Employee</a>
                </li>

                <li class="nav-item">
                  <a class="nav-link " href="/customer">Customer</a>
                </li>

                <li class="nav-item">
                  <a class="nav-link " href="/service" tabindex="-1" aria-disabled="true">Service</a>
                </li>

                <li class="nav-item">
                  <a class="nav-link " href="#" tabindex="-1" aria-disabled="true">Contact</a>
                </li>
              </ul>
              <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
              </form>
            </div>
          </div>
        </nav>
      </div>
    </div>

    <div class="row content item-left">
      <div class="col-4" style="background: #0dcaf0">
        <ul>
          <li>item1</li>
          <li>item2</li>
          <li>item3</li>
        </ul>
      </div>
      <div class="col-8" style="background: red">
        Body
      </div>

    </div>

    <div class="row">
      <div class="col-12">
        <p align="center">Footer</p>
      </div>
    </div>
  </div>
  </div>
  <script src="asset/js/bootstrap.js"></script>
  </body>
</html>
