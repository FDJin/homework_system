$(document).ready(function(){
  $("#academy_content").show();
  $("#teacher_content").hide();
  $("#student_content").hide();

  $("#academy_class").click(function(){
   $("#academy_content").show();
  $("#teacher_content").hide();
  $("#student_content").hide();
  });



  $("#teacher").click(function(){
  $("#teacher_content").show();
  $("#academy_content").hide();
  $("#student_content").hide();
  });
  
  $("#student").click(function(){
	$("#academy_content").hide();   
  $("#teacher_content").hide();
  $("#student_content").show();
  });
  

});