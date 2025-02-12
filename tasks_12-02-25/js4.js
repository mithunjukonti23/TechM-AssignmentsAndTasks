//celsius to fahrenheit and viceversa
function ftoc(f){
    return (f-32)/9*5;
}
function ctof(c)
{
    return 9*c/5+32;
}
console.log("60 degrees C is : "+ctof(60)+" degrees F");
console.log("45 degrees F is : "+ftoc(45)+" degrees C");