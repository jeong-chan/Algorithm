function solution(s){
    var answer = true;
    s = s.toLowerCase();
    var pCount = 0;
    var yCount = 0;
    for(let i=0; i<s.length; i++){
        if(s[i] === "p"){
            pCount++;
        }else if(s[i] === "y"){
            yCount++;
        }
    }
    if(pCount === yCount){
        answer = true;
    }else{
        answer = false;
    }
    
    return answer;
}

function numPY(s){
    //함수를 완성하세요
      return s.toUpperCase().split("P").length === s.toUpperCase().split("Y").length;
  }
  
  
  // 아래는 테스트로 출력해 보기 위한 코드입니다.
  console.log( numPY("pPoooyY") )
  console.log( numPY("Pyy") )