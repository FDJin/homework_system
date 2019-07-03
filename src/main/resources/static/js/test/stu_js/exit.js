function exit(){
	var x;
	var r=confirm("是否退出系统？");
	if (r==true){
		window.location="http://www.baidu.com";
	}
	else{
		x="你按下了\"取消\"按钮!";
	}
}

function success(){
	alert("添加成功");
}

function delete1(){
	var x;
	var r=confirm("是否删除");
	if (r==true){
		alert("删除成功")
	}
	else{
		x="你按下了\"取消\"按钮!";
	}
}
