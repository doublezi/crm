<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Amaze UI Admin table Examples</title>
  <meta name="description" content="这是一个 table 页面">
  <meta name="keywords" content="table">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="assets/css/admin.css">
</head>
<body>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->

<header class="am-topbar am-topbar-inverse admin-header">
  <div class="am-topbar-brand">
    <strong>Amaze UI</strong> <small>后台管理模板</small>
  </div>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
          <li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
          <li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
        </ul>
      </li>
      <li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main">
<!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
        <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 系统级别 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
            <li><a href="<c:url value="/sysuser/list"/>" class="am-cf">用户管理</a></li>
 			<li><a href="<c:url value="/sysrole/list"/>" class="am-cf">权限管理</a></li>
 		 	<li><a href="<c:url value="/sysright/list"/>" class="am-cf">菜单管理</a></li>
   			<li><a href="#" class="am-cf">系统日志</a></li>
          </ul>
        </li>
        <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 客户级别 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
            <li><a href="<c:url value="custinfo/list"/>" class="am-cf">客户管理</a></li>
 			<li><a href="<c:url value="custservice/list"/>" class="am-cf">服务管理</a></li>
 		 	<li><a href="<c:url value="custactivity/list"/>" class="am-cf">活动管理</a></li>
          </ul>
        </li>
      </ul>

      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-bookmark"></span> 开发中...</p>
        </div>
      </div>

      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-tag"></span>开发中...</p>
        </div>
      </div>
    </div>
  </div>
  <!-- sidebar end -->


<!-- content start -->
  <div class="admin-content">
    <div class="admin-content-body">
      <div class="am-cf am-padding am-padding-bottom-0">
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">修改密码</strong> / <small>Edit Password</small></div>
      </div>

      <hr/>

      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
<!--        
          <div class="am-panel am-panel-default">
            <div class="am-panel-bd">
              <div class="am-g">
                <div class="am-u-md-4">
                  <img class="am-img-circle am-img-thumbnail" src="http://s.amazeui.org/media/i/demos/bw-2014-06-19.jpg?imageView/1/w/200/h/200/q/80" alt=""/>
                </div>
                <div class="am-u-md-8">
                  <p>你可以使用<a href="#">gravatar.com</a>提供的头像或者使用本地上传头像。 </p>
                  <form class="am-form">
                    <div class="am-form-group">
                      <input type="file" id="user-pic">
                      <p class="am-form-help">请选择要上传的文件...</p>
                      <button type="button" class="am-btn am-btn-primary am-btn-xs">保存</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
-->          
<!-- 
          <div class="am-panel am-panel-default">
            <div class="am-panel-bd">
              <div class="user-info">
                <p>等级信息</p>
                <div class="am-progress am-progress-sm">
                  <div class="am-progress-bar" style="width: 60%"></div>
                </div>
                <p class="user-info-order">当前等级：<strong>LV8</strong> 活跃天数：<strong>587</strong> 距离下一级别：<strong>160</strong></p>
              </div>
              <div class="user-info">
                <p>信用信息</p>
                <div class="am-progress am-progress-sm">
                  <div class="am-progress-bar am-progress-bar-success" style="width: 80%"></div>
                </div>
                <p class="user-info-order">信用等级：正常当前 信用积分：<strong>80</strong></p>
              </div>
            </div>
          </div>
 -->
        </div>

        <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
          <form action="${pageContext.servletContext.contextPath}/sysuser/edit/${sysUser.userId}" method="post" class="am-form am-form-horizontal">
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">账户编号</label>
              <div class="am-u-sm-9">
                <input name="show-userid" disabled="disabled" type="text"  id="sysuser-id" placeholder="${sysUser.userId}">
                <input name="userId" value="${sysUser.userId}" type="hidden" />
              </div>
            </div>
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">登陆密码</label>
              <div class="am-u-sm-9">
                <input name="show-userpassword" disabled="disabled" type="text"  id="sysuser-password" placeholder="${sysUser.userPassword}">
              </div>
            </div>
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">持有权限</label>
              <div class="am-u-sm-9">
                <input name="show-rolename" disabled="disabled" type="text"  id="sysuser-role" placeholder="${sysUser.sysRole.roleName}">
              	<input name="sysRole" value="${sysUser.sysRole}" type="hidden"/>
              </div>
            </div>
            <div class="am-form-group">
              <label for="user-name" class="am-u-sm-3 am-form-label">所处状态</label>
              <div class="am-u-sm-9">
                <input name="show-userflag" disabled="disabled" type="text"  id="sysuser-flag" placeholder="${sysUser.userFlag}">
              	<input name="userFlag" value="${sysUser.userFlag}" type="hidden"/>
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-email" class="am-u-sm-3 am-form-label">输入新密码</label>
              <div class="am-u-sm-9">
                <input name="show-new-userpassword" type="password" id="user-password" placeholder="输入新密码">
                <input name="userPassword" type="hidden" />
                <small>输入新密码</small>
              </div>
            </div>

            <div class="am-form-group">
              <label for="user-phone" class="am-u-sm-3 am-form-label">再次输入新密码</label>
              <div class="am-u-sm-9">
                <input name="again" type="password" id="user-password-again" placeholder="再次输入新密码">
                <small>鼓起勇气，再输一次</small>
              </div>
            </div>

            <div class="am-form-group">
              <div class="am-u-sm-9 am-u-sm-push-3">
                <button type="submit" class="am-btn am-btn-primary">提交改密方案*(੭*ˊᵕˋ)੭*ଘ</button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>

    <footer class="admin-content-footer">
      <hr>
      <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
    </footer>

  </div>
  <!-- content end -->

</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<footer>
  <hr>
  <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<!--<![endif]-->
<script src="assets/js/amazeui.min.js"></script>

<script src="assets/js/app.js"></script>
</body>
</html>
