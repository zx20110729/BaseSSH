<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String path = request.getRequestURI();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<base href="<%=basePath%>">
<html>
<body>
<h2>${basePath}</h2>
<form action="userAction" method="post">
    <table width="207" border="0" align="center">
        <tr>
            <td colspan="2" align="center" nowrap="nowrap">用户注册</td>
        </tr>
        <tr>
            <td width="68" nowrap="nowrap">用户名</td>
            <td width="127" nowrap="nowrap"><label>
                <input name="user.username" type="text" id="username" size="20" />
            </label></td>
        </tr>
        <tr>
            <td nowrap="nowrap">密　码</td>
            <td nowrap="nowrap"><input name="user.password" type="password" id="password" size="20" maxlength="10" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center" nowrap="nowrap"><label>
                <input type="submit"  value="注册" />
                <input type="reset"  value="重填" />
            </label></td>
        </tr>
    </table>
</form>
<script type="text/javascript">

</script>
</body>
</html>
