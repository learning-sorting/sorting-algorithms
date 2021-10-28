function sleepNumber(number) {

    setTimeout(function(){
        console.log(number);
    }, number*number);
}

function sleepSort(array) {
    for (i = 0; i < array.length; ++i){
        sleepNumber(array[i]);
    }
}


randoms = [];
for (i = 0; i < 100; ++i) {

    randomInt = Math.floor((Math.random()*100) + 1);
    randoms.push(randomInt);
}

// Sort said random numbers.
sleepSort(randoms);
