var yu_ming=getYuMing();

function getUrl(){
    var url = document.URL;
    return url;
}

function getPageUrl(){
    var url =getUrl();
    var str =url.split("//");
    url=str[1];
    var str2= url.split("/");
    var result="";
    for (var i=0;i<str2.length;i++){
        if (i!=0){
            result=result+str2[i];
        }
    }
    return result;
}

function chooseCenterModel() {
    var url=getUrl();
    var str=url.split("//")
    return  str[1].split("/")[2]
}

function getYuMing(){
    var url=getUrl();
    var str = url.split("/");
    return str[0]+"//"+str[2];
}

//生成访问记录
function visitorHistory(){
    var page=getPageUrl();
    $.ajax({
        url: yu_ming+"/visitor",
        async:false,
        data:{"page":page},
        type : "get",
        scriptCharset : 'utf-8',
        success: function(result){

        }
    })
}