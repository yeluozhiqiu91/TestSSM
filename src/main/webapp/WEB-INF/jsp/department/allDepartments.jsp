<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2017/8/23
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = "http://localhost:9998/";
%>
<base href="<%=basePath %>" />
<html>
<head>
    <title>部门列表</title>
    <script src="js/jquery/jquery-3.2.1.js"/>
    <script src="js/ztree/jquery.ztree.core.js"/>
    <script src="js/ztree/jquery.ztree.excheck.js"/>
    <script src="js/ztree/jquery.ztree.exedit.js"/>
</head>
<body>
<div>
    <ul id="treeDemo" class="ztree">
    </ul>
</div>
</body>
</html>
<script type="javascript">
    var setting = {
        check: {
            enable: false
        },
        data: {
            simpleData: {
                enable: true,
                idKey: "id",
                pIdKey: "pId",
                rootPId: null
            }
        },
        view: {
            showLine: false,
            fontCss: setHighlight
        },
        callback: {
            beforeClick: zTreeBeforeClick
        }
    };

    $(function(){
        alert("hello");
        $.ajax({
            type: "get",
            dataType: "json",
            url: "department/getTree",
            success: function (data) {
                //alert(data);
                setData(data);
            }, error: function () {
                fx.alert("数据加载失败!");
            }
        })
    });
    function zTreeBeforeClick(treeId, treeNode, clickFlag) {
    }
    // 设置高亮字体
    function setHighlight(treeId, treeNode) {
        return (treeNode.highlight) ? {
            color: "green",
            "font-weight": "bold",
            "background-color": "#ddd"
        } : {
            color: "#333",
            "font-weight":"normal",
            "background-color": "transparent"

        };
    }
    function setData(zNodes) {
        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    }
    function expandAll() {
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
        treeObj.expandAll(true);
    }
    function unexpandAll() {
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
        treeObj.expandAll(false);
    }
</script>
