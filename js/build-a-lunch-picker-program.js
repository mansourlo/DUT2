let lunches = [];

function addLunchToEnd(array, str){
  array.push(`${str}`);
  console.log(`${str} added to the end of the lunch menu.`);
  return array;
}
/*console.log(addLunchToEnd(lunches, "tacos"));
console.log(addLunchToEnd(["pizza", "burger"], "tacos"));*/

const addLunchToStart = (array, str) =>{
  array.unshift(`${str}`);
  console.log(str + " added to the start of the lunch menu.");
  return array;
}

const removeLastLunch = (array) =>{
  if(array.length === 0){
    console.log("No lunches to remove.");
    }else{
      console.log(array.pop() + " removed from the end of the lunch menu.");
  }
  return array;
}

const removeFirstLunch = (array) =>{
  if(array.length === 0){
    console.log("No lunches to remove.");
    }else{
      console.log(array.shift() + " removed from the start of the lunch menu.");
  }
  return array;
}

const getRandomLunch = (array) =>{
  let index = Math.floor(Math.random() * array.length);
  let element = array[index];

  if(array.length === 0){
    console.log("No lunches available.");
    }else{
      console.log(`Randomly selected lunch: ${element}`);
  }
  return array
}

function showLunchMenu(array){
  if(array.length === 0){
    console.log("The menu is empty.");
    }else{
      console.log(`Menu items: ${array.join(", ")}`);
  }
  return 1;
}
console.log(showLunchMenu(["Greens", "Corns", "Beans"]));