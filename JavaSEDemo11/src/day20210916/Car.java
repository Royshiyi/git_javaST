package day20210916;

public class Car {
    protected String name;
    protected Trie trie;
    protected Engine engine;
    public void Start(){
        engine.Start();
    }
    public void Stop(){
        engine.Stop();
    }

    //.....
}
