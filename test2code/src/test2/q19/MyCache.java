package test2.q19;

import java.util.Iterator; // +
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class MyCache {
    private CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();
    public void addData(List<String> list){
        cal.addAll(list);
    }
    public Iterator getIterator(){
        return cal.iterator();
    }
}

//    Given that one thread calls the addData method on an instance of the above class and another thread calls the
//        getIterator method on the same instance at the same time and starts iterating through its values, which of the
//        following options are correct?
//        (Assume that no other calls have been made on the MyCache instance.)
//        Select 1 option:
//        A. The call to addAll may be blocked while the other thread is iterating through the iterator.
//       !B. Both the threads will complete their operations successfully without getting any exception.
//        C. The thread iterating through the Iterator will get a ConcurrentModificationException.
//        D. Elements added by the addAll method will automatically be visible through the iterator in the other thread.