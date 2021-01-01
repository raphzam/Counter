public class CounterDemo {
    public static void main(String[] args){
        Counter c;
        c = new Counter();
        c.increment();
        System.out.println(c.getCount());
        c.increment(2);
        System.out.println(c.getCount());
        int temp = c.getCount();
        System.out.println(temp);
        c.reset();
        System.out.println(c);
        System.out.println(c.getCount());
        Counter d = new Counter(5);
        System.out.println(d.getCount());
        Counter e = d;
        System.out.println(e);
        System.out.println(d);
    }

}
