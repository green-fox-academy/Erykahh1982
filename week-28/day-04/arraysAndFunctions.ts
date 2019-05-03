// -  Create a variable named `baseNum` and assign the value `123` to it
// -  Create a function called `doubling` that doubles it's input parameter and returns with an integer
// -  Log the result of `doubling(baseNum)` to the console
  
function greetFoxLog() {
    console.log('Hello Green Fox!');
}
  
greetFoxLog();

console.log("");

var baseNum : number = 123;
function doubling(input: number){
    console.log(input * 2);
}
doubling(123);

console.log("");
//Create variable named `nameToGreet` and assign the value `Greenfox` to it
// -  Create a function called `greet` that greets it's input parameter
//     -  Greeting is printing e.g. `Greetings, dear Greenfox`
//     -  Prepare for the special case when no parameters are given
// -  Greet `nameToGreet`

var nameToGreet : string = 'Greenfox';
function greet(input1 ?: string ){
    if(input1 === undefined){
        console.log('No parameter have arrived');
    }else{
        console.log('Greetings dear, ' + input1);
    }
}
greet(nameToGreet);
greet();

console.log("");
// -  Create a string variable named `typo` and assign the value `Chinchill` to it
// -  Write a function called `appendAFunc` that gets a string as an input,
//    appends an 'a' character to its end and returns with a string
// -  Print the result of `appendAFunc(typo)`

var typo : string = 'Chinchill';
function appendAFunc(input2 ? : string){
    var result2 = input2 + 'a';
    console.log(result2);
}
appendAFunc(typo);

console.log("");
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
function sum(input3 ? : number){
    var sumResult = 0;
    for(let i = 0; i <= input3; i++){
        sumResult += i;
    }
    console.log('The sum of the numbers from zero till ' + input3 + ' is : ' + sumResult);
}
sum(5);

console.log("");
// -  Create a function called `factorio`
//    that returns it's input's factorial

function factorio(input4 ? : number){
    var result4 = 1;
    for(let i = 0; i < input4; i++){
        result4 *= i+1;
    }
    console.log('The factorial of the given parameter is: ' + result4);
}
factorio(5);

console.log("");
// -  Create a function called `printParams`
//    which logs to the console the input parameters
//    (can have multiple number of arguments)

function printParams(input5 : number, input6 ? : string){
    console.log(input5 + " | " + input6);
}
printParams(65, "Erika");
console.log("");

function printParams2(input7 ? : any[]){
        console.log(input7);
}
printParams2([1,"Erika",3,"Eszter",5,6,"Viola",8]);

console.log("");
// -  Create a variable named `magicNumbers`
//    with the following content: `[1, 3, 5, 7]`
// -  Print the third element of `magicNumbers`

var magicNumbers: Array<number> = [1,3,5,7];
console.log(magicNumbers[2]);

console.log("");
// -  Create a variable named `firstList`
//    with the following content: `[1, 2, 3]`
// -  Create a variable named `secondList`
//    with the following content: `[4, 5]`
// -  Log "p2 is longer" to the console if `secondList` has more elements than `firstList`

var firstList : number[] = [1, 2, 3];
var secondList : number[] = [4, 5, 6, 7, 8];
if(firstList.length < secondList.length){
    console.log('p2 is longer');
}else{
    console.log('p2 is shorter');
}

console.log("");
// -  Create a variable named `r` with the following content: `[54, 23, 66, 12]`
// -  Print the sum of the second and the third element

let r = [54, 23, 66, 12];
let sumElements : number = r[1] + r[2];
console.log(sumElements);

console.log("");
// -  Create a variable named `abc` with the following content: `["Arthur", "Boe", "Chloe"]`
// -  Swap the first and the third element of `abc`

let abc : string[] = ["Artur", "Boe", "Chloe"];
console.log(abc.reverse());

console.log("");
// -  Create a variable named `integers` with the following content: `[4, 5, 6, 7]`
// -  Log each the element of `integers` to the console*
// *hint: use a loop, console.log(integers) won't cut it
// -  bonus for using the correct built in array method

let integers : number[] = [4, 5, 6, 7];
integers.forEach(function(item){
    console.log(item);
});
console.log("OR");
for(let i = 0; i < integers.length; i++){
    console.log(integers[i]);
}
console.log("OR");
console.log(integers.join());
console.log("OR");
console.log(integers.toString());

console.log("");
// -  Create an array named `numList` with the following content: `[1, 2, 3, 8, 5, 6]`
// -  Change the 8 to 4 with the `.map` method 
// -  Print the fourth element as a test

let numList : number[] = [1, 2, 3, 8, 5, 6];
console.log(numList.toString());
numList.map(function(item){
    if(item === 3){
        numList[item] = 4;
    }
});
console.log(numList[3]);
console.log(numList.toString());

console.log("");
// -  Create a variable named `numList` with the following content: `[1, 2, 3, 4, 5]`
// -  Increment the third element simply by accessing it
// -  Log the third element to the console

let numList2: number[] = [1, 2, 3, 4, 5];
numList2.map(function(element){
    if(element == 2){
        numList2[element]++;
    }
});
console.log(numList2.toString());

console.log("");
// -  Create an array variable named `animals`
//    with the following content: `["koal", "pand", "zebr"]`
// -  Add all elements an `"a"` at the end

let animals : string[] = ["koal", "pand", "zebr"];
animals.forEach(function(k){
    console.log(k);
})
animals.forEach(function(item){
    let modifiedAnimals = item + 'a';
    console.log(modifiedAnimals.toString());
});

console.log("");
// -  Create an array variable named `drinks` with the following content: `['Gin', 'Whiskey', 'Wine', 'Beer']`
// -  Double all the strings in the array, use a built in array method instead of a loop
// It should print: ['GinGin', 'WhiskeyWhiskey', 'WineWine', 'BeerBeer']`

let drinks : string[] = ['Gin', 'Whiskey', 'Wine', 'Beer'];
drinks.forEach(function(y){
    let modifiedDrinks = (y + y);
    console.log(modifiedDrinks.toString());
});

console.log("");
// -  Create a two dimensional list
//    which can contain the different shades of specified colors
// -  In `colors[0]` store the shades of green:
//    `"lime", "forest green", "olive", "pale green", "spring green"`
// -  In `colors[1]` store the shades of red:
//    `"orange red", "red", "tomato"`
// -  In `colors[2]` store the shades of pink:
//    `"orchid", "violet", "pink", "hot pink"`

let colors : string [][] = [
    ['lime', 'forest green', 'olive', 'pale green', 'spring green'],
    ['orange red', 'red','tomato'],
    ['orchid', 'violet', 'pink','hot pink']
];

console.log(colors[0]);
console.log(colors[1]);
console.log(colors[2]);

console.log("");
// -  Create a variable named `ai` with the following content: `[3, 4, 5, 6, 7]`
// -  Log the sum of the elements in `ai` to the console

let ai: number[] = [3, 4, 5, 6, 7];
console.log(ai.pop());  // cuts off the last element of an array and returns it --> 7
console.log(ai.shift());    // cuts off the first element of an array and returns it --> 3
console.log(ai.toString()); // remaining array elemenet list --> [4, 5, 6]

let ai2: number [] = [3, 4, 5, 6, 7];
let newItemSum : number = 0;
function getSum(total, num){
    return total + num;
}
newItemSum = ai2.reduce(getSum);
ai2.push(newItemSum);
console.log(ai2.toString());    // [3, 4, 5, 6, 7, 25]

console.log("");
// -  Create (dynamically*) a two dimensional list
//    with the following matrix**. Use a loop!
//
//    0 0 0 1
//    0 0 1 0
//    0 1 0 0
//    1 0 0 0
//
// -  Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array

let matrix : number [][] = [
    [0, 0, 0, 1],
    [0, 0, 1, 0],
    [0, 1, 0, 0],
    [1, 0, 0, 0]
]
var eachArray = "";

for(var m in matrix){
    console.log("row "  + m);
    for(var n in matrix[m]){
        console.log(" " + matrix[m][n]);
    }
}
console.log("");

for(let l = 0; l < matrix.length; l++){
    console.log("\n");
    for(let o = 0; o < matrix[l].length; o++){
        console.log(matrix[l][o]);
    }
}

console.log("");
for(let q = 0; q < matrix.length; q++){
    eachArray += matrix[q]+ "\n";
}
console.log(eachArray);

console.log("filling up the 2d matrix");
//filling up an empty 2dimensional arry

let matrix2 : number [][] = [];
let newMatrix2 = '';
let size = 4;

for(let a = 0; a < size; a++){
matrix2[a] = [];
for(let b = 0; b < size; b++){
    if(b == size - a -1){
        matrix2 [a][b] = 1;
    }else{
        matrix2 [a][b] = 0;
    }
}
newMatrix2 += matrix2[a] + "\n";
}

console.log(newMatrix2);



function print2Dmatrix(matris: number [][]){
    for(let x = 0; x < matris.length; x++){
        for(let g = 0; g < matris[x].length; g++){
            console.log(matris[x][g]);
        }
    }
}






console.log("");
// -  Create a variable named `numList`
//    with the following content: `[3, 4, 5, 6, 7]`
// -  Reverse the order of the elements in `numList`
// 	   -  do it with the built in method
//	   -  do it with creating a new temp array and a loop
// -  Print the elements of the reversed `numList`

let numList3 : number[] = [3, 4, 5, 6, 7];
console.log(numList3.reverse());

console.log("");

function reverseArrayElements(originalArray: number[]): number[]{
var tempArray = [];
for(var v = originalArray.length - 1; v >= 0; v--){
    tempArray.push(originalArray[v]);
    }
    return tempArray;
}

console.log(reverseArrayElements(numList3));
console.log("");

function reverseArrayInPlace(originalArray) {
    for (var i = 0; i <= Math.floor((originalArray.length - 1) / 2); i++) {
        let temp = originalArray[i];
        originalArray[i] = originalArray[originalArray.length - 1 - i];
        originalArray[originalArray.length - 1 - i] = temp;
    }
    return originalArray;
  }

  console.log(reverseArrayInPlace(numList3))

  console.log("");
  console.log(['apple', 'pear', 'melon'].indexOf('pear')); // 1

['apple', 'pear', 'melon'].forEach(function(e, i) {
  console.log(e, i);
});


let triples = [1, 2, 3, 4, 5].map(function(e) {
  return e * 3;
});
console.log(triples); /** [3, 6, 9, 12, 15] */


let evens = [1, 2, 3, 4, 5].filter(function(e) {
  return e % 2 == 0;
});
console.log(evens); /** [2, 4] */


let isAllEven = [2, 6, 14, 5, 4].every(function(e) {
  return e % 2 == 0;
});
console.log(isAllEven); /** false */


let isAnyEven = [2, 6, 14, 5, 4].some(function(e) {
  return e % 2 == 0;
});
console.log(isAnyEven); /** true */


let letters = 'apple'.split('');
console.log(letters); /** ['a', 'p', 'p', 'l', 'e'] */
console.log(letters.join('@')); /** Worms in the apple! */