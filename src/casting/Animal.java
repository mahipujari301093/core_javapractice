package casting;

public class Animal {
	
	
	public void eat()
	{
		
		System.out.println("Animal is eating");
		
	}

}



/*

Casting
│
├── Primitive Casting
│     │
│     ├── Widening / Implicit Casting
│     │      → Smaller datatype to bigger datatype
│     │      → Done automatically by Java
│     │
│     └── Narrowing / Explicit Casting
│            → Bigger datatype to smaller datatype
│            → Done manually using cast operator
│
└── Object Casting (Inheritance)
      │
      ├── Upcasting
      │      → Child object assigned to parent reference
      │      → Automatic
      │
      └── Downcasting
             → Parent reference converted back to child reference
             → Manual casting required

 */