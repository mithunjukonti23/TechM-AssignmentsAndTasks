//current date and time
var now= new Date();
var days=["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
var h=now.getHours();
var min=now.getMinutes();
var sec=now.getSeconds();
var p=h>=12?"PM":"AM";
h=h%12 || 12;
console.log("Today is : "+days[now.getDay()]);
console.log("Current time is : "+h+" "+p+" : " +min+" : "+sec);
