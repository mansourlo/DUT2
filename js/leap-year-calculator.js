/*Une année bissextile est une année divisible par 4, à l'exception des années divisibles par 100 et non divisibles par 400. Par exemple, 2000 est une année bissextile, mais 1900 ne l'est pas. De plus, une année bissextile comporte un jour supplémentaire en février, à savoir le 29e jour du mois.*/

const isLeapYear = (num) =>{
  if(num % 4 === 0){
    if(num % 400 === 0){
      return num + ' is a leap year.';
    }else if(num % 100 === 0){
      return num + ' is not a leap year.';
    }else if(num % 100 != 0){
      return num + ' is a leap year.';
    }
  }else{
    return num + ' is not a leap year.';
  }
}
const year = 1900;
let result = isLeapYear(year);
console.log(result);