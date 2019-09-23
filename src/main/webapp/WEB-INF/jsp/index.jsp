<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>Khaled Al Kadri Spring Boot FrameWork</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
        input[type=text] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: none;
            border-bottom: 2px solid red;
        }
        input[type=submit] {
            width: 100%;
            background-color: blue;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type=submit]:hover {
            background-color: #45a049;
        }

    </style>
</head>
<body style="background: antiquewhite">

<center><h2>Khaled Al Kadri First Mysql Spring Boot Framework</h2></center>

<table>
    <tr style="background: blue">
        <th>User Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Action</th>
    </tr>
    <!--we use for each arry to get all data from tables https://www.tutorialspoint.com/jsp/jstl_core_foreach_tag.htm-->
<c:forEach var = "list" items = "${lists}">
    <tr style="background: darkgrey">
        <td>${list.id}</td>
        <td>${list.firstName}</td>
        <td>${list.lastName}</td>
        <td>
            <a href="/view/${list.id}">View</a>
            <a href="/delete/${list.id}">Delete</a>
            <a href="/edit/${list.id}">Edit</a>
        </td>
    </tr>
</c:forEach>
</table>
<hr>
<center><h2>Here You Can Add New User:</h2></center>
<hr>
<form method="post" action="/save">
    <label>First Name</label>
    <input type="text"  name="firstname" placeholder="Please Enter First Name..." required >
    <label>Last Name</label>
    <input type="text"  name="lastname" placeholder="Please Enter Last Name..." required>

    <input type="submit" class="form-control" value="Add New User">
</form>
</body>
</html>
