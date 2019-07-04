$(document).ready(function(){
  $("#d1").show();//主页
  $("#d2").hide();//发布作业
  $("#d3").hide();//批改成绩
  $("#d4").hide();//统计分数
  $("#d5").hide();//批改作业前的搜索
  $("#d6").hide();//发布作业成功后的显示
  $("#d7").hide();//个人信息
  $("#d8").hide();
  $("#tc_index").click(function(){
	    $("#tc_index").attr("class","current");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
		$("#tc_ques").attr("class","");
		$("tc_personal").attr("class","");      
  $("#d1").show();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").hide();

  });
  $("#tc_publish").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","current");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
		$("#tc_ques").attr("class","");
		$("tc_personal").attr("class",""); 
  $("#d1").hide();
  $("#d2").show();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").hide();
  });
  
  $("#tc_correct").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","current");
		$("#tc_score").attr("class","");
		$("#tc_ques").attr("class","");
		$("tc_personal").attr("class",""); 
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").show();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").hide();
  });
  
   $("#tc_score").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","current");
		$("#tc_ques").attr("class","");
		$("tc_personal").attr("class",""); 
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").show();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").hide();
  });
  
  $("#tc_ques").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
		$("#qe_index").attr("class","current");
		$("tc_personal").attr("class",""); 
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").show();
  
  });
  
  $("#tc_personal").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
		$("#tc_ques").attr("class","");
	$("tc_personal").attr("class","current"); 
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").show();
  $("#d8").hide();

  });
  
   /*
   $("#qe_index").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
		$("#tc_ques").attr("class","");
	$("qe_index").attr("class","current"); 
		$("qe_pulish").attr("class",""); 
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").show();
 
  });*/
  
 /* $("#qe_publish").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
		$("#tc_ques").attr("class","");
		$("qe_index").attr("class",""); 
	$("qe_publish").attr("class","current"); 
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").hide();
 
  });*/
  
  /* $("#qe_correct").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
		$("#tc_ques").attr("class","");
		$("qe_index").attr("class",""); 
		$("qe_publish").attr("class","");
	$("qe_correct").attr("class","current"); 
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#d7").hide();
  $("#d8").hide();
  $("#d9").hide();
  $("#d10").show();
  
  });
*/  
  
     $("#table_work tbody tr").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","current");
		$("#tc_score").attr("class","");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").show();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  
  //var workid =$(".tr_work").children('td').eq(0).text();
  //alert(mal);
  //$("#correct_workid").val(workid);

   var tr=$(this);
   var td=tr.find("td");
   //alert(td[0].innerHTML);
   $("#correct_workid").val(td[0].innerHTML);
   $("#correct_title").val(td[1].innerHTML);
   $("#correct_class").val(td[2].innerHTML);

  });
  
  $("#table_work2 tbody tr").click(function(){
	    $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","");
		$("#tc_correct").attr("class","current");
		$("#tc_score").attr("class","");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").show();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  //var workid =$(".tr_work").children('td').eq(0).text();
  //alert(mal);
  //$("#correct_workid").val(workid);
  
   var tr=$(this);
   var td=tr.find("td");
   //alert(td[0].innerHTML);
   $("#correct_workid").val(td[0].innerHTML);
   $("#correct_title").val(td[1].innerHTML);
   $("#correct_class").val(td[2].innerHTML);

  });

  
  
  $("#publish_submitt").click(function(){
        $("#tc_index").attr("class","");
        $("#tc_publish").attr("class","current");
		$("#tc_correct").attr("class","");
		$("#tc_score").attr("class","");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").show();
  $("#d7").hide();
  
  var title=$("#task_title").val();
  $("#task_title").val("");
  $("#task_title2").val(title);
  
  var title=$("#task_class").val();
  $("#task_class").val("");
  $("#task_class2").val(title);
  
  var title=$("#task_content").val();
  $("#task_content").val("");
  $("#task_content2").val(title);
  /**/
        
  
    });

});