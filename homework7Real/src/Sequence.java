public class Sequence {
    private int[] values;
    public Sequence(int size) { values = new int[size]; }
    public void set(int i, int n) { values[i] = n; }

    public int size() { return values.length; }
    public int get(int i) {
        if (i > this.size()-1){
            return 0;
        }
        else{
            return values[i];
        }
    }
    //Question E7.11
    public boolean equals(Sequence other){
        if (this.size() == other.size()){
            for (int i = 0; i <this.size(); i++){
                if (this.get(i) != other.get(i)){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    //Question  E7.12
    public boolean sameValues(Sequence other){
        boolean isIn = false;
        for (int i = 0; i < this.size(); i++){
            isIn = false;
            for (int j = 0; j < other.size(); j++){
                if (this.get(i) == other.get(j)){
                    isIn = true;
                    break;
                }
            }
            if (isIn != true){
                break;
            }
        }
        return isIn;
    }
    public Sequence sum(Sequence other){
        Sequence c;
        if (this.size()>other.size()){
            c = new Sequence(this.size());
        }
        else{
            c = new Sequence(other.size());
        }
        for (int j = 0; j < c.size(); j++){
            c.set(j, this.get(j) + other.get(j));
        }
        return c;
    }
    //E7.22
    public Sequence append(Sequence other){
        int size1 = this.size();
        int size2 = other.size();
        Sequence r = new Sequence(size1+size2);
        for (int i = 0; i<size1; i++){
            r.set(i, this.get(i));
        }
        for (int x = 0; x< size2; x++){
            r.set(x+size1, other.get(x));
        }
        return r;
    }
    //public void add(int i, int n){values[i+1] = n;}
    public Sequence merge(Sequence other){
        Sequence c = new Sequence(this.size()+other.size());
        int x = 0;
        for (int i = 0; i< c.size();){
            if (x<this.size()){
                c.set(i, this.get(x));
                i++;
            }
            if (x<other.size()){
                c.set(i, other.get(x));
            }
            i++;
            x++;
        }
        return c;
    }
    public Sequence mergeSorted(Sequence other){
        Sequence c = new Sequence(this.size()+other.size());
        int x = 0; int y = 0;
        for (int i = 0; i < c.size(); i++){
            if (x<this.size() && y>=other.size()){
                c.set(i, this.get(x));
                x++;

            }
            else if (x>=this.size() && y<other.size()){
                c.set(i, other.get(y));
                y++;

            }
            else if (this.get(x)>other.get(y)){
                c.set(i, other.get(y));
                y++;

            }
            else if (this.get(x)<other.get(y)){
                c.set(i, this.get(x));
                x++;

            }
            else if (this.get(x) == other.get(y)){
                c.set(i, this.get(x));
                x++;

            }
        }
        return c;
    }
}
