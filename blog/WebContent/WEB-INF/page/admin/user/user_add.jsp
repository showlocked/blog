<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章管理</title>
<%@include file="../common/BaseStyle.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath() %>/asserts/css/zTreeStyle.css">
</head>
<style>
.article-w{
	width:200px;
}
.content{
	width:80%;
	height:auto;
	margin-left:25%;
	margin-top:20px;
}
.layui-input-block select{
	width:200px;
}
.layui-input, .layui-textarea{
	width:200px;
}
.layui-form-select{
	width:200px;
}
</style>
<body>
	<div class="content">
	<form class="layui-form" action="/admin/user/add" method="POST">
				<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-block">
						<input type="text" name="username" lay-verify="title" autocomplete="off" placeholder="请输入用户名" class="layui-input article-w">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">初始密码</label>
					<div class="layui-input-block">
						<input type="password" name="password" lay-verify="title" autocomplete="off" placeholder="请输入密码" class="layui-input article-w">
					</div>
				</div>
				
				<div class="layui-form-item">
					<label class="layui-form-label">角色</label>
					<div class="layui-input-block" >
						<select name="roleId" style="width:200px;padding-right:50px;">
							<option class="article-w" value="">请选择角色</option>
							<c:forEach items="${roleList }" var="role">
								<option style="width:200px;" value="${role.roleId }">${role.description }</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>	
		</div>
</body>
<%@include file="../common/BaseScript.jsp" %>
<script src="<%=request.getContextPath()%>/asserts/js/jquery.ztree.all-3.5.min.js"></script>
<script src="<%=request.getContextPath()%>/asserts/js/jquery.ztree.core-3.5.min.js"></script>
<script src="<%=request.getContextPath()%>/asserts/js/jquery.ztree.excheck-3.5.min.js"></script>
<script src="<%=request.getContextPath()%>/asserts/js/jquery.ztree.exedit-3.5.min.js"></script>
<script src="<%=request.getContextPath()%>/asserts/js/jquery.ztree.exhide-3.5.min.js"></script>
<script src="<%=request.getContextPath()%>/asserts/admin/user/user_add.js"></script>
<script type="text/javascript">
	layui.use(['form', 'layedit', 'laydate'], function() {
		var form = layui.form(),
			layer = layui.layer,
			layedit = layui.layedit,
			laydate = layui.laydate;
	
		//创建一个编辑器
		var editIndex = layedit.build('LAY_demo_editor');
		//自定义验证规则
		form.verify({
			title: function(value) {
				if(value.length < 5) {
					return '标题至少得5个字符啊';
				}
			},
			pass: [/(.+){6,12}$/, '密码必须6到12位'],
			content: function(value) {
				layedit.sync(editIndex);
			}
		});
	
		//监听提交
		form.on('submit(demo1)', function(data) {
			layer.alert(JSON.stringify(data.field), {
				title: '最终的提交信息'
			})
			//return false;
		});
	});
</script>
</html>