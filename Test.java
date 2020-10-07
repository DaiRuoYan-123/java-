package pack1;

public class Test {
	public static void main(String args[]){
		CPU cpu = new CPU();
        HardDisk HD = new HardDisk();
        cpu.setSpeed(2200);
        cpu.settem(50);
        HD.setamount(200);
        HD.brand="Lenovo";
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }

}
