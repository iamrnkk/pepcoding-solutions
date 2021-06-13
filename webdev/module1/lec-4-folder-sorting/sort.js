const fs= require("fs");
const extensions= require("./extensions.js");

const testFolderPath= "./test";

// get contents of directory
const contents= fs.readdirSync("test");

// sort the contents
for(let i=0 ; i<contents.length; i++)
{
    let file= contents[i];
    sortFile(file);
}

function sortFile(file)
{
    let ext= file.split(".")[1];
    let folderName= getFolderName(ext);
    let folderPath= testFolderPath+"/"+folderName;
    
    if(!fs.existsSync(folderPath)) 
    {
        fs.mkdirSync(folderPath);
    }

    let src= testFolderPath+"/"+file;
    let dst= folderPath+"/"+file;

    console.log(src );
    console.log(dst);
    fs.copyFileSync(src,dst);
    fs.unlinkSync(src);
}

function getFolderName(ext)
{
    let folderName="";
    for(let key in extensions)
    {    
        if(extensions[key].includes(ext)) 
            {
                folderName=key;
                return folderName;
            }
    }
}