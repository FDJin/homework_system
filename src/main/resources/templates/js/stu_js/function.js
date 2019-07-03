
	$("#index").click(function(){
		$("#index").attr("class","current");
        $("#score").attr("class","");
		$("#me").attr("class","");

	});

    $("#work").click(function(){
		$("#index").attr("class","");
        $("#score").attr("class","");
		$("#me").attr("class","");

    });
  
    $("#score").click(function(){
		$("#index").attr("class","");
        $("#score").attr("class","current");
		$("#me").attr("class","");

    });
	
	$("#me").click(function(){
		$("#index").attr("class","");
        $("#score").attr("class","");
		$("#me").attr("class","current");

    });
	
	$("#table_work tbody tr").click(function(){
		$("#index").attr("class","current");
        $("#score").attr("class","");
		$("#me").attr("class","");
	});
