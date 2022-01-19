// Is the Number Even or Odd?
// https://edabit.com/challenge/kuzB5CMXiKDEYKXAP

function isEvenOrOdd(num) {
  if (num % 2 == 0) {
    return "even";
  } else {
    return "odd";
  }
}

console.log("Is the number even or odd (3) -> " + isEvenOrOdd(3));
console.log("Is the number even or odd (126) -> " + isEvenOrOdd(126));
console.log("Is the number even or odd (19) -> " + isEvenOrOdd(19));
console.log("Is the number even or odd (1) -> " + isEvenOrOdd(1));
