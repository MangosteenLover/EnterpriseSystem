<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-15" data-genuitec-path="/rlzy/WebRoot/admin/index.jsp">
	<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4038",secure:"4047"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<FRAMESET id=index border=0 frameSpacing=0 rows=80,* frameBorder=no>
		<FRAME id=topFrame name=topFrame src="<%=path %>/admin/top.jsp" noResize scrolling=no>
		<FRAMESET border=0 frameSpacing=0 frameBorder=no cols=16%,*>
			<FRAME id=leftFrame name=leftFrame src="<%=path %>/admin/left.jsp" noResize scrolling=no>
			<FRAME id=mainFrame name=mainFrame src="<%=path %>/admin/index/sysPro.jsp" noResize scrolling=no>
		</FRAMESET>
	</FRAMESET>
	<noframes></noframes>
</html>
