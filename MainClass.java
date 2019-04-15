
public class MainClass {
		public static void main(String[] args) {
			WorkManager manager = new WorkManager();
			Worker worker1 = new Worker(1);
			Worker worker2 = new Worker(2);
			Worker worker3 = new Worker(3);
			Worker worker4 = new Worker(4);
			manager.registerWorker(worker1);
			manager.registerWorker(worker2);
			manager.registerWorker(worker3);
			manager.registerWorker(worker4);
			
			WorkItem item1 = new WorkItem("2", 2, "Install the System");
			manager.notify(item1);
			
			WorkItem item3 = new WorkItem("4", 4, "Fix the network issues");
			manager.notify(item3);
			
			WorkItem item4 = new WorkItem("3", 3, "Installation of router");
			manager.notify(item4);
		}
	}
