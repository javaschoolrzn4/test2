package test2.q20;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Student {
    private Map<String, Integer> marksObtained = new HashMap<String, Integer>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    public void setMarksInSubject(String subject, Integer marks){
        // 1 INSERT CODE HERE
                    lock.writeLock().lock();
        try{
            marksObtained.put(subject, marks);
        }finally{
            // 2 INSERT CODE HERE
                        lock.writeLock().unlock();
        }
    }
    public double getAverageMarks(){
        // valid code that computes average
                    return 0;
    }
}

//    What should be inserted at //1 and //2?
//        Select 1 option:
//        A. lock.writeLock().acquire(); and lock.writeLock().release();
//       !B. lock.writeLock().lock(); and lock.writeLock().unlock();
//        C. lock.acquire(); and lock.release();
//        D. lock.readLock().lock(); and lock.readLock().unlock();
