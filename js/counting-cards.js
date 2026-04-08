let count = 0;
function cc(card){
  if(card >= 2 && card <= 6){
    count++;
  }else if(card >= 7 && card <= 9){
    count;
  }else{
    count--;
  }
  
  if(count > 0){
    return count + " Bet";
  }else{
    return count + " Hold";
  }
}

console.log(cc(2)); console.log(cc(3));
console.log(cc(4)); console.log(cc(5));
console.log(cc(6));