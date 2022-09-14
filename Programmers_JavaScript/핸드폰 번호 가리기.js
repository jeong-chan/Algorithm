function solution(phone_number) {
    var answer = '';
    for(let i =0; i<phone_number.length-4; i++){
        answer += '*';
    }
    for(let i=phone_number.length-4; i<phone_number.length; i++){
        answer += phone_number[i];
    }
    return answer;
}

function hide_numbers(s) {
    return s.replace(/\d(?=\d{4})/g, "*");
  }

  function hide_numbers(s){
    var result = "*".repeat(s.length - 4) + s.slice(-4);
    //함수를 완성해주세요
  
    return result;
  }

  function hide_numbers(s){
    var result = ""
    //함수를 완성해주세요
    for(var i=0;i< s.length;i++){    
      result += i < s.length -4 ? "*" : s.charAt(i);
    }  
    return result;
  }