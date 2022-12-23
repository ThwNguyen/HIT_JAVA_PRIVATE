import java.util.ArrayList;

public class Zoo {
    ArrayList<Cage> CageList = new ArrayList<>();

    public void insertCage(Cage c) {
        CageList.add(c);
    }

    public void delCage(int id) {
        for (int i = 0; i < CageList.size(); i++)
            if (id == CageList.get(i).getId())
                CageList.remove(CageList.get(i));
    }
}
