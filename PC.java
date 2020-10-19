package text2;

public class PC {
	CPU cpu = new CPU();
	HardDisk HD = new HardDisk();
	 void setCPU(CPU c) {
		this.cpu = c;
	}
	public void setHardDisk(HardDisk h) {
		HD = h;
	}
    public void  show() {
		System.out.println("cpu的速度："+cpu.speed);
		System.out.println("硬盘的容量："+HD.amount);
	}
}

