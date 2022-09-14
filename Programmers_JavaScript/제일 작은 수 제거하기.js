function solution(arr) {
    var answer = [];
    const min = Math.min.apply(null, arr);
    for(let i =0; i<arr.length; i++){
        if(arr[i] == min){
            continue;
        }else{
            answer.push(arr[i]);
        }
    }
    if(answer.length == 0){
        answer = [-1];
    }
    return answer;
}

function solution(arr) {
    arr.splice(arr.indexOf(Math.min(...arr)),1);
    if(arr.length<1)return[-1];
    return arr;
}

function solution(arr) {
    if (arr.length === 1 ) {
        return [-1]
    }
    const minValue = Math.min.apply(null, arr)
    const index = arr.findIndex(value => value === minValue)
    arr.splice(index, 1)
    return arr
}

function solution(arr) {
    if (arr.length > 1) {
        var minNum = Math.min(...arr);
        var idx = arr.indexOf(minNum);
        arr.splice(idx, 1);
    } else {
        arr = [-1];
    }
    return arr;
}