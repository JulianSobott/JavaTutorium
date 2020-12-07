import java.util.ArrayList;
import java.util.List;

public class ListImpl1 implements ListInterface2{

    private List<Integer> list = new ArrayList<>();

    @Override
    public boolean put(int x) {
        return list.add(x);
    }

    @Override
    public int get() {
        if (list.size() == 0) {
            return -1;
        }
        return list.get(0);
    }

    @Override
    public int get(int i) {
        if (i + 1 > list.size() || i < 0) {
            return -1;
        }
        return list.get(i);
    }

    @Override
    public boolean remove(int i) {
        if (i + 1 > list.size() || i < 0) {
            return false;
        }
        list.remove(i);
        return true;
    }
}
