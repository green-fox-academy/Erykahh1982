//TASK 1.
let example: string = 'In a dishwasher far far away';

// I would like to replace "dishwasher" with "galaxy" in this example
// Please fix it for me!
// Expected ouput: In a galaxy far far away
var stringToReplace = 'dishwasher';

console.log(example.replace(stringToReplace,'galaxy'));

console.log("");
//TASK 2.
// Create a function that can reverse a string, which is passed as the parameter
// Use it on this reversed string to check it!

let reversed: string = `.eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI`;

//String reverse function with bulit in methods
//SOLUTION ONE

function reversestring(str: string) : string{
// Step 1. Use the split() method to return a new array
var splitString = str.split("");
console.log(splitString);
// Step 2. Use the reverse() method to reverse the new created array
var reverseArray = splitString.reverse();
console.log(reverseArray);
// Step 3. Use the join() method to join all elements of the array into a string
var joinArray = reverseArray.join("");
console.log(joinArray);
//Step 4. Return the reversed string
return joinArray;
}
console.log(reversestring(reversed));

console.log("OR")
//SOLUTION TWO
//this chained function is working well!!
function reverseStringInOneLine(str): string{
    return str.split("").reverse().join("");
}
console.log(reverseStringInOneLine(reversed));

console.log("");
//SOLUTION FOUR
// String reversing function woth forLoop
function reverseStringWithForLoop(str : string):string {
    var newString = "";
    for (var i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    return newString;
}
console.log(reverseStringWithForLoop(reversed));

console.log("");
//SOLUTION FIVE
// String reverse with Ternary OPerator
function reverseStringTernaray(str: string): string {
    return (str === '') ? '' : reverseStringTernaray(str.substr(1)) + str.charAt(0);
  }
  console.log(reverseStringTernaray(reversed));
