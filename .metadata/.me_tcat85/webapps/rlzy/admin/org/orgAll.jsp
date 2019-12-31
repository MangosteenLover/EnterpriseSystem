<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	    <base target="_self">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<link href="<%=path %>/css/dtree.css" rel="stylesheet" type="text/css">
		<script language="JavaScript" src="<%=path %>/js/dtree.js" type="text/javascript"></script>
		<title></title>
		<script type="text/javascript">
		    var nodeId1 = ""; 
		    
		    function onClickTreeNode(nodeId)
		    {
		         nodeId1 = nodeId;
		         
		    }
		    
		    function queding()
            {
                 if(nodeId1=="")
                 {
                    alert("请单击选择部门");
                    return false;
                 }
                 
				 window.returnValue = nodeId1;
		         window.close();
            }
		</script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4038",secure:"4047"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<BODY data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-18" data-genuitec-path="/rlzy/WebRoot/admin/org/orgAll.jsp">
		<div class="dtree" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-18" data-genuitec-path="/rlzy/WebRoot/admin/org/orgAll.jsp">
			<script type="text/javascript">
				d = new dTree('d');
		        d.add(0,-1,'部门组织结构图');//必须有这句
				<c:forEach items="${requestScope.orgList}" var="org">
		            d.add(${org.id},${org.parenOrganization.id},'${org.name}','javaScript:onClickTreeNode(${org.id});',null,null,null,null,'yes');
		        </c:forEach>
				document.write(d);
			</script>
		</div>
		<br>
		&nbsp;&nbsp;&nbsp;<input type="button" value="确定" style="width: 80px;" onclick="queding()">
	</body>
</html>
