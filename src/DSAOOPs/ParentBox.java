package DSAOOPs;

public class ParentBox {
    int h = 5;
    int w = 15;
    int l = 25;
    public ParentBox() {

    }
    public int getH () {
        return h;
    }

    public void setH ( int h){
        this.h = h;
    }

    public int getW () {
        return w;
    }

    public void setW ( int w){
        this.w = w;
    }


    public int getL () {
        return l;
    }

    public void setL ( int l){
        this.l = l;
    }

    public ParentBox( int h, int w, int l){
        this.h = h;
        this.w = w;
        this.l = l;
        System.out.println("h, w and l are: " + h + "  " + w + "  " + l);
    }
    public static void main(String[] args) {

        ParentBox box = new ParentBox();
        System.out.println("box is: "+ box.h +"   "+ box.l+"  "+box.w);
        ChildBoxWeight child=new ChildBoxWeight();
        System.out.println("child box is: "+ child.h +"   "+ child.l+"  "
                +child.w +  "  "+child.weight);


    }

}
