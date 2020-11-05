import java.util.ArrayList;

class Sort {
    ArrayList<Number> list = new ArrayList<Number>();

    public Sort() {}
    public Sort(ArrayList<Number> list) {
        this.list = list;
    }
    public static void sort(ArrayList<Number> list) {
        if (list.size() == 0 || list == null)
            return ;
        for (int i = list.size()-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
                    int index = j;
                    Number m = list.get(j);
                    list.set(index, list.get(j+1));
                    list.set(j+1, m);
                }
            }
        }
    }
}

public class solution {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.list.add(199);
        s.list.add(89);
        s.list.add(90);
        s.list.add(1299);
        s.list.add(829);
        s.list.add(920);
        s.list.add(2.2);
        s.list.add(2.0);
//      s.sort(s.list);
        Sort.sort(s.list);
        for (Number tem: s.list) {
            System.out.println(tem);
        }
    }
}
