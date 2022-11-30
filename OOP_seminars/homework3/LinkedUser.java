package homework3;

import java.util.Iterator;

public class LinkedUser<User> implements Iterable<User> {
    User user;
    LinkedUser<User> next;
    LinkedUser<User> first;
    LinkedUser<User> last;


    public void add (User usr){
        LinkedUser<User> l=new LinkedUser<>();
        l.user=usr;
        if (first==null){
            first=l;
            last=l;
        }
        else{
            last.next=l;
            last=l;
        }  
        }


    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            LinkedUser<User> current=first;

            @Override
            public boolean hasNext() {
                
                return current!=null;
            }

            @Override
            public User next() {
                User user=current.user;
                current=current.next;
                return user;
            }

        };
    }
    
}
