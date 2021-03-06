<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<#assign basePath=request.contextPath>
<title><#if sysErrorPage??>${sysErrorPage.pageTitle!'' }</#if></title>
<script type="text/javascript" src="${basePath}/js/jquery-1.7.2.min.js"></script>
<style>
html{color:#000;background:#ecede8;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;overflow-y:scroll;}body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,code,form,fieldset,legend,input,textarea,p,blockquote,th,td,hr,button,article,aside,details,figcaption,figure,footer,header,hgroup,menu,nav,section{margin:0;padding:0;}article,aside,details,figcaption,figure,footer,header,hgroup,menu,nav,section{display:block;}audio,canvas,video{display:inline-block;*display:inline;*zoom:1;}body,button,input,select,textarea{font:12px tahoma,arial,\5b8b\4f53;}input,select,textarea{font-size:100%;}table{border-collapse:collapse;border-spacing:0;}th{text-align:inherit;}fieldset,img{border:0;}iframe{display:block;}abbr,acronym{border:0;font-variant:normal;}del{text-decoration:line-through;}address,caption,cite,code,dfn,em,th,var{font-style:normal;font-weight:500;}ol,ul{list-style:none;}caption,th{text-align:left;}h1,h2,h3,h4,h5,h6{font-size:100%;font-weight:500;}q:before,q:after{content:'';}sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline;}sup{top:-0.5em;}sub{bottom:-0.25em;}a:hover{text-decoration:underline;}ins,a{text-decoration:none;}input,button,select,textarea{outline:none;}textarea{resize:none;}.clearfix:after{content:" ";display:block;height:0;clear:both;visibility:hidden;}.clearfix{zoom:1;}

.construction {background:url(images/box_bg.gif) no-repeat; width:465px; height:252px; margin:15% auto; box-shadow:0 5px 5px #bbb; text-align:center;}
.construction h3 {color:#0c9dd2; font-family:"微软雅黑"; font-size:36px; padding-top:50px;}
.process_bar {background:url(images/process_bar.gif) no-repeat; width:301px; height:17px; margin:30px auto 0;}
.pb_num {color:#23c083; font-size:18px;}
.cs_word {color:#23c083; font-size:23px; margin-top:10px;}
</style>
</head>

<body>
<#if sysErrorPage??>
	<#if sysErrorPage.usedStatus??>
	<#if sysErrorPage.usedStatus=='1'>
	${sysErrorPage.pageDes}
	<#else>
	<div class="construction">
    	<h3>网站正在建设中</h3>
        <div class="process_bar"></div>
        <span class="pb_num">79%</span>
        <p class="cs_word">coming soon...</p>
    </div><!--/construction-->
	</#if>
	<#else>
	<div class="construction">
    	<h3>网站正在建设中</h3>
        <div class="process_bar"></div>
        <span class="pb_num">79%</span>
        <p class="cs_word">coming soon...</p>
    </div><!--/construction-->
	</#if>
</#if>
</body>
</html>
