<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome, here's your result</title>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<form action='${requestUri}' method='get'>
<!--<%String str=new String(request.getParameter("key").getBytes("iso-8859-1"), "utf-8"); %>-->
 <div class="container-4">
 <a href="first.jsp">
  <img src="logo.png"
   style='position: absolute; width: 250px; height: 80px; left: 4%; top: 9%'>
   </a>
  <!--  <button class="icon"><i class="fa fa-search"></i></button> -->
  <input type='text' id="search" name='keyword'
   style='font-size:100%; position: absolute; left: 27%; top: 11.5%; width: 40%; height: 25px'
   placeholder = 'Search...' value='Your keyword is "<%=str%>"'/>
   <!-- <span id="btn_delete"><i class="fa fa-times"></i></span> -->
 </div>
</form>
<br><br><br><br><br><br>
<h5 style="color:blue">
<%
if(request.getAttribute("SuccessMsg")!=null){
	//String[][] result=(String[][])request.getAttribute("SuccessMsg");
	//for(int i=0;i<result.length;i++){
		//String s=result[i][1];
		
		
	
	out.println(request.getAttribute("SuccessMsg"));

}
%>

</h5>
<h4><a href="first.jsp">Go Back</a></h4>
</body>
</html>
<script type="text/javascript">
 document.getElementById('btn_delete').onclick = function () {
   document.getElementById('search').value = "";
 }
</script>
<style type="text/css">
 body {
     /*background:linear-gradient(45deg, #F5F5F5 0%, #AECFFF 85%);*/
     background-color:#E5F0FF;
 }
 
 a {
  color:  #65737e;
  font-size: 30px;
  text-decoration: none;
 }
 a:hover{
 text-decoration:underline;
 }
 
 #border{
  border-top:1px solid #fff;
  padding:10px;
 }
 .container-4{
  white-space: nowrap;
 }
 
 .container-4 button.icon{
    position: absolute;
    top: 11%;
    left:27%;
    margin-left: 17px;
    margin-top: 17px;
    z-index:1;
    border: none;
        background: #fff;
  color: #4f5b66;
  opacity: 0;

        -webkit-transition: all .55s ease;
        -moz-transition: all .55s ease;
        -ms-transition: all .55s ease;
        -o-transition: all .55s ease;
        transition: all .55s ease;
 }
 #btn_delete{
  position: absolute;
    top: 13.6%;
    left:68.5%;
  color: #AEAEAE;
 }
 .container-4 input#search{
  padding:10px 10px;
  color: #65737e;
  border-radius: 20px;
  border:none;
  padding-left: 45px;
 }
 
 
 .container-4:hover button.icon,
    .container-4:active button.icon,
    .container-4:focus button.icon {
        outline: none;
        opacity: 1;
    }
    
 .container-4 input#search:hover, .container-4 input#search:focus, .container-4 input#search:active{
     outline:none;
    }
   .container-4 input#search::-webkit-input-placeholder {
        color: #65737e;
    }

    .container-4 input#search:-moz-placeholder {
        /* Firefox 18- */
        color: #65737e;
    }

    .container-4 input#search::-moz-placeholder {
        /* Firefox 19+ */
        color: #65737e;
    }

    .container-4 input#search:-ms-input-placeholder {
        color: #65737e;
    }
</style>