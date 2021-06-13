const fs = require("fs");
let {applySFlag, applyNFlag, applyBFlag}= require("./util");

// 1.get terminal arguments
const input= process.argv.slice(2);

const files=[];
const flags=[];

// 2.segregate flags and files
for(let i=0; i<input.length; i++)
{
    if(input[i].startsWith("-"))
    {
        flags.push(input[i]);
    }
    else files.push(input[i]);
}

let data="";

// 3.extract data from files
for(let i=0; i<files.length; i++)
{
    let fileData= fs.readFileSync(files[i]);
    data+= i==files.length-1?fileData: fileData+"\r\n";
}


// 4.Perform operations according to flags.
if (flags.includes("-s")) data= applySFlag(data);

for(let flag in flags)
{
    if(flag== "-s") continue;
    else if(flag=="-n") data= applyNFlag(data);
    else data= applyBFlag(data);
    break;
}

console.log(data);