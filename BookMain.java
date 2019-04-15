
public class BookMain {


		public static void main(String[] args) {
			
			BookLibrarian librarian = new BookLibrarian();
			
			BookInformation book1 = new BookInformation(" Dan Brown","The Da Vinci Code", "2006", "An ingenious code hidden in the works of Leonardo da Vinci.A desperate race through the cathedrals and castles of Europe.An astonishing truth concealed for centuries . . . unveiled at last. ");
			librarian.AddBook(book1);
			
			BookInformation book2 = new BookInformation("Paula Hawkins","The Girl on the Train","2015","Rachel catches the same commuter train every morning. She knows it will wait at the same signal each time, overlooking a row of back gardens. She's even started to feel like she knows the people who live in one of the houses. 'Jess and Jason', she calls them.");
			librarian.AddBook(book2);
			
			BookInformation book3 = new BookInformation(" Gillian Flynn","Gone Girl","2014","One of the most critically acclaimed suspense writers of our time, New York Times bestseller Gillian Flynn takes that statement to its darkest place in this unputdownable masterpiece about a marriage gone terribly, terribly wrong.");
			librarian.AddBook(book3);
			
			BookInformation book4 = new BookInformation(" Dan Brown","The Lost Symbol","2009","In this stunning follow-up to the global phenomenon The Da Vinci Code, Dan Brown demonstrates once again why he is the world's most popular thriller writer. The Lost Symbol is a masterstroke of storytelling");
			librarian.AddBook(book4);
			
			BookInformation book5 = new BookInformation("JRR Tolkien","The Hobbit","1962","Bilbo Baggins, a respectable, well-to-do hobbit, lives comfortably in his hobbit hole until the day the wandering wizard Gandalf chooses him to take part in an adventure from which he may never return.");
			librarian.AddBook(book5);
			
			BookInformation book6 = new BookInformation("JDsalinger","The Catcher in the Rye","1895","With the author's death, the classic novel about young Holden Caulfield's disillusionment with the adult world and its \"phoniness\" will only rise in popularity — and controversy");
			librarian.AddBook(book6);
			
			BookInformation book7 = new BookInformation("JRR Tolkien","The Lord of the Rings","1993","Tolkien's seminal three-volume epic chronicles the War of the Ring, in which Frodo the hobbit and his companions set out to destroy the evil Ring of Power and restore peace to Middle-earth. ");
			librarian.AddBook(book7);
			
			BookInformation book8 = new BookInformation("Dan Brown","Digital Fortress","2004","When the National Security Agency's invincible code-breaking machine encounters a mysterious code it cannot break, the agency calls its head cryptographer, Susan Fletcher, a brilliant and beautiful mathematician.");
			librarian.AddBook(book8);
			
			BookInformation book9 = new BookInformation("Dan Brown","Inferno","2013","Harvard professor of symbology Robert Langdon awakens in an Italian hospital, disoriented and with no recollection of the past thirty-six hours, including the origin of the macabre object hidden in his belongings.");
			librarian.AddBook(book9);
			
			BookInformation book10 = new BookInformation("Markus Zusak","The Book Thief","1932","Trying to make sense of the horrors of World War II, Death relates the story of Liesel — a young German girl whose book-stealing and storytelling talents help sustain her family and the Jewish man they are hiding, as well as their neighbors.");
			librarian.AddBook(book10);
			
			BookInformation book11 = new BookInformation("Lios Lowry","The Giver series","1956","In the future, society has eliminated discord, converting everyone to \"Sameness.\"");
			librarian.AddBook(book11);
			
			BookInformation book12 = new BookInformation("Dogulas Adams","The Hitchhiker's Guide to the Galaxy series","2003","In this collection of novels, Arthur Dent is introduced to the galaxy at large when he is rescued by an alien friend seconds before Earth's destruction, and embarks on a series of amazing adventures, from the mattress swamps of Sqornshellous Zeta to the Restaurant at the End of the Universe.");
			librarian.AddBook(book12);
			
			BookInformation book13 = new BookInformation("SE Hinton","The Outsiders","2015","S.E. Hinton was just 16 years old when she wrote this novel about kids getting caught up in class struggles. ");
			librarian.AddBook(book13);
			
			BookInformation book14 = new BookInformation("LM montgomery","Anne of Green Gables series","1989","In this collection of eight novels by Lucy Maude Montgomery, Matthew and Marilla Cuthbert, a rather prim and elderly brother and sister pair, send away for an orphan boy to help them run their farm on Canada's Prince Edward Island.");
			librarian.AddBook(book14);
			
			BookInformation book15 = new BookInformation("philip pullman","His Dark Materials series","1963","In this hit series, young Lyra Belacqua tries to prevent kidnapped children from becoming the subject of gruesome experiments; helps Will Parry — a boy from another world — search for his father;");
			librarian.AddBook(book15);
			
			BookInformation book16 = new BookInformation("stephen chbosky","The Perks of Being a Wallflower","1954","In a thought-provoking, coming-of-age novel, teenager Charlie struggles to cope with the complex world of high school. ");
			librarian.AddBook(book16);
			
			BookInformation book17 = new BookInformation("william goldman","The Princess Bride","1996","This tale of a handsome farm boy who, aided by a drunken swordsman and a gentle giant, rescues a beautiful princess named Buttercup comes with a slyly humorous, metafictional edge");
			librarian.AddBook(book17);
			
			BookInformation book18 = new BookInformation("JRR Tolkien","The Hobbit","1962","Bilbo Baggins, a respectable, well-to-do hobbit, lives comfortably in his hobbit hole until the day the wandering wizard Gandalf chooses him to take part in an adventure from which he may never return.");
			librarian.AddBook(book18);
			
			BookInformation book19 = new BookInformation("vernicoroth","Divergent series","2014","In a future Chicago, 16-year-old Beatrice Prior must choose among five predetermined factions to define her identity for the rest of her life");
			librarian.AddBook(book19);
			
			BookInformation book20 = new BookInformation("john green","paper towns","2019","One month before graduating from his Central Florida high school, Quentin \"Q\" Jacobsen basks in the predictable boringness of his life, until the beautiful and exciting Margo Roth Spiegelman, Q's neighbor and classmate, takes him on a midnight adventure and then mysteriously disappears.");
			librarian.AddBook(book20);
			
			System.out.printf("Unsorted");
			librarian.printList();
			
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			System.out.println("Author Sorting");
			SortBook sort_data = new SortBook("Author");
			librarian.Set_Sortbook(sort_data);
			librarian.printList();
			
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			

			System.out.println("year of publish Sorting");
			SortBook sort_data2 = new SortBook("YearPublished");
			librarian.Set_Sortbook(sort_data2);
			librarian.printList();
			
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			

			System.out.println("Title Sorting");
			SortBook sort_data3 = new SortBook("Title");
			librarian.Set_Sortbook(sort_data3);
			librarian.printList();
			
			
	        
			
			
			

		}

	}

