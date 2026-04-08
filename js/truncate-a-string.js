function truncateString(str, num){
  if(str.length > num){
    let newStr = str.slice(0, num);
    return newStr + '...';
  }else if(str.length <= num){
    return str;
  }
}

console.log(truncateString('mansour', 3));