<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
        <script language="javascript">
        </script>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4038",secure:"4047"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/images/allbg.gif' data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-29" data-genuitec-path="/rlzy/WebRoot/admin/yuangong/Copy of yuangongByOrg.jsp">
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-29" data-genuitec-path="/rlzy/WebRoot/admin/yuangong/Copy of yuangongByOrg.jsp">
				<tr align="center" bgcolor="#FAFAF1" height="22">
				    <td width="7%">工号</td>
					<td width="7%">姓名</td>
					<td width="7%">性别</td>
					<td width="7%">年龄</td>
					<td width="7%">职位</td>
					<td width="7%">操作</td>
		        </tr>	
				<c:forEach items="${requestScope.yuangongList}" var="yuangong">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						${yuangong.bianhao}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${yuangong.name}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${yuangong.sex}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${yuangong.age}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${yuangong.zhiwei}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<input type="radio" name="yuangong_id" style="border: 0" value="${yuangong.id}"/>
					</td>
				</tr>
				</c:forEach>
			</table>
	</body>
</html>
