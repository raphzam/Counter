public class CounterDemo {
    public static void main(String[] args){

//        Counter c;
//        c = new Counter();
//        c.increment();
//        System.out.println(c.getCount());
//        c.increment(2);
//        System.out.println(c.getCount());
//        int temp = c.getCount();
//        System.out.println(temp);
//        c.reset();
//        System.out.println(c);
//        System.out.println(c.getCount());
//        Counter d = new Counter(5);
//        System.out.println(d.getCount());
//        Counter e = d;
//        System.out.println(e);
//        System.out.println(d);

        /*
        References variables c and d are both referring to the same object, thus changes made to the state of the object
        made by one are referenced by the other
         */

        Counter c = new Counter();
        Counter d = c;
        c.increment();
        System.out.println(c.getCount());
        System.out.println(d.getCount());
        c.increment(5);
        System.out.println(d.getCount());


    }

}
