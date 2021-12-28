// Convert Hours Into Seconds
// https://edabit.com/challenge/6AnQqiEjkJdZrWhPS

function howManySeconds(hours) {
  let hoursMinuteNum = 3600;
  return hours * hoursMinuteNum;
}

console.log(
  "Convert (2) Hours into Seconds? " + "is " + howManySeconds(2) + " Seconds"
);

console.log(
  "Convert (10) Hours into Seconds? " + "is " + howManySeconds(10) + " Seconds"
);

console.log(
  "Convert (24) Hours into Seconds? " + "is " + howManySeconds(24) + " Seconds"
);
