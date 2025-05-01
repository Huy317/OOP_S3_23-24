import java.util.HashMap;

public class CDManager {
    //ArrayList<CD> list = new ArrayList<>();
    private HashMap<String,CD> map = new HashMap<>();

    public CDManager(){
    }
    public boolean addCD(CD cd){
        if (map.get(cd.getId())!=null){
            return false;
        }
        map.put(cd.getId(), cd);
        return true;
    }
}
