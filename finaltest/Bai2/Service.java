import java.util.*;

public interface Service {
    public void addHoney(Honey h);

    public void delHoney(String id);

    public void editHoney(String id);

    public void showAll();

    public void addFavorite(Favorite f, String id);

    public List<Honey> sortedHoney();
}
