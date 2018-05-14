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
    <div class="infoAdd">
        <div class="col-md-12 column">
            <button type="button" class="btn btn-default btn-primary" onclick="addHero()">新增</button>
        </div>
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
                                <button type="button" class="btn btn-default" onclick="update(${hero.id})">修改</button>
                                <button type="button" class="btn btn-default btn-danger" onclick="deleteHoerById(${hero.id})">删除</button>
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
    <div class="addHeroForm" id="add">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <form role="form" method="post" action="/demo01/hero/add">
                    <div class="form-group">
                        <label for="name">英雄名字</label><input type="text" class="form-control" name="name" id="name" />
                    </div>
                    <div class="form-group">
                        <label for="sex">性别</label><input type="text" class="form-control" name="sex" id="sex" />
                    </div>
                    <div class="form-group">
                        <label for="viability">生存能力</label><input type="text" class="form-control" name="viability" id="viability" />
                    </div>
                    <div class="form-group">
                        <label for="skillEffect">技能效果</label><input type="text" class="form-control" name="skillEffect" id="skillEffect" />
                    </div>
                    <div class="form-group">
                        <label for="attackCapability">攻击力</label><input type="text" class="form-control"  name="attackCapability" id="attackCapability" />
                    </div>
                    <div class="form-group">
                        <label for="difficultStart">上手难度</label><input type="text" class="form-control" name="difficultStart" id="difficultStart" />
                    </div>
                    <div class="form-group">
                        <label for="recommendations">使用简介</label><input type="text" class="form-control" name="recommendations" id="recommendations" />
                    </div>
                    <button type="submit" class="btn btn-default">确认提交</button>
                </form>
            </div>
        </div>
        <div class="pull-right"><button type="button" class="btn btn-default btn-inverse" id="goBack">取消</button></div>
    </div>
</div>

<script src="../jquery/dist/jquery.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
<script>
var deleUrl="/demo01/hero/delete?id=";
var pageUrl="/demo01/hero/info?currentPage=";
var updateUrl="/demo01/hero/update?id=";
$(function () {
    var currentpage = ${result.getPageCount()};
    if(currentpage<=1){
        $("#top").addClass("disabled");
    }
    if(currentpage>=${result.getTotalPageCount()}){
        $("#bottom").addClass("disabled");
    }
    $("#goBack").click(function () {
        $("#add").hide();
    })
 })
    function deleteHoerById(id) {
        location.href=deleUrl+id;
    }
    function addHero(){
       $("#add").show();
    }
    function update(id) {
        location.href=updateUrl+id;
    }
</script>
</body>
<style>
    .addHeroForm{
       position: absolute;
        display: none;
        top: 1%;
        left: 35%;
        width: 30%;
        height: 88%;
        border-radius: 10px;
        padding: 30px;
        background: #eee;
    }
    *{
        margin: 0;
        padding: 0;
    }
    .addHero{

    }
    .infoPage{
        height: 10%;
    }
    .infoTitle{
        height: 10%;
        text-align: center;
        padding-top: 10px;
    }
    .infoAdd{
        height: 5%;
        text-align: right;
        padding-top: 30px;
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