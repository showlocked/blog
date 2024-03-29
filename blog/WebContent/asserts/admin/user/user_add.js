var setting = {
			check: {
				enable: true
			},
			data: {
				simpleData: {
					enable: true
				}
			}
		};

		/*var zNodes =[
			{ id:1, name:" 超级管理员", open:true,checked:true,children:[
				{ id:11, name:"文章管理", open:true},
				{ id:111, name:"消息管理"},
				{ id:112, name:"系统设置"},
				{ id:12, name:"用户管理", open:true},
				{ id:121, name:"角色管理"},
				{ id:122, name:"权限管理"}
			]},	
			{ roleId:1, name:" 超级管理员", open:true,checked:true,children:[
				{ roleId:11, name:"文章管理", open:true},
				{ roleId:111, name:"消息管理"},
				{ roleId:112, name:"系统设置"},
				{ roleId:12, name:"用户管理", open:true},
				{ roleId:121, name:"角色管理"},
				{ roleId:122, name:"权限管理"}
				]},	
		];*/
		var zNodes=getNodeData("/admin/permission/data");
		
		var code;

		function setCheck() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			py = $("#py").attr("checked")? "p":"",
			sy = $("#sy").attr("checked")? "s":"",
			pn = $("#pn").attr("checked")? "p":"",
			sn = $("#sn").attr("checked")? "s":"",
			type = { "Y":py + sy, "N":pn + sn};
			zTree.setting.check.chkboxType = type;
			showCode('setting.check.chkboxType = { "Y" : "' + type.Y + '", "N" : "' + type.N + '" };');
		}
		function showCode(str) {
			if (!code) code = $("#code");
			code.empty();
			code.append("<li>"+str+"</li>");
		}

		$(document).ready(function(){
			$.fn.zTree.init($("#demo"), setting, zNodes);
			setCheck();
			$("#py").bind("change", setCheck);
			$("#sy").bind("change", setCheck);
			$("#pn").bind("change", setCheck);
			$("#sn").bind("change", setCheck);
		});