package facadePattern.example;

public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public Mainframe(){
        memory = new Memory();
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
    }

    public void on(){
        try {
            memory.check();
            cpu.run();
            //int i = 1/0;
            hardDisk.read();
            os.load();
            System.out.println("开机成功！");
        }catch (Exception e){
            System.out.println("电脑出错！");
        }
    }
}
