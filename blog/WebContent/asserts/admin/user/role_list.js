var url="/admin/role/pagination";
var paramsMap={};
getData(url,paramsMap);
var add = "/admin/role/add";
$(document).ready(function() {
	$("#add").click(function() {
		//window.location.href = add;
		open('添加角色',add);
	});
	$("#search").click(function(){
		getData(url,$("#form").serialize());
	})
})
