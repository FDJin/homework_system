$(document).ready(function(){
	$("#d1").show();
    $("#d2").hide();
    $("#d3").hide();
	$("#d4").hide();
	$("#d5").hide();
	
	$("#index").click(function(){
		$("#index").attr("class","current");
		$("#work").attr("class","");
        $("#score").attr("class","");
		$("#me").attr("class","");
		$("#d1").show();
		$("#d2").hide();
        $("#d3").hide();
	    $("#d4").hide();
		$("#d5").hide();
	});

    $("#work").click(function(){
		$("#index").attr("class","");
		$("#work").attr("class","current");
        $("#score").attr("class","");
		$("#me").attr("class","");
		$("#d1").hide();
		$("#d2").show();
        $("#d3").hide();
		$("#d4").hide();
		$("#d5").hide();
    });
  
    $("#score").click(function(){
		$("#index").attr("class","");
		$("#work").attr("class","");
        $("#score").attr("class","current");
		$("#me").attr("class","");
		$("#d1").hide();
		$("#d2").hide();
        $("#d3").show();
		$("#d4").hide();
		$("#d5").hide();
    });
	
	$("#me").click(function(){
		$("#index").attr("class","");
		$("#work").attr("class","");
        $("#score").attr("class","");
		$("#me").attr("class","current");
		$("#d1").hide();
		$("#d2").hide();
        $("#d3").hide();
		$("#d4").show();
		$("#d5").hide();
    });
	
	$("#table_work tbody tr").click(function(){
		$("#index").attr("class","current");
		$("#work").attr("class","");
        $("#score").attr("class","");
		$("#me").attr("class","");
		$("#d1").hide();
        $("#d2").hide();
        $("#d3").hide();
        $("#d4").hide();
        $("#d5").show();
	});
  
});