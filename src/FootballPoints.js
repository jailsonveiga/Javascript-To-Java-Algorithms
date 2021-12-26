// Football Points
// https://edabit.com/challenge/wWsD84bEGZgWp6NN5

function footballPoints(wins, draws, losses) {
  let winsNum = wins * 3; // Wins get 3 points (multiply wins by 3) and assign the value to winsNum
  let drawsNum = draws * 1; // draws get 1 point (multiply wins by 1) and assign the value to drawsNum
  let wdlTotal = winsNum + drawsNum; // Add variable winsNum value and variable drawsNum value and assign the total value to wdlTotal variable
  return wdlTotal; // Return
}

console.log(
  " - Football team has obtained so far - " +
    footballPoints(3, 4, 2) +
    " - points"
);

console.log(
  " - Football team has obtained so far - " +
    footballPoints(5, 0, 2) +
    " - points"
);

console.log(
  " - Football team has obtained so far - " +
    footballPoints(0, 0, 1) +
    " - points"
);
