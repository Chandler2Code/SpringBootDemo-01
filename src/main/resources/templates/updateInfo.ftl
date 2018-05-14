<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>update</title>
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
</head>
<body>
<div class="addHeroForm" id="add">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" method="post" action="/demo01/hero/add">
                <div class="form-group">
                    <label for="name">英雄名字</label><input type="text" class="form-control" name="name" id="name"  value="${result.name}"/>
                </div>
                <div class="form-group">
                    <label for="sex">性别</label><input type="text" class="form-control" name="sex" id="sex" value="${result.sex}"/>
                </div>
                <div class="form-group">
                    <label for="viability">生存能力</label><input type="text" class="form-control" name="viability" id="viability" value="${result.viability}" />
                </div>
                <div class="form-group">
                    <label for="skillEffect">技能效果</label><input type="text" class="form-control" name="skillEffect" id="skillEffect" value="${result.skillEffect}" />
                </div>
                <div class="form-group">
                    <label for="attackCapability">攻击力</label><input type="text" class="form-control"  name="attackCapability" id="attackCapability" value="${result.attackCapability}"/>
                </div>
                <div class="form-group">
                    <label for="difficultStart">上手难度</label><input type="text" class="form-control" name="difficultStart" id="difficultStart" value="${result.difficultStart}" />
                </div>
                <div class="form-group">
                    <label for="recommendations">使用简介</label><input type="text" class="form-control" name="recommendations" id="recommendations" value="${result.recommendations}" />
                </div>
                <button type="submit" class="btn btn-default">确认修改</button>
            </form>
        </div>
    </div>
    <div class="pull-right"><button type="button" class="btn btn-default btn-inverse" id="goBack">取消</button></div>
</div>
<script src="../jquery/dist/jquery.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
<script>
    var infoUrl="/demo01/hero/info"
    $(function () {
        $("#goBack").click(function () {
            location.href=infoUrl;
        })
    })
</script>
</body>
<style>
    .addHeroForm{
        position: absolute;
        /*display: none;*/
        top: 1%;
        left: 35%;
        width: 30%;
        height: 88%;
        border-radius: 10px;
        padding: 30px;
        background: #eee;
    }
</style>
</html>