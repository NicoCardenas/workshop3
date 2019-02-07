
# workshop3

# Black List Search
## Part I - Introduction to threads in JAVA

[File of Start()](INTRODUCTION_BLACKLISTSEARCH/outputStart.txt) <br>
[File of Run()](INTRODUCTION_BLACKLISTSEARCH/outputRun.txt)

## Part II - Black List Search Exercise

[File of 60 threads](INTRODUCTION_BLACKLISTSEARCH%5Coutput60thread.txt)

## Part III - Discussion
> How could the implementation be modified to minimize the number of queries in these cases? <br>
> **Answer**: define a share variable that contains the number of occurrences, and do a conditional to verify when is the minimum value to stop all threads.

> What new element would this bring to the problem? <br>
> **Answer**: the conflict is that we have to ensure the integrity of the value in the variable. This is to guarantee that the value never is incorrect.

## Part IV - Performance Evaluation
![jVisualVM of a single thread](image/singleThread.png)
![jVisualVM of 4 threads](image/4Thread.png)
![jVisualVM of 8 threads](image/8Thread.png)
![jVisualVM of 50 threads](image/50Thread.png)
![jVisualVM of 100 threads](image/100Thread.png)
![Graph of threads](image/graph.png)

### Questions

#### Amdahl's law 
<a href="https://www.codecogs.com/eqnedit.php?latex=$$&space;S(n)&space;=&space;{1&space;\over&space;(1-P)&space;&plus;&space;{P&space;\over&space;n}}&space;$$" target="_blank"><img src="https://latex.codecogs.com/gif.latex?$$&space;S(n)&space;=&space;{1&space;\over&space;(1-P)&space;&plus;&space;{P&space;\over&space;n}}&space;$$" title="$$ S(n) = {1 \over (1-P) + {P \over n}} $$" /></a>

> Why is the best performance not achieved with the 500 threads? <br>
> **Answer**: Is because the number of threads are more than available numbers of cores in the machine and the change of thread in the possessor take time, in a bigger volume of thread it take a significant time.

> How is this performance compared when using 200 ?
> **Answer**: 200 have a better performance because the number of threads is more near to the ideal number of thread that have a best performance.

> How does the solution behave using as many processing threads as cores compared to the result of using twice as much? <br>
> **Answer**: the threads as twice the number of processing cores is better than as many processing threads as cores because the exchange time of threads have it matters more with more threads.

> Amdahl's law would apply better ? <br>
> **Answer**: Amdahl's law says that the more processes, the better performance your program has. 

> would it be improved? <br>
> **Answer**: it improved in a relative way.

# Snake Race

## Part 1

Control threads using wait/notify. <br>
Result: [Output File](PrimeFinder/output.txt)

## Part 2
Image of the game. <br>
![Image of the game](image/snakeGame.png)

## Part 3

2. [Answer File](SNAKE_RACE/ANSWER.txt) <br>
3. Critical regions: The methods of each snakes that answer when a snake is about to hit another object. **Solucion**: synchronize the methods.
