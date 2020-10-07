package pack1;

public class PC {
	CPU cpu;
	CPU p;
    HardDisk HD;
    void setCPU(CPU c){
        this.cpu = c;
    }
    void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    void show(){
        System.out.println("CPU速度："+cpu.getSpeed());
        System.out.println("硬盘容量："+HD.getAmount());
        System.out.println("CPU温度："+cpu.gettem());
        System.out.println("硬盘的品牌："+HD.getBrand());
    }
}


