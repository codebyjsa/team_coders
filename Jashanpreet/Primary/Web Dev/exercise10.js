let random = Math.random()
let first , second , third ;
if(random<0.33){
    first = "crazy" ;

}
else if(random<0.66 && random>=0.33){
 first = "amazing";

}
else{
    first = "fire";
}



if(random<0.33){
    second = "Engine" ;

}
else if(random<0.66 && random>=0.33){
 second = "foods";

}
else{
    first = "garments";
}




if(random<0.33){
    third = "bros" ;

}
else if(random<0.66 && random>=0.33){
 third = "limited";

}
else{
    third = "hub";
}


console.log("business name generated : ",`${first} ${second} ${third}`)