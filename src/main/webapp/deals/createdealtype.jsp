<%--
  Created by IntelliJ IDEA.
  User: Jude's PC
  Date: 11/27/2018
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Deal Type</title>
</head>
<body>
<form id="dealtypeForm">
       Type:<br>
        <input type="text" name="type"><br>
        Minimum Age:<br>
        <input type="text" name="minage" value="0"><br>
        Maximum Age:<br>
        <input type="text" name="maxage" value="0"><br>
        Minimum Date:<br>
        <input type="text" name="mindate" placeholder="yyyy/mm/dd"><br>
        Maximum Date:<br>
        <input type="text" name="maxdate" placeholder="yyyy/mm/dd"><br>
        Range Type Code:<br>
        <select name="rangetypecode">
         <option value="1">By Age</option>
         <option value="2">By Date</option>
        </select><br><br><br>
        <input type="button" id="submit"  value="Submit"><br>
</form>
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
