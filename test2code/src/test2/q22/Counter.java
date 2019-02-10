package test2.q22;

public class Counter{
    //1
    public void increment(){
        //2
    }
    //other valid code
}

//This class is supposed to keep an accurate count for the number of times the increment method is called. Several
//        classes share an instance of this class and call its increment method. What should be inserted at //1 and //2?
//        Select 1 option:
//        A. int count; at //1 and AtomicInteger.increment(count); at //2
//        B. synchronized int count; at //1 and count++ at //2
//        C. AtomicInteger count = 0; at //1 and count++; at //2
//        D. AtomicInteger count = new AtomicInteger(0); at //1 and count++; at //2
//       !E. AtomicInteger count = new AtomicInteger(0); at //1 and count.incrementAndGet(); at //2
