package com.tnsif.dayone;

public class Encapsulationdemo {
	String playername;
	int jersyno;
	int orderno;

	@Override
	public String toString() {
		return "Encapsulationdemo [playername=" + playername + ", jersyno=" + jersyno + ", orderno=" + orderno + "]";
	}

	public static void main(String[] args) {
		Encapsulationdemo obj=new Encapsulationdemo();
		obj.setPlayername("Virat Kohli");
		obj.setJersyno(18);
		obj.setOrderno(1); 
		System.out.println(obj);

	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getJersyno() {
		return jersyno;
	}

	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

}
