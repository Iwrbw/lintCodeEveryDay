/**
 * @author yangshunfan 2018/4/18 15:11
 */
public final class ThroughCave {
    private String[] name;

    private ThroughCave() {
        //在构造方法中初始化一个包含10个人名的String数组
        this.name = new String[]{"张三", "李四", "王五", "马六", "牛七", "王八", "小明", "小红", "小花", "小雷"};
    }

    /**
     * 输出人名的方法，同步化synchronized
     * @param name：出去人的名字
     */
    public synchronized void printName(String name) {
        //延迟5s，模拟过山洞的时间为5s
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name);
    }
    /**
     * 将10个人名分给10个线程，模拟10个人
     */
    private void sendAllNames() {
        for (String aName : name) {
            GetNameThread gt = new GetNameThread(this, aName);
            gt.start();

        }
    }

    public static void main(String[] args)  {
        ThroughCave tc = new ThroughCave();
        tc.sendAllNames();
    }
}
