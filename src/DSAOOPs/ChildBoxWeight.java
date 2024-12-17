package DSAOOPs;

public class ChildBoxWeight extends ParentBox{

    public ChildBoxWeight() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ChildBoxWeight(int weight) {
        super();
        this.weight = weight;
    }

    int weight =35;
    public ChildBoxWeight(int h, int w, int l, int weight) {
        super(h, w, l);
        this.weight=weight;
    }
}
