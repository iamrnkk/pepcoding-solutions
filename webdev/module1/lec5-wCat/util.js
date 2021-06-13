function applySFlag(data)
{
    const dataComp= data.split("\r\n");
    let sDataComp= [];
    let emptyFound= false;
    if(dataComp[0]=='') emptyFound=true;

    for(let i=0; i<dataComp.length; i++){
        if(dataComp[i]!='')
        {
            sDataComp.push(dataComp[i]);
            emptyFound=false;
        }
        else if(dataComp[i]=='' && !emptyFound)
        {
            sDataComp.push('');
            emptyFound=true;
        }
    }
    let sData= sDataComp.join("\r\n");
    return sData;
}

function applyNFlag(data)
{
    const dataComp= data.split("\r\n");
    nDataComp=[];
    for(let i=0; i<dataComp.length; i++)
        nDataComp.push(`${i+1}.${dataComp[i]}`);
    let nData= nDataComp.join("\r\n");
    return nData;
}

function applyBFlag(data)
{
    const dataComp= data.split("\r\n");
    bDataComp=[];
    let count=1;
    for(let i=0; i<dataComp.length; i++)
    {
        if(dataComp[i]!='')
        {
            bDataComp.push(`${count}.${dataComp[i]}`);
            count++;
        }
        else bDataComp.push(dataComp[i]);
    }
    let bData= bDataComp.join("\r\n");
    return bData;
}

module.exports.applySFlag=applySFlag;
module.exports.applyNFlag=applyNFlag;
module.exports.applyBFlag=applyBFlag;