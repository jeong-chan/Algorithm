function solution(arr, divisor) {
    var answer = [];
    
    for(let i = 0; i<arr.length; i++){

    if(arr[i] % divisor == 0){
        answer.push(arr[i]);
    }

}

if(answer.length != 0){

    answer.sort(function(a,b) {
        if(a > b) return 1;
        if(a === b)return 0;
        if(a < b) return -1; 
    });

}else{

    answer.push(-1);
}
    
    return answer;
}

function solution(arr, divisor) {
    var answer = arr.filter(v => v%divisor == 0);
    return answer.length == 0 ? [-1] : answer.sort((a,b) => a-b);
}

function solution(arr, divisor) {
    var answer = [];

    for(var i = 0; i < arr.length; ++i) {
        if(arr[i] % divisor == 0) answer.push(arr[i]);
    }

    return answer.length < 1 ? [-1] : answer.sort((a, b) => a - b);
}

function solution(arr, divisor) {
    var answer = [];
    arr.map((o) => {
        o % divisor === 0 && answer.push(o);
    })
    return answer.length ? answer.sort((a, b) => a - b) : [-1];

}
