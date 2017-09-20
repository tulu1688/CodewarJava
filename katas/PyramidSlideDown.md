## (Pyramid Slide Down)[https://www.codewars.com/kata/551f23362ff852e2ab000037/java]

Pyramids are amazing! Both in architectural and mathematical sense. If you have a computer, you can mess with pyramids even if you are not in Egypt at the time. For example, let's consider the following problem. Imagine that you have a plane pyramid built of numbers, like this one here:

```
   /3/
  \7\ 4 
 2 \4\ 6 
8 5 \9\ 3
```

__Here comes the task...__

Let's say that the 'slide down' is a sum of consecutive numbers from the top to the bottom of the pyramid. As you can see, the longest 'slide down' is `3 + 7 + 4 + 9 = 23`

Your task is to write a function `longestSlideDown` (in ruby: `longest_slide_down`) that takes a pyramid representation as argument and returns its' __longest__ 'slide down'. For example,
```
longestSlideDown [[3], [7, 4], [2, 4, 6], [8, 5, 9, 3]] 
// => 23
```


