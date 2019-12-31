<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path = request.getAttribute("path").toString();
	String message = request.getAttribute("message").toString();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4038",secure:"4047"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<html>
<script language="javascript">
    <% if(message != null) { %>
		alert("<%=message%>");
	<% } %>
	<% if(path != null) { %>
		document.location.href = "<%=path%>";
	<% } else {%>
		window.history.back();
	<% } %>
</script>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-35" data-genuitec-path="/rlzy/WebRoot/common/success.jsp"> 
</body> 
</html>
