<%--
  Created by IntelliJ IDEA.
  User: Jude's PC
  Date: 11/27/2018
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
 <title>Agile Air: Create New Deal</title>
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
   ADD NEW DEALS
  </div>
  <div class="card-body">
   <h5 class="card-title">Add new type of deals</h5>
   <div class="card-text">
    <p>Provide information in the form below to add a new category of deal type. This can be specified as either based on Age or Season, the fields that are not needed can be ignored. Once these deal types are added, you can begin to use them to add new deals to the platform.</p>
    <form id="dealtypeForm"><p>&nbsp;</p>
     <p>
     <input type="text" name="type" class="form-control" placeholder="Deal Type Name">
     </p>
     <p>
      Minimum Age<br>
     <input type="text" name="minage" value="0" class="form-control" placeholder="Minimum Age">
     </p>
     <p>
      Maximum Age<br>
     <input type="text" name="maxage" value="0" class="form-control" placeholder="Maximum Age">
     </p>
     <p>
     Minimum Date:<br>
     <input type="text" name="mindate" class="form-control" placeholder="yyyy/mm/dd">
     </p>
     <p>
     Maximum Date:<br>
     <input type="text" name="maxdate" class="form-control" placeholder="yyyy/mm/dd">
     </p>
     <p>
     Range Type Code:<br>
     <select name="rangetypecode" class="form-control">
      <option value="1">By Age</option>
      <option value="2">By Date</option>
     </select>
     </p>
     <input class="btn btn-primary" type="button" id="submit"  value="Add New Deal Type"><br>
    </form>
   </div></div></div>

</div>
<form style="display: none;" id="dealTypeFormData" action="/createdealtype.do">
</form>
</body>
<script src="../static/js/jquery-3.2.1.min.js"></script>
<script>
 $('#submit').click( function(){
     var rangeType = $('select[name=rangetypecode]').find('option:selected').val();
     /*var data = {
         type:$('input[name=type]').val(),
         minage:$('input[name=minage]').val(),
         maxage:$('input[name=maxage]').val(),
         mindate:$('input[name=mindate]').val(),
         maxdate:$('input[name=maxdate]').val(),
         rangetypecode:rangeType
     }*/
     $('#dealTypeFormData').empty();
      if (rangeType=="1") {
          $('#dealTypeFormData').append($('input[name=type]'));
          $('#dealTypeFormData').append($('input[name=minage]'));
          $('#dealTypeFormData').append($('input[name=maxage]'));
          $('#dealTypeFormData').append($('select[name=rangetypecode]'));
      } else{
          $('#dealTypeFormData').append($('input[name=type]'));
          $('#dealTypeFormData').append($('input[name=mindate]'));
          $('#dealTypeFormData').append($('input[name=maxdate]'));
          $('#dealTypeFormData').append($('select[name=rangetypecode]'));
      }
     $('#dealTypeFormData').submit();
     }
 );
</script>
</html>
