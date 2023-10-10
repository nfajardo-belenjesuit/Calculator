class Main {
	public static void main(String[] args) {
	    int[] nums = {4, 6, 8, 3, 32, 5, 7, 8};
		System.out.println(subtract(nums));
		System.out.println(add(nums));
		System.out.println(multiply(nums));
		System.out.println(divide(nums));
	}

	public void systemCheck(){
		System.out.println("System online");
	}

	public int subtract(int[] a){
		int total = 0;
		for(int num : a){
			total -= num;
		}

  public int divide(int[] b){
    int total = 0;
    for(int num : b){
      total /= num;
    }
  }
		return total;
	}
	public int add(int[] a){
		int total = 0;
		for(int num : a){
			total += num;
		}
		return total;


    public int multi(int[] a){
        int total = 0;
        for(int num: a){
            total *= num
        }
        return total;
	}
}