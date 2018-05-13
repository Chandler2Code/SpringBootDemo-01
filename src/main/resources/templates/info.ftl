<meta charset="UTF-8">
<head>
    <title>info</title>
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
</head>
<body>
<div class="HeroInfo">
    <div class="infoTitle">
        <h1>王者荣耀英雄简介</h1>
    </div>
    <div class="infoContent">
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>
                                Id
                            </th>
                            <th>
                                英雄姓名
                            </th>
                            <th>
                                性别
                            </th>
                            <th>
                               生存能力
                            </th>
                            <th>
                                技能效果
                            </th>
                            <th>
                                攻击力
                            </th>
                            <th>
                                上手难度
                            </th>
                            <th>
                                使用简介
                            </th>
                            <th>

                            </th>
                        </tr>
                        </thead>
                        <#list result.getList() as hero>
                        <tbody>
                        <tr class="success">
                            <td>
                                ${hero.id}
                            </td>
                            <td>
                                ${hero.name}
                            </td>
                            <td>
                                ${hero.sex}
                            </td>
                            <td>
                               ${hero.viability}
                            </td>
                            <td>
                            <#--技能效果100-->
                            ${hero.skillEffect}
                            </td>
                            <td>
                            ${hero.attackCapability}
                            </td>
                            <td>
                             ${hero.difficultStart}
                            </td>
                            <td>
                                ${hero.recommendations}
                            </td>
                            <td>
                                <button type="button" class="btn btn-default">修改</button>
                                <button type="button" class="btn btn-default btn-danger">删除</button>

                            </td>

                        </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="infoPage">
        <div class="col-md-12 column">
            <ul class="pagination pull-right">
                <li id="top">
                    <a href="/demo01/hero/info?currentPage=${result.getPageCount()-1}">上一页</a>
                </li>
                <li id="bottom">
                    <a href="/demo01/hero/info?currentPage=${result.getPageCount()+1}">下一页</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<script src="../jquery/dist/jquery.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
<script>
$(function () {
    var currentpage = ${result.getPageCount()};
    if(currentpage<=1){
       $("#top").hide();
    }
    if(currentpage>=${result.getTotalPageCount()}){
        $("#bottom").addClass("disabled");
    }
})
</script>
</body>
<style>
    *{
        margin: 0;
        padding: 0;
    }
    .infoPage{
        height: 10%;
    }
    .infoTitle{
        height: 10%;
        text-align: center;
        padding-top: 10px;
    }
    .infoContent{
        /*height: 60%;*/
    }
    .HeroInfo{
        margin:  0 auto;
        height: 100%;
        width: 60%;
        /*background: red;*/
    }
</style>