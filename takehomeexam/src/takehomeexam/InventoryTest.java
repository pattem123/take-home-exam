package takehomeexam;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class InventoryTest {
	
	private Inventory itemINV;
	
	private Inventory spyitemINV;
	
	private InventoryItem mockItem;
	

	@BeforeEach
	void setUp() throws Exception {
		
	itemINV = new Inventory();
	Inventory itemINV1 = new Inventory();
	spyitemINV = spy(itemINV1);
	mockItem = mock(InventoryItem.class);
		
	}

	@Test
	void test_addItem_To_Inventory() {
		
		when(mockItem.getWeight()).thenReturn(249);
		
		boolean expected_result = spyitemINV.addItemToInventory(mockItem);
		
		assertTrue(expected_result, "Item not available");
		
		assertEquals(1, spyitemINV.items.size(), "This item is not available in inventory");
		
		
	}
	
	@Test
	void test_dropInventory()
	{
		InventoryItem item1 =new InventoryItem("Laptop",249, "HP", 10);
		itemINV.addItemToInventory(item1);
		
		assertEquals(1,itemINV.items.size(), "There are no items in the inventory");
		
		boolean expected_result = itemINV.dropInventoryItem(item1);
		
		assertTrue(expected_result,"not find in the inventory");
		
	}
	
	@Test
	
	void test_TOstring()
	{
		InventoryItem item2 =new InventoryItem("Laptop",249,"Dell", 10);
		itemINV.addItemToInventory(item2);
		
		String expected = "Your inventory has:\n" + item2.toString();
		String actual = itemINV.toString();
		
		assertEquals(expected, actual, " is valid");
		
		
	}
	

}
