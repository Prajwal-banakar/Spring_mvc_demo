<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Doctor Details</title>
</head>
<body>
    <h2>Doctor Details</h2>
    <table>
        <tr>
            <td>Doctor Name:</td>
            <td>${DoctorName}</td>
        </tr>
        <tr>
            <td>Specialty:</td>
            <td>${Specialty}</td>
        </tr>
        <tr>
            <td>Registration Number:</td>
            <td>${RegistrationNumber}</td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>${Gender}</td>
        </tr>
        <tr>
            <td>Qualification:</td>
            <td>${Qualification}</td>
        </tr>
    </table>
</body>
</html>