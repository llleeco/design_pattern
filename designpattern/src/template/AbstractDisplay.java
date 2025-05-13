package template;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //메서드에 final - 자식이 override 못함
    public final void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
}
