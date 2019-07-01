        var data = [{
            name: "传智播客",
            url: "http://www.itcast.cn",
            type: "IT最强培训机构"
        },{
            name: "黑马程序员",
            url: "http://www.itheima.com",
            type: "大学生IT培训机构"
        },{
            name: "传智前端学院",
            url: "http://web.itcast.cn",
            type: "前端的黄埔军校"
        }];

        $(function(){
            //第一种：动态创建表格的方式，使用拼接html的方式 （推荐）
            // var html = "";
            // for( var i = 0; i < data.length; i++ ) {
            //     html += "<tr>";
            //     html +=     "<td>" + data[i].name + "</td>"
            //     html +=     "<td>" + data[i].url + "</td>"
            //     html +=     "<td>" + data[i].type + "</td>"
            //     html += "</tr>";
            // }
            // $("#J_TbData").html(html);

            //第二种： 动态创建表格的方式，使用动态创建dom对象的方式
            //清空所有的子节点
            $("#T_TbData").empty();

            //自杀
            // $("#J_TbData").remove();

            for( var i = 0; i < data.length; i++ ) {
                //动态创建一个tr行标签,并且转换成jQuery对象
                var $trTemp = $("<tr></tr>");

                //往行里面追加 td单元格
                $trTemp.append("<td> <input type=\"checkbox\"  /> </td>");
                $trTemp.append("<td>"+ data[i].name +"</td>");
                $trTemp.append("<td>"+ data[i].url +"</td>");
                $trTemp.append("<td>"+ "123456" +"</td>");
                $trTemp.append("<td>"+ data[i].type +"</td>");
                                          
                $trTemp.append("<td> <input type=\"submit\" value=\"删除\"  onclick=\"exit()\" /></td>");
                // $("#J_TbData").append($trTemp);
                $trTemp.appendTo("#T_TbData");
            }
        });