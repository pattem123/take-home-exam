package takehomeexam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test_InventoryItem {

	private InventoryItem item;

	@BeforeEach
	void setUp() throws Exception {
		
		item =new InventoryItem("Laptop",249,"HP", 10);
		
	}
	
		@Test
		void test_getName() {
			String expected = "HP";
			String actual = item.getName();
			
			assertEquals(expected, actual, " name doesn't match ");
		}
		
		@Test
		void test_getType() {
			String expected = "Laptop";
			String actual = item.getType();
			
			assertEquals(expected, actual, " type doesn't " );
		}
		
		@Test
		void test_getWeight() {
			int expected = 249;
			int actual = item.getWeight();
			
			assertEquals(expected, actual, " weight doesn't match ");
		}
		
		@Test
		void test_getCount() {
			int expected = 10;
			int actual = item.getCount();
			
			assertEquals(expected, actual, " count doesn't match ");
		}
		
		@Test
		void test_toString() {
			String expected = "HP" + " type (" + "Laptop" + "), wt: " + 249 + ", there are " + 10 + " left";
			String actual = item.toString();
			
			assertEquals(expected, actual, " string doesn't match");
		}
	}

