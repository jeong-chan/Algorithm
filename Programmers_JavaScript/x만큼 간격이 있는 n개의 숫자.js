function solution(x, n) {
    var answer = [];
    var def = 0;
    for(let i=0; i<n; i++){
        if(i===0){
            answer.push(def+x);
        }else{
            answer.push(answer[i-1]+x);    
        }
    }
    console.log(answer);
    return answer;
}

function solution(x, n) {
    var answer = [];
    for (let i = 1; i <= n; i++) {
        answer.push(x*i)
    }
    return answer;
}

function solution(x, n) {
    return Array(n).fill(x).map((v, i) => (i + 1) * v)
}