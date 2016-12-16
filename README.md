#Lab Works 2-17

2-17-1

1. Create a class MyTimeBomb which extends the Thread class. 
2. Override the run() method of Thread. This is where the code will go that will 
output to console the numbers from 10 to 0 and after that prints “Boom!!!”. 
3. Use the static method Thread.sleep() to pause for one second. 
(Remember, the one-arg version of sleep() specifies the amount of time of sleep 
in milliseconds.) 
4. Create a class Main with a main() method. Add to method main() code that 
declares local variable bomb1 of MyTimeBomb type, and create instance of MyTimeBomb. 
Add code to invoke start() method. 5. Execute the program.

```java
package com.brainacad.oop.testthread1._2_17_1;

public class MyTimeBomb extends Thread {

    @Override
    public void run() {
        for(int i = 10; i >= 0; --i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            System.out.println(i == 0 ? "BOOM!" : i);
        }

    }
}
```

2-17-2

1. Rewrite the MyTimeBomb class to implement the Runnable interface. 
2. Override the run() method. This is where the code will go that will output 
to console the numbers from 10 to 0 and after that prints “Boom!!!” . 
3. Use the static method Thread.sleep() to pause for one second. 
(Remember, the one-arg version of sleep() specifies the amount of time of sleep 
in milliseconds.) 
4. Create a class Main with a main() method. Add to method main() code that 
declares local variable bomb1 of MyTimeBomb type, and create instance of 
MyTimeBomb. Add code to execute MyTimeBomb in new thread (Using the Thread class). 
5. Execute the program.

```java
package com.brainacad.oop.testthread1._2_17_2;

public class MyTimeBomb implements Runnable {

    @Override
    public void run() {
        for(int i = 10; i >= 0; --i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            System.out.println(i == 0 ? "BOOM!" : i);
        }

    }

}

```
2-17-3

