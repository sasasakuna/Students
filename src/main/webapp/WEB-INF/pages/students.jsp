<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title> hello page </title>
    <link rel="stylesheet" href="bootstrap.min.css">
    <script type="text/javascript" src="jquery.1.10.2.min.js"></script>
</head>

<body>

<nav class="navbar navbar-default" role="navigation">
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header">
    <a class="navbar-brand" href="#">三年二班考试成绩</a>
  </div>

  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">成绩查询</a></li>
    </ul>
     <form class="navbar-form navbar-left" role="search">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
          </div>
          <button type="submit" class="btn btn-default">Submit</button>
     </form>
  </div><!-- /.navbar-collapse -->
</nav>



<table class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Score</th>
    </tr>
    </thead>

    <tbody>
        <c:forEach var="student" items="${allStudents}">
            <tr class=${student.status}>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.gender}</td>
                <td>${student.grade}</td>
            </tr>

        </c:forEach>

        <script type="text/javascript">
        var trs = $("tbody tr");
        trs.sort(function(a,b){
           //var aValue = $(a).find('td:last-child').text();
            var aValue = $(a).find('td:nth-child(4)').text();
            var bValue = $(b).find('td:last-child').text();
            //console.log(aValue, bValue);

            return +aValue < +bValue;
        });

        trs.each(function(idx,tr){
            $('table tbody').append(tr);
        });
        </script>


    </tbody>



</table>
</body>
</html>