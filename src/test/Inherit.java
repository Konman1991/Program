package test;

/* Inheritance can be defined as the process 
 * where one class acquires the properties of another. 
 * With the use of inheritance the information is made 
 * manageable in a hierarchical order. The class which 
 * inherits the properties of other is known as subclass 
 * and the class whose properties are inherited is known 
 * as superclass. 
 * 
 * Benefits of using Inheritance:
 * Reusability
 * Extensibility
 * Data hiding
 * Overriding*/


public class Inherit {

		public static void n8() {
			
		    System.out.println("Ammo types for Handguns\n");
		    Glock felix = new Glock();
		    Colt1911 fido = new Colt1911();
		    DesertEagle rex = new DesertEagle();
		    HandGuns[] myGuns = { felix, fido, rex}; // polymorphism code
		    for (HandGuns anWeapon : myGuns) {
		      System.out.println(anWeapon.showGun());
		      anWeapon.ammo();
		    }
		  }
		}

		class HandGuns {

		  protected String gun;

		  public String showGun() {
		    return "Weapons";
		  }

		  public void ammo() {
		    System.out.println();
		  }
		}

		class Colt1911 extends HandGuns {

		  public Colt1911() {
			  gun = "Colt 1911";  //demonstrates inheritance
		  }

		  public String showGun() {
		    return "Colt 1911";
		  }

		  public void ammo() {
		    System.out.println(".45 ACP caliber\n");
		  }

		}

		class Glock extends HandGuns {

		  public Glock() {
		    gun = "Glock 22";
		  }

		  public String showGun() {
		    return gun;
		  }

		  public void ammo() {
		    System.out.println(".40 caliber\n");
		  }
		}
		
		class DesertEagle extends HandGuns {
			
			public DesertEagle() {
			    gun = "Desert Eagle";
			  }

			public String showGun() {
			    return gun;
			  }

			public void ammo() {
			    System.out.println(".50 caliber\n");
			  }
			}


	


