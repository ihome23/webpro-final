<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javaScript" language="javascript" defer="defer">

function fn_egov_save() {	
	frm = document.getElementById("detailForm");	
  	frm.action = "<c:url value="/student/addStudent.do"/>";
    frm.submit();
}
</script>
</head>
<body>
<form:form commandName="studentVO" name="detailForm" id="detailForm" >
	<form:input path="number" cssClass="txt"/>
	<form:input path="name" cssClass="txt"/>
	<a href="javascript:fn_egov_save();">CREATE</a>
</form:form>
</body>
</html>