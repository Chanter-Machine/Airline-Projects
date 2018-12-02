<%--
  Created by IntelliJ IDEA.
  User: Jude's PC
  Date: 11/27/2018
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Deals</title>
</head>
<body>
<form action="/createdeals.do">
    Description:<br>
    <input type="text" name="description"><br>
    Discount:<br>
    <input type="text" name="discount"><br>
    <fieldset>
        <legend>Deal Type</legend>
        <select id = "typeid" name="typeid">
        </select>
    </fieldset>
    <br><br>
    <input type="submit" value="Submit"><br>
</form>
</body>
<script>
    // After page finish loading, query available deal type
    $(function(){
        getTypeid("#typeid");
    });

    //query dealtype
    function getTypeid(ele){
        $(ele).empty();
        $.ajax({
            url:"${APP_PATH}/createdeals.do",
            type:"GET",
            success:function(result){
                /* console.log(result); */
                $.each(result.data.dealtypeList,function(){
                    var optionEle = $("<option></option>").attr("value", this.getTypeid()).append(this.type);
                    optionEle.appendTo(ele);
                })
            }
        });
    }
</script>
</html>
