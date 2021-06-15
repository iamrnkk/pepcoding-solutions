const cheerio= require("cheerio");
const request= require("request");
const fs= require("fs");
const processOneTopic = require("./topic");

request("https://github.com/topics",function(err,res,html){
    processHTML(html);
});

function processHTML(html)
{
    let ch= cheerio.load(html);
    let allTopicATags= ch(".topic-box a");
    //console.log(allTopicATags);

    const allTopicInfo= [];

    for(let i=0; i<allTopicATags.length;i++)
    {
        let oneTopicATag= ch(allTopicATags[i]);
        let oneTopicLink= "https://github.com/"+ oneTopicATag.attr("href");
        let oneTopicName= oneTopicATag.find(".f3").text().trim();
        allTopicInfo.push({ topicName: oneTopicName, topicLink: oneTopicLink });
        let topicFolderPath = `./github/${oneTopicName}`;
        if(!fs.existsSync(topicFolderPath))
            fs.mkdirSync(topicFolderPath);
        processOneTopic(allTopicInfo[i]);
    }
}