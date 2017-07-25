/*
 * url接口的定义，需要根据实际情况更换
 */
var url = window.location.href;
var baseUrl = url.substring(0, url.indexOf("login"));



function loginClick(){
    var loginName = $("#loginName").val();//获取用户名
    var password = $("#password").val();//获取密码
    var codeInput = $("#codeInput").val(); //获取所填验证码
    var flage = verifyCode.validate($("#codeInput").val()); //验证所填验证码和显示的验证码，true为正确，false为错误

    if (loginName == "" || password == "") {
        layer.msg("用户名或密码不能为空", {
            time: 2000,
            icon: 5
        });
    }else if (codeInput == "") {
        layer.msg("验证码不能为空", {
            time: 2000,
            icon: 5
        });
    }else if (flage == false){
        layer.msg("验证码错误", {
            time: 2000,
            icon: 5
        });
    }

}