<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<tiles:insertAttribute name="head"/>
<body id="body">

<div class="wrapper">
	<tiles:insertAttribute name="headbar"/>
	<!-- BEGIN CONTAINER -->
    <tiles:insertAttribute name="left"/>
    <!-- BEGIN PAGE -->
    <div class="content">
        <tiles:insertAttribute name="content"/>
    </div>
</div>


<tiles:insertAttribute name="footjs"/>
</body>
</html>