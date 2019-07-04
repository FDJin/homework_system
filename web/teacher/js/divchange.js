$(document).ready(function(){
  $("#d1").show();//选择题
  $("#d2").hide();//填空题
  $("#d3").hide();//题目
  $("#d4").hide();//应用题
  $("#d5").hide();//判断题
  $("#d6").hide();//发布作业成功后的显示
  $("#add").hide();//添加题目
  $("#qe_choice").click(function(){
	    $("#qe_choice").attr("class","current");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","");      
  $("#d1").show();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").hide();
  });
  $("#qe_blank").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","current");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","");      
  $("#d1").hide();
  $("#d2").show();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").hide();
  });
  
  $("#qe_judge").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","current");
		$("#qe_calc").attr("class","");      
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").show();
  $("#d6").hide();
  $("#add").hide();
  });
  
   $("#qe_calc").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","current");      
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").show();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").hide();
  });
  
  $("#modify_1").click(function(){
	    $("#qe_choice").attr("class","current");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","");      
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").show();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").hide();
  });
  $("#modify_2").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","current");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","");      
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").show();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").hide();
  });
  $("#modify_3").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","current");
		$("#qe_calc").attr("class","");      
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").show();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").hide();
  });
  $("#modify_4").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","current");      
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").show();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").hide();
  });
  
  
  //添加题目
  //选择题
  $("#add_1").click(function(){
	    $("#qe_choice").attr("class","current");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").show();
  });
  
  //填空题
    $("#add_2").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","current");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").show();
  });
  //判断题
  $("#add_3").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","current");
		$("#qe_calc").attr("class","");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").show();
  });
  //应用题
  $("#add_4").click(function(){
	    $("#qe_choice").attr("class","");
        $("#qe_blank").attr("class","");
		$("#qe_judge").attr("class","");
		$("#qe_calc").attr("class","current");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").hide();
  $("#add").show();
  });
  
  //end
  
    /* $("#table_work tbody tr").click(function(){
	    $("#qe_index").attr("class","");
        $("#qe_publish").attr("class","");
		$("#qe_correct").attr("class","current");
		$("#qe_score").attr("class","");
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
	    $("#qe_index").attr("class","");
        $("#qe_publish").attr("class","");
		$("#qe_correct").attr("class","current");
		$("#qe_score").attr("class","");
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

  
   $("#table_work3 tbody tr").click(function(){
	    $("#qe_index").attr("class","");
        $("#qe_publish").attr("class","");
		$("#qe_correct").attr("class","current");
		$("#qe_score").attr("class","");
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
  
  
  
   $("#table_score tbody tr").click(function(){
	    $("#qe_index").attr("class","");
        $("#qe_publish").attr("class","");
		$("#qe_correct").attr("class","current");
		$("#qe_score").attr("class","");
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

  });*/
  
  $("#publish_submitt").click(function(){
        $("#qe_index").attr("class","");
        $("#qe_publish").attr("class","current");
		$("#qe_correct").attr("class","");
		$("#qe_score").attr("class","");
  $("#d1").hide();
  $("#d2").hide();
  $("#d3").hide();
  $("#d4").hide();
  $("#d5").hide();
  $("#d6").show();
  $("#add").hide();
  
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
/**
 * checkbox勾选样式
 */
function checkboxChecked(t) {
	if(t.checked == true){
		$(t).next().show();
	}else{
		$(t).next().hide();
	}
}
function del() {
        var msg = "您真的确定要删除吗？\n\n请确认！";
        if (confirm(msg)==true){
            return true;
        }else{
            return false;
        }
    }
