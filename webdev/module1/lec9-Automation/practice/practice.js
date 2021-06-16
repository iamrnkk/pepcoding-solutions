const fs=  require("fs");

let pendingPromise= fs.promises.readFile("./f1.txt");
console.log(""+pendingPromise);

pendingPromise.then(function(data){
    console.log(data+"");
    console.log(""+pendingPromise);
    f2Promise=fs.promises.readFile("./f2.txt");
    return f2Promise;
})
.then(function(data){
    console.log(data+"");
})

console.log(""+pendingPromise);