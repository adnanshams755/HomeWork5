package oop.abstraction;



public abstract class SubcontinentIndustry implements GarmentsIndustry {
	
public static String gradeOfIndustry;
	
	public SubcontinentIndustry() {};
	public  SubcontinentIndustry(String gradeOfIndustry) {
		this.gradeOfIndustry = gradeOfIndustry;
		}

	
	
	public abstract void medicineIndustry();
	
	public void electircIndustry() {
		System.out.println("These countries make electronics "+GarmentsIndustry.numberOfIndustry );
	}
		public void madeInBangladesh() {
			System.out.println("Bangladesh make Garments");
		
	}  
		public void madeInIndia() {
		System.out.println("India make Garments");
	}

}
