//finding sundays
function findSun(s,e)
{
    for(let year=s;year<=e;year++)
    {
        let date=new Date(year,0,1);
        if(date.getDay()===0)
        {
            console.log(year)
        }
    }
}
findSun(2014,2025);
