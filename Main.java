class Main {
	public static void main(String[] args) {
	    
	}

	public void systemCheck(){
		System.out.println("System online");
	}

	public int subtract(int[] a){
		int total = 0;
		for(int num : a){
			total -= num;
		}
		return total;
	}
}