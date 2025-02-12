//sorting numbers in descending order
function sortNumbers(a, b, c) {
    let numbers = [a, b, c].sort((x, y) => y - x);
    console.log(numbers.join(','));
}
sortNumbers(0, -1, 4);
