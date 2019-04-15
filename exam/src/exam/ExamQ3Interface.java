package exam;
import java.util.ArrayList;
import java.util.List;

public class ExamQ3Interface {
	public static void main(String []args) 
	{
		Cookie oatcookie = new Cookie();
		Cookie chipcookie = new Cookie();
		Cookie buttercookie = new Cookie();
		CinnamonRoll peanutcinnamonroll = new CinnamonRoll();
		CinnamonRoll potatocinnamonroll = new CinnamonRoll();
		CinnamonRoll noyeastcinnamonroll = new CinnamonRoll();
		Brownie bakedbrownie = new Brownie();
		Brownie cheesebrownie = new Brownie();
		Brownie peanutbrownie = new Brownie();
		List<BakedGoods> bakedgoods= new ArrayList<BakedGoods>();
		bakedgoods.add(oatcookie);
		bakedgoods.add(chipcookie);
		bakedgoods.add(buttercookie);
		bakedgoods.add(peanutcinnamonroll);
		bakedgoods.add(potatocinnamonroll);
		bakedgoods.add(noyeastcinnamonroll);
		bakedgoods.add(bakedbrownie);
		bakedgoods.add(cheesebrownie);
		bakedgoods.add(peanutbrownie);
		oatcookie.setPrice(2);
		oatcookie.setDesc("Cookie - made of oats");
		oatcookie.setSellByDate("26-apr-2019");
		chipcookie.setPrice(4);
		chipcookie.setDesc("Cookie - made of chips");
		chipcookie.setSellByDate("26-apr-2019");
		buttercookie.setPrice(8);
		buttercookie.setDesc("Cookie - made with butter");
		buttercookie.setSellByDate("26-apr-2019");
		peanutcinnamonroll.setPrice(2);
		peanutcinnamonroll.setDesc("CinnamonRoll - made with peanuts");
		peanutcinnamonroll.setSellByDate("26-apr-2019");
		potatocinnamonroll.setPrice(4);
		potatocinnamonroll.setDesc("CinnamonRoll - made with potato");
		potatocinnamonroll.setSellByDate("26-apr-2019");
		noyeastcinnamonroll.setPrice(8);
		noyeastcinnamonroll.setDesc("CinnamonRoll - without yeast");
		noyeastcinnamonroll.setSellByDate("26-apr-2019");
		bakedbrownie.setPrice(2);
		bakedbrownie.setDesc("Browine - made by baking");
		bakedbrownie.setSellByDate("26-apr-2019");
		cheesebrownie.setPrice(4);
		cheesebrownie.setDesc("Brownie - made with cheese");
		cheesebrownie.setSellByDate("26-apr-2019");
		peanutbrownie.setPrice(8);
		peanutbrownie.setDesc("Brownie - made with peanuts");
		peanutbrownie.setSellByDate("26-apr-2019");

		for(BakedGoods bg :bakedgoods)
		{
			System.out.println("----------------------------------------------------------------------------");
			System.out.printf("The Price is %d dollors \n",bg.getPrice());
			System.out.println("The Description:  " + bg.getDescription());
			System.out.println("The SellByDate:  " + bg.getSellByDate());
		}
		
	}
}