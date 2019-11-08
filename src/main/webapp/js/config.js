var yu_ming="http://localhost:8080";

function getUrl(){
    var url = document.URL;
    return url;
}

function chooseCenterModel() {
    var url=getUrl();
    var str=url.split("//")
    return  str[1].split("/")[2]
}