function solution(x) {
    var answer = true;
    var X = x+"".split("");
    
    var num = 0;
    for (let i=0; i<X.length; i++) {
        num += parseInt(X[i]);
    }      

    if(x%num === 0){
        answer = true;
    }
    else{
        answer = false;
    }
    
    return answer;
}

function Harshad(n){
    return !(n % (n + "").split("").reduce((a, b) => +b + +a ));
  }