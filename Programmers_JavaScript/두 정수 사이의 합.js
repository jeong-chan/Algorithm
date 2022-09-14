function solution(a, b) {
    var answer = 0;
    if( a > b ){    
        for(let i = b; i <= a; i++){
            answer += i;
        }
    }else{
        for(let i = a; i <= b; i++){
            answer += i;
        }
    }
    return answer;   
}

function adder(a, b){
    var result = 0
    //함수를 완성하세요


    return (a+b)*(Math.abs(b-a)+1)/2;
}

function adder(a, b, s = 0){
    for (var i = Math.min(a, b); i <= Math.max(a, b); i++) s += i;
    return s;
  }