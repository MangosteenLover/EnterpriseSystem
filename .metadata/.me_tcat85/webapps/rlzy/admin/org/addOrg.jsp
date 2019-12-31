<%@ page language="java" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<base target="_self">
		
		<script type="text/javascript">
		    function closeOpen()
		    {
		       window.returnValue=false;
		       window.close();
		    }
		    
		    function check()
		    {
		        var name=document.addOrg.name.value;
		        var description=document.addOrg.description.value; 
		        if(name=="")
		        {
		            alert("请输入部门名称");
		            return false;
		        }
                return true;		        
		    }
		</script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4038",secure:"4047"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/rlzy/WebRoot/admin/org/addOrg.jsp">
		<center data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-17" data-genuitec-path="/rlzy/WebRoot/admin/org/addOrg.jsp">
			<form action="<%=path %>/org?type=orgAdd" name="addOrg" method="post">
			   <input type="hidden" name="p_id" value='<%=request.getParameter("orgId") %>'>
			   <br><br>
			     部门名称：<input type="text" name="name" size="30"/><br><br>
                   部门描述：<input type="text" name="description" size="30"/><br><br>
                <input type="submit" value="确定" class="ButtonCss" onclick="return check();"/>
                <input type="reset" value="重填" class="ButtonCss"/>
                <input type="button" value="取消" class="ButtonCss" onclick="closeOpen()"/>
			</form>
		</center>
	</body>
</html>
