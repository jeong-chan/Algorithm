function solution(seoul) {
    for(const key in seoul){
        if(seoul[key] === "Kim"){
            return '김서방은 '+key+'에 있다'
        }
    }
}

function findKim(seoul){
    var idx = seoul.indexOf('Kim');
    return "김서방은 " + idx + "에 있다";
  }