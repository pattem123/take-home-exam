package exam;

public class Cookie implements BakedGoods {
	
	int price;
	String desc;
	String sellbydate;
	
	public void setPrice(int pric) {
		this.price = pric;
	}
	public void setDesc(String des) {
		this.desc = des;
	}
	public void setSellByDate(String selldate) {
		this.sellbydate = selldate;
	}
	

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return desc;
	}

	@Override
	public String getSellByDate() {
		// TODO Auto-generated method stub
		return sellbydate;
	}
}
