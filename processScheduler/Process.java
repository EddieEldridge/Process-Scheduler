package processScheduler;

public class Process {
	
		// Variables
		private String processName;
		private int burstTime;
		private int waitTime;
		
		// Constructor
		public Process(String processName, int burstTime, int waitTime)
		{
			this.processName=processName;
			this.burstTime=burstTime;
			this.waitTime=waitTime;
		}
		
		// Getters and Setters for above variables
		public String getProcessName() {
			return processName;
		}
		public void setProcessName(String processName) {
			this.processName = processName;
		}
		public int getBurstTime() {
			return burstTime;
		}
		public void setBurstTime(int burstTime) {
			this.burstTime = burstTime;
		}
		public int getWaitTime() {
			return waitTime;
		}
		public void setWaitTime(int waitTime) {
			this.waitTime = waitTime;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		
		
		
		
}
