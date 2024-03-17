class Main {
  public static void doctorRating(Doctor[] doctors) {
		double sum=0;
		int count=0;
		int r;
		for(int i=0;i<doctors.length;i++) {
			System.out.println("enter your rate ");
			r=input.nextInt();
			while(r!=-1) {
				sum+=r;
				count++;
				System.out.println("enter your rate ");
				r=input.nextInt();
			}
			doctors[i].setRate(sum/count);
		}
	}
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
