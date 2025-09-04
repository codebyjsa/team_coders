// let promise = new Promise((resolve, reject) => {
        
    // })
    function asyncfunc (){
        return new Promise((resolve,reject) => {
            setTimeout(() => {
                
            console.log("data1")
            }, 4000);
        })
    };

    console.log("hlo i am coming")
    let p1 = asyncfunc();
    p1.then((res) => {
        console.log(res)
    })
    

