<%--
  Created by IntelliJ IDEA.
  User: Jude's PC
  Date: 11/27/2018
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
            <h5 class="card-title">Add new flight deals</h5>
            <p class="card-text">Provide information in the fields below to add a new deal, select the appropriate deal type to be used for this deal and submit.</p>
            Can't find the appropriate deal type you need? <a href="/deals/createdealtype.jsp" class="btn btn-primary btn-sm">Add New Deal Type</a>

            <p>&nbsp;</p>
            <% if(request.getAttribute("dealsmsg")!=null) {%>
            <div class="alert alert-success" role="alert">
                <h4>${dealsmsg.msg}</h4>
            </div>
            <%}%>
            <p>&nbsp;</p>
            <hr size="1">
            <form action="/createdeals.do">
                <p><input type="text" class="form-control" name="description" placeholder="Description"></p>
                <p><input class="form-control" type="text" name="discount" placeholder="Discount Applicable (%)"></p>
                <p>
                    <select class="form-control" id = "typeid" name="typeid">
                        <option>Deal Type</option>
                    </select>
                </p>
                <p><input class="btn btn-danger btn-lg" type="submit" value="ADD NEW DEAL"></p>
            </form>

        </div>
    </div>
</div>
</body>
<script src="../static/js/jquery-3.2.1.min.js"></script>
<script>
    // After page finish loading, query available city
    $(function(){
        getTypeid("#typeid");
    });


    function getTypeid(ele){
        //$(ele).empty();
        $.ajax({
            url:"${APP_PATH}/allDealTypes.do",
            type:"GET",
            success:function(result){
                /* console.log(result); */
                $.each(result.data.dealtypeList,function(){
                    var optionEle = $("<option></option>").attr("value", this.typeid).append(this.type);
                    optionEle.appendTo(ele);
                })
            }
        });
    }
</script>
</html>
