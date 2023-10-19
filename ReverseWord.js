const string="This is a sunny day";
console.log(string);

// Split the sentence into words
var words=string.split(" ");// Array with words
var reverseString="";

for(let i=0 ; i<words.length ; i++){

    var word =words[i];

     // Use split('') to split the word into an array of characters, reverse it, and then join it back
    var reverseWord = word.split("").reverse().join("");

    // Add the reversed words back into a sentence
    reverseString +=reverseWord+" ";

}
console.log(reverseString);// Output: "sihT si a ynnus yad"

    