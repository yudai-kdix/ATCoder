const input = require( "fs" ).readFileSync( "/dev/stdin", "utf8" )
let [a, b] = input.split("\n")
let inputX = b.split(" ").map(v => parseInt(v,10));
let P = 0;
let inputY = [];
 
for (let index = 0; index < a; index++) {
    inputY.push(0);
    inputY = inputY.map(x => x + Number(inputX[index]))
    let check = inputY;
    inputY = inputY.filter(x => x < 4)
    for (let index = 0; index < (check.length - inputY.length); index++) {
        P++;
    }
}
console.log(String(P));