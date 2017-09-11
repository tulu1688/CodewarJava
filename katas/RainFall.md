[Rainfall](https://www.codewars.com/kata/56a32dd6e4f4748cc3000006/train/java)

`data` and `data1` are two strings with rainfall records of a few cities for months from January to December. The records of towns are separated by `\n`. The name of each town is followed by `:`.

`data` and `towns` can be seen in "Your Test Cases:".

__Task:__

function: `mean(town, strng)` should return the average of rainfall for the city `town` and the `strng` `data` or `data1` (In R this function is called avg).
function: `variance(town, strng)` should return the variance of rainfall for the city town and the `strng` `data` or `data1`.

__Examples:__

```
mean("London", data), 51.19(9999999999996) 
variance("London", data), 57.42(833333333374)
```

__Notes:__

* if functions `mean` or `variance` have as parameter `town` a city which has no records return `-1`
* Don't truncate or round: the tests will pass if `abs(your_result - test_result) <= 1e-2` or `abs((your_result - test_result) / test_result) <= 1e-6` depending on the language.
* http://www.mathsisfun.com/data/standard-deviation.html
* `data` and `data1` are adapted from http://www.worldclimate.com
