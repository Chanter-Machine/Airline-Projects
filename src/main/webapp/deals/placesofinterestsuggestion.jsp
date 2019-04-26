<%--
  Created by IntelliJ IDEA.
  User: Jude's PC
  Date: 4/25/2019
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Agile Air: Places of Interest</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Agile Air Project">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="../static/styles/bootstrap4/bootstrap.min.css">
</head>
<body>
<div class="col-md-6" style="margin: 0 auto;">
    <p>&nbsp;</p>
    <div class="card">
        <div class="card-header">
            PLACES OF INTEREST
        </div>
        <div class="card-body">
            <h5 class="card-title">Get Suggestions on Places of Interest</h5>
            <p class="card-text">Provide information in the fields below and click the submit button to get suggestions for places of interest.</p>

            <form id="suggestionFormData" action="/getPlacesOfInterestSuggestion.do">
                <p>
                    Continent of Interest:<br>
                    <select name="continentcode" class="form-control">
                        <option value="1">Africa</option>
                        <option value="2">Antarctica</option>
                        <option value="3">Asia</option>
                        <option value="4">Europe</option>
                        <option value="5">North America</option>
                        <option value="6">South America</option>
                        <option value="7">Oceania</option>
                    </select>
                </p>
                <p>
                    Category of Interest:<br>
                    <select  name="categorycode" class="form-control">
                        <option value="1">Attractions</option>
                        <option value="2">Hotels</option>
                        <option value="3">Entertainment</option>
                        <option value="4">Education</option>
                        <option value="5">Manufacturing</option>
                        <option value="6">Health</option>
                        <option value="7">Religion</option>
                    </select>
                </p>
                <input class="btn btn-primary" type="button" id="submit"  value="GET SUGGESTIONS"><br>
            </form>

        </div>
    </div>
</div>
</body>
<script src="../static/js/jquery-3.2.1.min.js"></script>
<script>
    $('#submit').click( function(){
            var continentCode = $('select[name=continentcode]').find('option:selected').val();
            var categoryCode = $('select[name=categorycode]').find('option:selected').val();

            $('#suggestionFormData').empty();
            $('#suggestionFormData').append(continentCode);
            $('#suggestionFormData').append(categoryCode);

            $('#suggestionFormData').submit();
        }
    );
</script>
</html>
