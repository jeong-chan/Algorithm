function solution(num) {
    var answer = 0;
    var cycle = 1;
    
    if(num === 1){
        return 0;
    }else{
        
    
    while(cycle <= 500){
        if(num%2 === 0){
            num = num/2;
        }else{
            num = (num*3)+1;
        }
        
        if(num === 1){
            return cycle;
        }
        cycle++;
    }
    
    return -1;
        
    }
}

function collatz(num) {
    var answer = 0;
    while(num !=1 && answer !=500){
        num%2==0 ? num = num/2 : num = num*3 +1;
    answer++;
  }
    return num == 1 ? answer : -1;
}
