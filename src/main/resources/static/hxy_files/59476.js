/**
 * [WARNING]
 *   !!! 请勿将本文件保存到您的服务器上自行托管
 *   !!! 否则将造成您的站点统计数据不准确
 *   !!! DO NOT host this file on your own server
 *   !!! Please follow instructions by 
 *       https://fenxi.360.cn/setting/gencode
 */
window._qha_data=window._qha_data||{domain:59476,host:'s.union.360.cn',gu:'188841586.2983495824584000000.1524463113000.4333',hu: '11elyinXC3%2bYX0F%2bl8VEL5WQkZTfKT02BUqU5tSOhQOGk%3d',e360:'2676386972',pageClk:null,urlClk:0,idClk:null,mvid:'226735'};
!function(m){"use strict";var g="_qha",y=0,o=3,u=20,e=21,i=11,s=6,a=30,c="constructor",_=function(){},f=function(t){return t},l=""[c],t={}[c],n=[][c],d=/s/[c];"function"!=typeof t.create&&(t.create=function(t){function e(){}return e.prototype=t,new e});var r=t.prototype.toString;function p(t){return r.call(t)}function h(t){return"[object Array]"===p(t)}function v(t){return"[object Object]"===p(t)}function w(t){return"[object Function]"===p(t)}function b(t){if(void 0===t&&(t=null),"object"==typeof JSON&&JSON&&JSON.stringify)return JSON.stringify(t);if(null==t)return"null";if("boolean"==typeof t)return l(t);if("string"==typeof t)return'"'+t+'"';if("number"==typeof t)return isFinite(t)?l(t):"null";if("object"==typeof t){if(h(t)){for(var e=[],n=0;n<t.length;n++)e.push(b(t[n]));return"["+e.join(",")+"]"}var r=[];for(var i in t)if(t.hasOwnProperty(i)){var o=t[i];void 0!==o&&"function"!=typeof o&&r.push('"'+i+'":'+b(o))}return"{"+r.join(",")+"}"}return""}function x(t,e,n){for(var r in t)t.hasOwnProperty(r)&&(n=e(n,t[r],r,t));return n}function E(r,i){return x(r,function(t,e,n){return t.push(i(e,n,r)),t},[])}function k(t,e,n){for(var r=0;r<t.length;r++)n=e(n,t[r],r,t);return n}function O(r,i,t){k(r,function(t,e,n){return i(e,n,r)})}function j(r,i,t){return k(r,function(t,e,n){return t.push(i(e,n,r)),t},[])}var S=n.prototype.slice,C=function(t){return k(t,function(t,e){return N(t,e)<0&&t.push(e),t},[])},N=w([].indexOf)?function(t,e){return t.indexOf(e)}:function(t,e){if(e!=e)return-1;for(var n=0;n<t.length;n++)if(t[n]===e)return n;return-1};var I=function(){return+new Date},P=function(){return+new Date/1e3|0},A=function(t){void 0===t&&(t={});var e=t.callback,n=t.timeout,r=!1,i=null,o=function(){r||(r=!0,clearTimeout(i),w(e)&&e())};return i=setTimeout(o,+n||1e3),o};function L(e){for(var t=[],n=arguments.length-1;0<n--;)t[n]=arguments[n+1];if(!1===v(e))throw new Error(e+" is not an object");return O(t,function(t){var n,r,i;t&&v(t)&&(n=e,i=function(t,e){n[e]=t},x(r=t,function(t,e,n){return i(e,n,r)}))}),e}function q(t){if(!1===v(t))throw new Error("target is not plain object");return E(t,function(t,e){return"object"==typeof t&&(t=b(t)),t=null==t?"":t,encodeURIComponent(e)+"="+encodeURIComponent(t)}).join("&")}function T(t,e){return/^https?:\/\/[^/?]+$/.test(t)&&(t+="/"),t===e||-1<t.indexOf("*")&&(n=t,new d((r=n,r.replace(/([.*+?^=!:$}{()|[\]/\\])/g,"\\$&")).replace("\\*",".*"))).test(e);var n,r}var V=m.document,R=m.location,U=m.navigator,F=m.screen,J=m.history,D=m.Math,M=m.parseInt,X="https:"===R.protocol?"https:":"http:",B=3,H=/^(?:mouse|pointer|contextmenu|drag|drop)|click/;function $(t,e,n,r){void 0===r&&(r=!1);var i=function(t){t=function(t){if(t||(t=m.event),!t)throw new Error("`event` is not an object");t.target||(t.target=t.srcElement||V),t.target.nodeType===B&&(t.target=t.target.parentNode);var e=t.button,n=t.type;return H.test(n)&&!t.which&&e&&(t.which=1&e?1:2&e?3:4&e?2:0),t}(t),n.call(this,t)};t.addEventListener?t.addEventListener(e,i,r):t.attachEvent?t.attachEvent("on"+e,i):t["on"+e]=i,n.__dlg=i}function Y(o,a,c,t){var u=[],s=function(e){var n=this;(void 0===t||w(t)&&t(e))&&O(u,function(t){return t.call(n,e)})},f=!1,l=new Error("Pool has been destoryed.");return $(o,a,s,c),{append:function(t){if(f)throw l;w(t)&&u.push(t)},remove:function(t){if(f)throw l;var e=N(u,t);-1<e&&u.splice(e,1)},destroy:function(){if(f)throw l;var t,e,n,r,i;t=o,e=a,r=c,i=(n=s).__dlg,t.removeEventListener?t.removeEventListener(e,i,r):t.attachEvent?t.detachEvent("on"+e,i):t["on"+e]=null,i=null,n.__dlg=null,t=n=null,f=!(s=o=u=null)}}}var W="CSS1Compat"===V.compatMode;function z(){var t=-1,e=V.body,n=V.createElement("div");return n.innderHTML="&nbsp;",n.className="adsbox adwords",e&&(e.appendChild(n),t=0===n.offsetWidth?1:0,e.removeChild(n)),t}function G(t){var e="";try{e=t||m.top.document.referrer}catch(t){}if(""===e)return e;var n=/^https?:\/\/e\.so\.com\/search\/(eclk|mclick)\?/.exec(e);if(n){var r=function(t){var e=t.indexOf("?");if(e<0)return{base:t,param:{}};var o={};return k(t.slice(e+1).split("&"),function(t,e){var n=e.indexOf("=");if(-1<n){var r=e.slice(0,n),i=e.slice(n+1);o[r]=i}else o[e]="";return t},o),{base:t.slice(0,e),param:o}}(e),i=r.base,o=r.param,a="mclick"===n[1]?"asin":"p";e=i+"?"+a+"="+(o[a]||"")}else e=e.slice(0,1e3);return e}var K="";if(void 0===V.hidden)for(var Q=["webkit","moz","ms","o"],Z=0;Z<Q.length;Z++){if(void 0!==V[Q[Z]+"Hidden"]){K=Q[Z];break}}var tt=""===K?"visibilityState":K+"VisibilityState",et=Y(V,K+"visibilitychange",!0);function nt(){return void 0===V[tt]?"":V[tt]}function rt(){return"preview"===U.loadPurpose}var it={get:function(t){t=encodeURIComponent(t);var e=d("(^| )"+t+"=([^;]*)(;|$)").exec(V.cookie);return decodeURIComponent(e?e[2]:"")},set:function(t,e,n){void 0===n&&(n={});var r,i=encodeURIComponent(t)+"="+encodeURIComponent(e),o=n.path,a=n.domain,c=n.expires;i+=c?";expires="+(r=c,new Date(I()+864e5*r)).toUTCString():"",i+=o?";path="+o:"",i+=a?";domain="+a:"";try{V.cookie=i}catch(t){}},del:function(t,e){this.set(t,"",L({expires:-1},e))}};function ot(){for(var t=[U.appName,U.version,U.language||U.browserLanguage,U.platform,U.userAgent,F.width,"x",F.height,F.colorDepth,V.referrer].join(""),e=t.length,n=J.length;n;)t+=n--^e++;return(2147483647*(D.round(2147483647*D.random())^function(t){var e=0,n=0,r=t.length-1;for(;0<=r;r--){var i=M(t.charCodeAt(r),10);0!=(n=4261412864&(e=(e<<6&4294967295)+i+(i<<14)))&&(e^=n>>21)}return e}(t))).toString()}var at=/(msie|trident)/i.test(U.userAgent),ct=V.createElement("a");function ut(t){at&&(ct.setAttribute("href",t),t=ct.href),ct.setAttribute("href",t);var e=ct.href,n=ct.protocol,r=ct.host,i=ct.search,o=ct.hash,a=ct.hostname,c=ct.port,u=ct.pathname;return{href:e,protocol:n?n.replace(/:$/,""):"",host:r,search:i?i.replace(/^\?/,""):"",hash:o?o.replace(/^#/,""):"",hostname:a,port:c,pathname:"/"===u.charAt(0)?u:"/"+u}}for(var st="__qhart",ft=V.domain.split("."),lt="."+ft.pop();ft.length;)if(lt="."+ft.pop()+lt,it.set(st,"1",{domain:lt}),"1"===it.get(st)){it.del(st,{domain:lt});break}var dt=lt.slice(1),pt=28800,ht=0,vt=function(t){var e=t.referrer,n=t.domainId,r=t.url,i=t.conf,o=t.init;void 0===o&&(o=_),this.index=ht++,this.conf=i,this.url=r,this.domainId=n,this.start=P(),this.referrer=e,this.session=new yt({key:"qs_lvt_"+n,ident:P(),domain:dt}),this.page=new gt({key:"qs_pv_"+n,ident:ot(),domain:dt}),o.call(this)};vt.prototype.getBaseInfo=function(){var t=function(t){return t.slice(-2).reverse()},e=this,n=e.url,r=e.start,i=e.referrer,o=e.domainId,a=e.page,c=e.session,u=e.conf,s=u.gu,f=u.version,l=u.hu,d=t(a.list),p=d[0],h=d[1],v=t(c.list),m=v[0],g=v[1],y={url:n,si:o,su:i,flt:r,lt:m,pt:p,guid:s,huid:l,v:f};return g&&(y.lt2=g),h&&(y.pt2=h),y};var mt=function(t){var e=t.key,n=t.ident,r=t.domain,i=t.expires;void 0===i&&(i=365);var o={path:"/",domain:"."+r};this.cfg=L({expires:i},o);var a=this.migrate(e,o);this.ident=""+n,this.key=a.key,this.list=a.list};mt.prototype.migrate=function(t,e){var n=it.get(t),r=t.replace(/^[a-z]/,function(t){return t.toUpperCase()});""!==n&&""===it.get(r)&&it.set(r,n,this.cfg),it.del(t,e);var i=it.get(r);return{key:r,list:""===i?[]:i.split(",")}},mt.prototype.init=function(){var t=this.list,e=this.key,n=this.ident,r=this.cfg;this.list=t.slice(-4).concat(n),it.set(e,this.list.join(","),r)};var gt=function(e){function t(t){e.call(this,t),this.init()}return e&&(t.__proto__=e),(t.prototype=Object.create(e&&e.prototype)).constructor=t}(mt),yt=function(n){function t(t){n.call(this,t);var e=!function(t,e,n){if(!t||!t.length)return!1;var r=M(t[t.length-1],10);if(D.abs(e-r)>pt)return!1;if(function(t,e){var n=ut(t).hostname,r=n.indexOf(e);if(0<=r&&n.slice(r)===e)return!1;return!0}(G(),n))return!1;return!0}(this.list,this.ident,dt);(this.isNew=e)&&this.init()}return n&&(t.__proto__=n),(t.prototype=Object.create(n&&n.prototype)).constructor=t}(mt);var _t=/chrome/i.test(U.userAgent),wt=function(t,e){return t+(0<t.length?"&":"")+"_mtd="+e},bt=[function(t,e,n){if(kt&&U.sendBeacon(t,e&&wt(e,"bc")))return n&&n(),!0;return!1},function(t,e,n){var r=m.XMLHttpRequest;if(!r)return!1;var i=new r;if("withCredentials"in i==!1)return function(t,e,n){var r=m.XDomainRequest;if(!r)return!1;try{var i=new r,o=wt(e,"xdr");return i.open("POST",t),setTimeout(function(){return i.send(o)}),i.onload=i.onerror=function(){n&&n()},!0}catch(t){return!1}}(t,e,n);try{var o=wt(e,"xhr");return i.open("POST",t,!0),i.withCredentials=!0,i.setRequestHeader("Content-Type","text/plain"),i.onreadystatechange=function(){2<=i.readyState&&n&&n()},i.onerror=function(){n&&n()},i.send(o),!0}catch(t){return!1}},Et],xt={image:[2,0,1],xhr:[1,0,2],beacon:[0,2,1]};function Et(t,e,n){var r="qha_log_"+D.floor(2147483648*D.random()).toString(36),i=new m.Image;(m[r]=i).onload=i.onerror=i.onabort=function(){i.onload=i.onerror=i.onabort=null,i=m[r]=null,n&&n()},e=_t&&8153<e.length?e.slice(8153):e;var o,a,c,u=wt(e,"im");return i.src=(a=u,c=-1<(o=t).indexOf("?")?"&":"?",o+c+a),!0}var kt=w(U.sendBeacon);var Ot=0,jt=[];function St(t){w(t)&&(Ot+=1,t.i=Ot,jt.push(t))}var Ct=l.prototype.trim,Nt=/^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g,It=w(Ct)?function(t){return Ct.call(t)}:function(t){return t.replace(Nt,"")};function Pt(t){return!1==(null!=t)?"":It(""+t)}var At=/(,)|(\[|{)|(}|])|"(?:[^"\\\r\n]|\\["\\/bfnrt]|\\u[\da-fA-F]{4})*"\s*:?|true|false|null|-?(?!0\d)\d+(?:\.\d+|)(?:[eE][+-]?\d+|)/g;function Lt(t,e,n){if("send"===t&&n&&0===n.demo){var r=e[0],i=r&&r.et;if(a<=i){var o=null;try{o=function(t){var i,e=Pt(""+t);if("object"==typeof JSON&&JSON&&JSON.parse)return JSON.parse(e);var o=null,n=e.replace(At,function(t, e, n, r){return i&&e&&(o=0),0===o?t:(i=n||e,o+=!r-!n,"")});if(e&&!Pt(n))return new _[c]("return "+e)();throw new Error("Invalid JSON: "+t)}(it.get("mediav"))}catch(t){}L(r,o)}}}function qt(t, e, n){if("send"===t&&n&&0===n.demo){var r=e[0],i=r&&r.et;i!==y&&i!==o||L(r,function(){var t={};m._e360_uid&&L(t,{e_uid:m._e360_uid||"",e_cid:m._e360_campaignid||"",e_gid:m._e360_groupid||"",e_yid:m._e360_creativeid||"",e_kid:m._e360_keywordid||"",e_clkid:m._e360_clickid||"",e_type:m._e360_type||"",e_query:m._e360_query||"",e_mtype:m._e360_matchtype||"",e_smtype:m._e360_submatchtype||""});m._e360_commerce&&(t.e_com=m._e360_commerce);m._e360_sip&&(t.e_sip=m._e360_sip);return t}())}}function Tt(t, e){m.postMessage&&m.top!==m&&m.top.postMessage(b({type:t,args:e}),"*")}var Vt,Rt,Ut,Ft=[],Jt=[];function Dt(t,e){1===t?Ft.push(e):Jt.push(e)}function Mt(t,e){O(1===t?Ft:Jt,function(t){w(t)&&t(e)})}var Xt=V,Bt=[],Ht=!1;function $t(){var t=Bt;Ht&&t.length&&(Bt=[],function(t){for(var e=0;e<t.length;e+=1)t[e](Xt)}(t))}function Yt(){Ht||(Ht=!0,Ut&&clearInterval(Ut),$t())}if("complete"===V.readyState)Yt();else if(V.addEventListener)V.addEventListener("DOMContentLoaded",Yt,!1),m.addEventListener("load",Yt,!1);else if(m.attachEvent){m.attachEvent("onload",Yt),Rt=V.createElement("div");try{Vt=null===m.frameElement}catch(t){}Rt.doScroll&&Vt&&m.external&&(Ut=setInterval(function(){try{Rt.doScroll(),Yt()}catch(t){}},30))}var Wt=/micromessenger/.test(U.userAgent.toLowerCase()),zt=X+"//360fenxi.mediav.com";function Gt(t){var e;e=function(){return function(t){var e=t.domain,n=t.currentPV,r=t.mvid,i=null;if(!r||0<n.index)return;if(Wt)return Kt("wx");if(143225==+e)return;1===z()&&Kt("adb");try{i=V.createElement('<iframe name="'+r+'"></iframe>')}catch(t){(i=V.createElement("iframe")).name=r}i.height=0,i.width=0,i.border=0,i.style.display="none",i.src=zt+"/mv.html",i.onload=null,o=r,c=o.split(","),a=function(t){var e,n=t.origin,r=t.data,i=(""+r).split("|"),o=i[0],a=i[1];-1<n.indexOf(zt)&&(e=o)&&("mid"===e||-1<N(c,e))&&function(t,e){if("mid"===t)return m[g]("send",{et:s,mid:e});var n=e.split(","),r=n[0];void 0===r&&(r="");var i=n[1];void 0===i&&(i="");var o=n[2];void 0===o&&(o="");var a={eid:t,ep:r,vid:i,ctn:o};it.set("mediav",b(a)),m[g]("send",L({et:u},a))}(o,a)},"postMessage"in m?$(m,"message",a):U._qha_message=function(t){return a({origin:zt,data:t})},V.body?V.body.appendChild(i):$(m,"load",function(){V.body.appendChild(i)});var o,c,a}(t)},Ht?e(Xt):Bt.push(e)}function Kt(t){m[g]("send",{et:e,msg:t})}function Qt(t){var e=t.currentPV.start,n={et:o,ep:P()-e};m[g]("send",n,"beacon")}var Zt=function(t){var e,n,r,i,o,a,c,u,s=t.currentPV,f=s.index,l=s.session.isNew,d=t.e360,p=d&&0===f&&l,h=L({et:y,ck:0|!l},(e=F.pixelDepth,n=F.colorDepth,r=F.width,i=F.height,o=U.language,a=U.browserLanguage,{adb:z(),cl:e||n||0,ds:r+"x"+i,ln:o||a||"unknown"})),v=(u=!(c=function(){return m[g]("send",h)}),function(){if(!u)return u=!0,c.apply(this,arguments)});p?(!function(t,n,e){void 0===n&&(n=_),void 0===e&&(e=_);var r=V.getElementsByTagName("script")[0],i=V.createElement("script");i.type="text/javascript",i.defer=!0,i.async=!0,i.src=t,i.onerror=e,i.onload=n,i.onreadystatechange=function(t){var e=i.readyState;"loaded"!==e&&"complete"!==e||n(t)},r.parentNode.insertBefore(i,r)}(X+"//e.so.com/search/c.js?u="+d,v,v),setTimeout(v,500)):v()},te=Y(V,"mousedown",!0),ee=null;var ne=function(t){this.cf=t};ne.prototype.update=function(t){throw new Error("`update()` method not implemented")},ne.prototype.listener=function(t){throw new Error("`listener()` method not implemented")},ne.prototype.send=function(t,e){m[g]("send",t,e)};var re=function(e){function t(t){var r=this;e.call(this,t),t.idClk?(this.map=t.idClk,this.matches=[],this.listener=function(t){var e=function(t){var e=t.id;for(;!e&&(t=t.parentNode);)e=t.id;return t}(t.target),n=e&&e.id;n&&-1<N(r.matches,n)&&r.send({et:i,ep:n})}):this.listener=_}return e&&(t.__proto__=e),((t.prototype=Object.create(e&&e.prototype)).constructor=t).prototype.update=function(){this.matches=function(t,r){if(!t)return[];var e=x(t,function(t,e,n){return T(n,r)&&t.push(e),t},[]).join(",").split(",");return C(e)}(this.map,this.cf.currentPV.url)},t}(ne);var ie=function(n){function t(t){var e=this;n.call(this,t),this.clk=1==+t.urlClk,this.listener=function(t){return e.clk&&e.resp(t)},this.update=_}return n&&(t.__proto__=n),((t.prototype=Object.create(n&&n.prototype)).constructor=t).prototype.resp=function(t){var e,n,r,i,o=function(t){var e=t.target,n={t:e.nodeName},r=0;for(;r<3&&e&&"A"!==e.nodeName;)r++,e=e.parentNode;return n.u=e&&"A"===e.nodeName?e.href:"",n}(t),a=o.u;a&&!/^\s*javascript:/.test(a)&&this.send({et:2,ep:(e=o,n=function(t){var e=t.pageX;void 0===e&&(e=0);var n=t.pageY;void 0===n&&(n=0);return{x:e,y:n}}(t),r=E(e,function(t,e){return e+":"+encodeURIComponent(t)}),i=E(n,function(t,e){return e+":"+encodeURIComponent(t)}),r.concat(i).join(","))},"beacon")},t}(ne);var oe=function(n){function t(t){var e=this;n.call(this,t),this.list=t.pageClk,this.trk=!1,this.listener=function(t){e.trk&&e.clk(t)}}return n&&(t.__proto__=n),((t.prototype=Object.create(n&&n.prototype)).constructor=t).prototype.update=function(){this.trk=function(t,e){if(!t||0===t.length)return!1;for(var n=0;n<t.length;n++)if(T(t[n],e))return!0;return!1}(this.list,this.cf.currentPV.url)},t.prototype.clk=function(t){var e,n,r,i=t.clientX,o=t.clientY,a=(e=void 0!==m.pageXOffset,n=W?V.documentElement:V.body,{scrollX:e?m.pageXOffset:n.scrollLeft,scrollY:e?m.pageYOffset:n.scrollTop}),c=a.scrollX,u=a.scrollY,s=(r=W?V.documentElement:V.body,{width:D.max(r.scrollWidth,r.clientWidth),height:D.max(r.scrollHeight,r.clientHeight)}),f=s.width,l=s.height;this.send({et:10,x:i+c,y:o+u,w:f,h:l})},t}(ne);var ae={},ce=L({version:"3.1.0",currentPV:null},(v(!1),m._qha_data)),ue=ce.domain,se=X+"//"+ce.host+"/s.gif?lts=1",fe="_qha_ldt_",le=m[fe]=(m[fe]||0)+1,de=!1,pe=0,he=function(t){return!(!t||"[object String]"!==p(t))&&-1<t.indexOf("//s.union.360.cn/"+ue+".js")};if(V.currentScript){de=he(V.currentScript.src)}else{for(var ve=V.getElementsByTagName("script"),me=0;me<ve.length;me++){he(ve[me].src)&&(pe+=1)}de=le<=pe}if(!de){var ge=m.console;ge&&w(ge.warn)&&ge.warn("请不要自行托管 360 分析统计脚本！！！")}de&&Et(se,q({et:100,si:ue,ldt:le,vis:nt(),prv:+rt(),guid:ce.gu,huid:ce.hu,t:I(),v:"3.1.0"}));var ye,_e,we=function(){var n;Dt(-1,Qt),Dt(1,Gt),Dt(1,Zt),Dt(1,function(){ee&&O(ee,function(t){return t.update()})}),n=ce,ee=j([ie,re,oe],function(t){var e=new t(n);return te.append(e.listener),e}),St(Lt),St(qt),St(Tt)},be={set:function(t,e){ae[t]=e},send:function(){for(var t,e,n=[],r=arguments.length;r--;)n[r]=arguments[r];if("pageview"===n[0])return t=ae.page,!1===(e=null==ce.currentPV)&&Mt(-1,ce),ce.currentPV=new vt({referrer:e?G():ce.currentPV.url,domainId:ue,url:t?ut(t).href:R.href,conf:ce}),void Mt(1,ce);var i=n[0],o="string"==typeof n[1]?n[1]:ae.transport,a=null;v(n[1])?a=A(n[1]):v(n[2])&&(a=A(n[2])),L(i,ce.currentPV.getBaseInfo(),{t:I()});var c=[se,i,o,a],u=ae.pingGuard;w(u)&&!0!==u.apply(null,c)||function(n,t,e,r){void 0===e&&(e="image");var i=q(t);if(i.length<=2048&&"beacon"!==e)return Et(n,i,r);k(e in xt?xt[e]:[0,1,2],function(t,e){return t||bt[e](n,i,r)},!1)}.apply(null,c)}},xe=function(t){var e,n,r,i,o=h(e=t)?e:e.length&&e.item?j(e,f):S.call(e),a=o[0],c=o.slice(1),u=be[a];n=a,r=c,i=ce.currentPV,O(jt,function(t){w(t)&&0<t.i&&t(n,r,t.i?i:void 0)}),w(u)&&u.apply(null,c)};de&&!rt()&&(ye=function(){if(!m[g]||1!==m[g].__){if(!1===w(m[g])){var n=function(){for(var t=[],e=arguments.length;e--;)t[e]=arguments[e];(n.c=n.c||[]).push(t)};m[g]=n}we(),m[g]("init",ue);var t=m[g];t&&h(t.c)&&t.c.length&&(m[g].s||t.c.unshift(["send","pageview"]),O(t.c,xe)),m[g]=function(){for(var t=[],e=arguments.length;e--;)t[e]=arguments[e];return xe(t)},m[g].__=1,$(m,"unload",function(){return Mt(-1,ce)})}},(_e=function(){return"prerender"===nt()})()?et.append(function(){!1===_e()&&(ye(),et.destroy())}):ye())}(this);



