# workshop3

## Part III - Discussion
> How could the implementation be modified to minimize the number of queries in these cases?
> Answer: define a share variable that contains the number of occurrences, and do a conditional to verify when is the minimum value to stop all threads
> What new element would this bring to the problem?
> Answer: the conflict is that we have to ensure the integrity of the value in the variable. This is to guarantee that the value never is incorrect.
