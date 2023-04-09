import java.util.ArrayList;
import java.util.List;

public class Division implements Entities {
    private String name;
    private List<Entities> children;

    public Division(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }
    public void add(Entities entity){
        children.add(entity);
    }
    public Entities getChild(int index){
        return children.get(index);
    }
    public int getSize(){
        int sum = 0;
        for (Entities entity : children){
            sum += entity.getSize();
        }
        return sum;
    }

}
