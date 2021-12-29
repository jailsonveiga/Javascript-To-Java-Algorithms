// Find The Perimeter Of a Rectangle
// https://edabit.com/challenge/XnJ24rWW7iJkNrtsh

function findPerimeter(length, width) {
  let lengthWidthTotal = length + width; // Add length and width and the total value assign to a lengthWidthTotal variable name

  return lengthWidthTotal * 2; // multiply the value of lengthWidthTotal variable name by 2
}

console.log(
  "Find The Perimeter Of a Rectangle (6 in length and 7 in width) " +
    "is " +
    findPerimeter(6, 7)
);

console.log(
  "Find The Perimeter Of a Rectangle (20 in length and 10 in width) " +
    "is " +
    findPerimeter(20, 10)
);

console.log(
  "Find The Perimeter Of a Rectangle (2 in length and 9 in width) " +
    "is " +
    findPerimeter(2, 9)
);
