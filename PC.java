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
		System.out.println("cpu���ٶȣ�"+cpu.speed);
		System.out.println("Ӳ�̵�������"+HD.amount);
	}
}

