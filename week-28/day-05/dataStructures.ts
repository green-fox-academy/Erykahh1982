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

console.log("");
//TASK 3.
// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crutial component, find out what it is and insert it too!

let url: string = 'https//www.reddit.com/r/nevertellmethebots';
console.log(url); //print the original string
function stringRepair(str: string): string{
return url.substr(0,5).concat('.').concat(url.substr(5,url.length).replace('bots', 'odds'));
}
console.log(stringRepair(url)); // print the corrected url

console.log("");
//TASK 4
// While saving this quote, a disk error has occured. Please fix it.
// Add "always takes longer than" between the words "It" and "you"

let quote: string = `Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.`;
console.log(quote);
function repairQuote(str: string):string{
    return quote.substr(0,20).concat(" always takes longer than ").concat(quote.substr(21, quote.length));
}

console.log(repairQuote(quote));

console.log("");
//TASK 5
// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

let todoTextOriginal: string = ' - Buy milk\n';

let todoText: string = ' - Buy milk';
var newTodo: string = "My todo:" + "\n" + todoText + "\n" + ' - Download games' + '\n' + '     - Diablo';
console.log(newTodo);
console.log("");

console.log("My todo:\n" + todoTextOriginal.concat(' - Download games\n').concat('     - Diabolo'));

console.log("");
//TASK 6
// Things are a little bit messed up
// Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
// Assemble the fragments into the out variable

let out: string = '';
let notSoCrypticMessage: number[] = [1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11];

let hashmap = {
  7: 'run around and desert you',
  50: 'tell a lie and hurt you ',
  49: 'make you cry, ',
  2: 'let you down',
  12: 'give you up, ',
  1: 'Never gonna ',
  11: '\n',
  3: 'say goodbye '
};

for(let p = 0; p < notSoCrypticMessage.length; p++){
    out = out + hashmap[notSoCrypticMessage[p]];
}
console.log(out);