package com.footwear;
class HeadOffice{
	public void  headOfficeLocation() {
		System.out.println("the adidas head office is located in GERMANY");
	}
}
class RegionalHeadOffice1 extends HeadOffice{
	public void regionalHeadOfficeLocation() {
		System.out.println("the adidas regional head office1 is located in hyderabad");
		}
}
class RegionalHeadOffice2 extends HeadOffice{
	public void regionalHeadOfficeLocation() {
		System.out.println("the adidas regional head office2 is located in bangalore");
		}
}
class HydLocalStores1 extends RegionalHeadOffice1 {
	public void branchOfficeLocation() {
		System.out.println("the adidas hyderabad  localstore1 is located in vijayawada");
		}
}
class BnglLocalStores1 extends RegionalHeadOffice2 {
	public void branchOfficeLocation() {
		System.out.println("the adidas bangalore localstore1 is located in mysore");
		}
}

public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HydLocalStores1 hydstores=new HydLocalStores1();
		hydstores.headOfficeLocation();
		hydstores.regionalHeadOfficeLocation();
		hydstores.branchOfficeLocation();
		BnglLocalStores1 bnglstores=new BnglLocalStores1();
		bnglstores.headOfficeLocation();
		bnglstores.regionalHeadOfficeLocation();
		bnglstores.branchOfficeLocation();
	}

}
