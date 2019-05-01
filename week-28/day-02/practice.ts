let myName: string = "Erika";

console.log('Hello, ' + myName);

console.log(" ");

console.log('Humpty Dumpty sat on a wall,');
console.log('Humpty Dumpty had a great fall.');
console.log('All the king\'s horses and all the king\'s men');
console.log('Couldn\'t put Humpty together again.');

console.log(" ");

console.log("Hello, Eszter!");
console.log("Hello, Zsófi!");
console.log("Hello, Viola!");

console.log(" ");

console.log("Erika");
console.log(36);
console.log(1.60);

console.log("");
let numberOne: number = 22;
let numberTwo: number = 13;

console.log(22+13);
console.log(22-13);
console.log(22*13);
console.log(22./13);
console.log(22%13);

console.log(" ");

let result1: number = (17*5)*6;
let result2: number = (result1/17)/52;

console.log("The coding hours per attendee per semester is " + result1);
console.log("The percentage of the coding hours per semester is " + result2);

console.log(" ");

let favoriteNumber: number = 8
console.log("My favourite number is: " + favoriteNumber);

console.log(" ");

let a: number = 123;
let b: number = 526;
let c: number = b;
b = a;
a = c;

console.log(a);
console.log(b);

console.log(" ");

let massInKg: number = 81.2;
let heightInM: number = 1.78;
let bmiIndex: number = massInKg/(heightInM*heightInM);

console.log("The calculated BMI index is: " + bmiIndex);
console.log("");

let thisIsMyName: string = "Erika";
let myAge: number = 36;
let myHeght: number = 1.60;
let amIMarried: boolean = true;

console.log("My name is " + thisIsMyName + " I am " + myAge + " years old and I am " + myHeght + " meters tall and the answer to the question whether I am married is " + amIMarried);

console.log();

let aa: number = 3;
aa += 10;
// make it bigger by 10

console.log(aa);

let bb: number = 100;
bb -= 7;
// make it smaller by 7

console.log(bb);

let cc: number = 44;
cc *= 2;
// double c's value

console.log(cc);

let d: number = 125;
d /= 5;
// divide d's value by 5

console.log(d);

let e: number = 8;
e *= e;
// what's the cube of e's value?

console.log(e);

let f1: number = 123;
let f2: number = 345;
let result:boolean;
result = f1 > f2;
console.log(result);
// tell if f1 is bigger than f2 (as a boolean)

let g1: number = 350;
let g2: number = 200;
let result3: boolean;
result3 = (g2*2)>g1;
console.log(result3)

// tell if the double of g2 is bigger than g1 (pras a boolean)

let h: number = 1357988018575474;
let result4 : boolean;
result4 = h%11==0;
console.log(result4);
// tell if 11 is a divisor of h (as a boolean)

let i1: number = 10;
let i2: number = 3;
let result5 : boolean;
result5 = ((i1>(i2*i2)) && (i1<(i2*i2*i2)));
console.log(result5);
// tell if i1 is higher than i2 squared and smaller than i2 cubed (as a boolean)

let j: number = 1521;
let result6 : boolean;
result6 = (j%3==0 || j%5==0);
// tell if j is divisible by 3 or 5 (as a boolean)
console.log(result6);
console.log(j/3);
console.log(j/5);

console.log("");
// Write a program that stores 3 sides of a cuboid as variables (floats)
// The program should write the surface area and volume of the cuboid like:

let sideA: number = 15.15;
let sideB: number = 25.15;
let sideC: number = 35.15;

let volume: number = sideA * sideB * sideC;
let surface: number = 2*((sideA*sideB) + (sideA*sideC) + (sideB*sideC));
console.log("the surface of the cuboid is: " + surface);
console.log("the volume of the cuboid is: " + volume);

console.log("");
let currentHours: number = 14;
let currentMinutes: number = 34;
let currentSeconds: number = 42;
let remainingSeconds : number = (24*60*60)-(14*60*60)-(34*60)-42;
console.log("The remaining seconds of the day is: " + remainingSeconds);

// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented by these variables

console.log("");

let numberA: number = 24;
let out: number = 0;
if(numberA%2==0){
    ++out;
}

// if a is even increment out by one

console.log(out);
console.log("");

let numberB: number = 26;
let out2: string = '';

if(10 < numberB && numberB < 20){
out2 = "Sweet!";
}else if( numberB < 10){
    out2 = "Less!";
}else if(numberB > 20){
    out2 = "More!";
}
// if b is between 10 and 20 set out2 to "Sweet!"
// if less than 10 set out2 to "Less!",
// if more than 20 set out2 to "More!"

console.log(out2);
console.log("");

let numberC: number = 123;
let credits: number = 100;
let isBonus: boolean = false;

if(credits >= 50 && isBonus == false){
numberC -= 2;
} else if( credits < 50 && isBonus == false){
    numberC -= 1;
}else if(isBonus = true){
    numberC;
}

// if credits are at least 50,
// and is_bonus is false decrement c by 2
// if credits are smaller than 50,
// and is_bonus is false decrement c by 1
// if is_bonus is true c should remain the same

console.log(numberC);
console.log("");

let numberD: number =  10;
let time: number = 120;
let out3: string = '';

if(numberD%4 == 0 && time<=200){
    out3= "check";
}else if(time > 200){
    out3 = "Time out";
}else{
    out3 = "Run Forest Run!"
}

// if d is dividable by 4
// and time is not more than 200
// set out3 to "check"
// if time is more than 200
// set out3 to "Time out"
// otherwise set out3 to "Run Forest Run!"

console.log(out3);
console.log("");
// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

let mySentence : string = "I won\'t cheat on the exam!";

for(let i: number = 0; i < 100; i++){
    console.log(mySentence);
}

console.log("");
// Create a program that prints all the even numbers between 0 and 500

for(let i: number = 0; i < 500; i++){
    if(i%2 == 0){
        console.log(i);
    }
}

console.log("");
// Create a program that
// prints the multiplication table with number

let number: number = 15;

for(let i : number = 1; i <= 10; i++){
console.log(i + "*" + number + "=" + (i * 15));
}

console.log("");
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

for(let i : number = 1; i <= 100; i++){
    if((i%3 == 0) && (i%5 == 0)){
        console.log("FizzBuzz");
    }else if(i%5 == 0){
        console.log("Buzz");
    }else if(i%3 == 0){
        console.log("Fizz");
    }else{
        console.log(i);
    }
}

console.log("");
// Write a program that draws a triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as lineCount is

let lineCount: number = 7;
let asteriks : string = "*";

for(let i : number = 1; i <= lineCount; i++){
    console.log(asteriks);
    asteriks = asteriks + "*";
}

console.log("");
// Write a program that draws a square like this:
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as lineCount is

let numberOfLines : number = 6;
let percentage: string = "%";
let space : string = " ";

for(let i = 0; i < numberOfLines; i++){
    if((i == 0) || (i == numberOfLines - 1)){
        for(let j = 0; j < numberOfLines; j++){
            percentage = percentage + "%";
        }
        console.log(percentage);
        percentage = "%";
    }else {
        for(let j = 0; j < numberOfLines - 2; j++){
            space = space + " ";
        }
        console.log(percentage + space + percentage);
        space = " ";
    }
}

console.log("");
// Create a program that draws a chess table like this

let size : number = 8;
let output: string = "";

for(let i = 0; i < size; i++){
    for(let j = 0; j < size;j++){
       output += ( i + j) % 2 ? " " : "#";
        }
        output += "\n";
    }
console.log(output);

console.log("");
//  Create a function that takes two strings as a parameter
//  Returns the starting index where the second one is starting in the first one
//  Returns `-1` if the second string is not in the first one

let myTestSentence : string = "This is what I'm searching in";
let keyword : string = "searching";
let keyword2 : string = "not";

function substr(myTestSentence: string, keyword: string) : number {
    return myTestSentence.indexOf(keyword);
  }
  
 console.log(substr(myTestSentence,keyword));
 console.log(substr(myTestSentence,keyword2));
 







































