/**
 * @author yangshunfan 2018/4/18 15:11
 */
public class GetNameThread extends Thread {
    private ThroughCave tcave;
    private String name;
    /**
     * 初始化线程的时候，获得回调类对象和人名
     */
    public GetNameThread(ThroughCave tcave, String name) {
        this.tcave = tcave;
        this.name = name;
    }
    @Override
    public void run() {
        //输出人名，模拟过山洞
        tcave.printName(name);
    }

}
