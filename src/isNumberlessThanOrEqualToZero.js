// Is The Number Less Than Or Equal To Zero
// https://edabit.com/challenge/PTiLYyb4A69KZtBCg

function lessThanOrEqualToZero(num) {
  if (num <= 0) {
    return true;
  } else {
    return false;
  }
}

console.log(
  "Return (True) If (5) Is Less Than Or Equal To (0) Otherwise Return False - Answer: " +
    lessThanOrEqualToZero(5)
);

console.log(
  "Return (True) If (0) Is Less Than Or Equal To (0) Otherwise Return False - Answer: " +
    lessThanOrEqualToZero(0)
);

console.log(
  "Return (True) If (-2) Is Less Than Or Equal To (0) Otherwise Return False - Answer: " +
    lessThanOrEqualToZero(-2)
);
