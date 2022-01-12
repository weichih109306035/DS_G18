<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="google.GoogleQuery2" %>
<%@ page import="google.Result" %>
<jsp:useBean id="GQ" class="GoogleQuery2" scope="page"></jsp:useBean>
<jsp:useBean id="k" class="google.Result" scope="page"></jsp:useBean>
<%
	//request.getParameter("btn_check")!=null;
if(request.getParameter("btn_check")!=null){
	GoogleQuery2 mis=new GoogleQuery2();
	//mis.setSearchKeyword("政治");
	String str=new String(request.getParameter("key").getBytes("iso-8859-1"), "utf-8");
	mis.setSearchKeyword(str);//要用+連結,可能因為url關係
	//PrintHI phi=new PrintHI();
	//String shi=phi.printHi();
	//Main mai=new Main();
	Result r=new Result();
	r.setSearchUrl((mis.query()).toString());
	//String[][] s=r.showResult();
	request.setAttribute("SuccessMsg", r.showResult());
	RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
	rd.forward(request,response);
	//out.println(mis.getSearchKeyword());
	//out.println(mis.query());
}
/*GoogleQuery2 mis=new GoogleQuery2();
	mis.setSearchKeyword("政治");
	Result r=new Result();
	r.setSearchUrl((mis.query()).toString());
	//String str=new String(request.getParameter("key").getBytes("iso-8859-1"), "utf-8");
	//mis.setSearchKeyword(str);//要用+連結,可能因為url關係
	//PrintHI phi=new PrintHI();
	//String shi=phi.printHi();
	//Main mai=new Main();
	//r.setSearchUrl((mis.query()).toString());
	out.println(r.showResult());
*/

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beat Google Test 3</title>
</head>
<body>
<!--
<form action="/action_page.php" method="get">
<label for="key">Your Keyword:</label>
<input type="text" name="key">
<input type="submit" name="btn_check" class="btn btn_check" value="Check">

</form>
-->
<div class="box">
        <img src="logo.png" class="pic">
        <form action='${requestUri}' method='get'>
        <div class="container-4">
        
            <input type="text" id="search" name="key" placeholder="More than one keyword can use + to connect..." />
            <button class="icon" name="btn_check"><i class="fa fa-search"></i></button>
           
        </div>
        </form>
</div>
<form method="post" class="form-horizontal">
<label for="key">中文也可</label>
<input type="text" name="key">
<input type="submit" name="btn_check" class="btn btn_check" value="Beat Google!">
</form>

</body>
</html>
<style>
    body {
        background: linear-gradient(45deg,#65737e ,#F5F5F5 , #AECFFF);
        background-size: 100% 150%;//
        animation:gradient 0.55s ease infinite;
    }
    
    @keyframes gradient{
    0%{
     background-position:0% 50%;
    }
    50%{
     background-position:100% 50%;
    }
    100%{
     background-position:0% 50%;
    }
    
    }

    .box {
        margin: 100px auto;
        width: 500px;
        height: 590px;
    }

    .pic {
        position: relative; 
        top: 150px; 
        right:10px;
        weight: 400px;
        height: 150px;
    }

    .container-4 {
        position:relative;
        top: 170px;
        /* left: 40px; */
        overflow: hidden;
        width: 500px;
        white-space: nowrap;
    }

    .container-4 input#search {
        width: 500px;
        height: 50px;
        background: #fff;
        border: none;
        font-size: 14px;
        float: left;
        color: #65737e;
        padding-left: 15px;
        -webkit-border-radius: 5px;
        -moz-border-radius: 5px;
        border-radius: 5px;
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

    .container-4 button.icon {
        -webkit-border-top-right-radius: 5px;
        -webkit-border-bottom-right-radius: 5px;
        -moz-border-radius-topright: 5px;
        -moz-border-radius-bottomright: 5px;
        border-top-right-radius: 5px;
        border-bottom-right-radius: 5px;

        border: none;
        background: #5D86C5;
        height: 50px;
        width: 50px;
        color: #fff;
        opacity: 0;
        font-size: 10pt;

        -webkit-transition: all .55s ease;
        -moz-transition: all .55s ease;
        -ms-transition: all .55s ease;
        -o-transition: all .55s ease;
        transition: all .55s ease;
    }

    .container-4:hover button.icon,
    .container-4:active button.icon,
    .container-4:focus button.icon {
        outline: none;
        opacity: 1;
        margin-left: -50px;
    }

    .container-4 button.icon:hover {
        background: #AECFFF;
    }

    .container-4 input#search:hover, .container-4 input#search:focus, .container-4 input#search:active{
    outline:none;
  }
</style>
