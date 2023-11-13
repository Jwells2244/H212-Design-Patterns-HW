public class sequenceTester {
    public static void main(String[] args){
        Sequence a = new Sequence(3);
        a.set(0, 3);
        a.set(1, 2);
        a.set(2, 1);
        Sequence b = new Sequence(3);
        b.set(0, 3);
        b.set(1, 2);
        b.set(2, 1);
        Sequence c = new Sequence(3);
        c.set(0, 1);
        c.set(1, 2);
        c.set(2, 3);
        Sequence d = new Sequence(4);
        d.set(0, 6);
        d.set(1, 8);
        d.set(2, 3);
        d.set(3, 1);
        //System.out.println(a.equals(b));
        //System.out.println(a.equals(c));
        //Testing sameValues
        //System.out.println(a.sameValues(b));
        //System.out.println(a.sameValues(c));
        //System.out.println(a.sameValues(d));
        //Testing sum
        //Sequence f = a.sum(d);
        //for (int i = 0; i < f.size(); i++){
          //  System.out.println(f.get(i));
        //}
        //Sequence g = f.sum(d);
        //for (int x = 0; x < g.size(); x++){
            //System.out.println(g.get(x));
        //}
//        Sequence g = a.append(b);
//        for (int x = 0; x<a.size()+b.size(); x++){
//            System.out.println(g.get(x));
//        }
//        Sequence x = a.merge(b);
//        for (int f = 0; f<a.size()+b.size(); f++){
//            System.out.println(x.get(f));
//        }
        Sequence q = new Sequence(3);
        q.set(0, 7);
        q.set(1, 8);
        q.set(2, 9);
        Sequence g = q.mergeSorted(c);
        for (int f = 0; f<g.size(); f++){
            System.out.println(g.get(f));
        }
    }
}