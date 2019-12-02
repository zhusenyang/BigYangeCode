var yu_ming=getYuMing();

function getUrl(){
    var url = document.URL;
    return url;
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