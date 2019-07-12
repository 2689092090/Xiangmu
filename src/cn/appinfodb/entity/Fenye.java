package cn.appinfodb.entity;

public class Fenye {
    private int ye = 1;
    
    private int zongshu;
	
	private int zongye;

	public int getZongshu() {
		return zongshu;
	}

	public void setZongshu(int zongshu) {
		this.zongshu = zongshu;
		this.zongye = zongshu%5==0?zongshu/5:zongshu/5+1;
	}
	public int getYe() {
		return ye;
	}

	public void setYe(int ye) {
		this.ye = ye;
	}

	public int getZongye() {
		return zongye;
	}

	public void setZongye(int zongye) {
		this.zongye = zongye;
	}

	public Fenye(int zongshu, int ye, int zongye) {
		super();
		this.zongshu = zongshu;
		this.ye = ye;
		this.zongye = zongye;
	}

	public Fenye() {
		super();
		// TODO Auto-generated constructor stub
	}
}
