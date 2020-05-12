1. finally语句总是要执行的，当finally语句中也有return时，会覆盖try/catch语句块的return。
2. 若 catch 块中有 throw 语句，则，try、catch、finally 块之外的代码不执行；否则执行。（即异常没有被处理，则不执行；否则执行）
3. try 块中有异常，则异常下面的代码不执行。