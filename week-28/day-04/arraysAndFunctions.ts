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











