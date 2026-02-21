package collection;

public class ArrayExample {
	
	public static void main(String[]args)
	{
		
		String names [] = {"Vishal","Radhika","Janavi","Madhuri"};
		
		int size =  names.length;
		
		System.out.println(size);


		for(String n : names)
		{
			System.out.println(n);
		}

	}

}



/*

🔹 Advance for loop Syntax
for(datatype variableName : arrayOrCollection)
for(String n : names)

🔥 When to Use?
✔ When you only need to read data
✔ When you don’t care about index - Java controls index.

So Java:
1️⃣ Picks first element
2️⃣ Stores it in variable n
3️⃣ Executes loop body
4️⃣ Moves to next element
5️⃣ Stops automatically after last element

You don’t manage index manually.

Example mentally:
Iteration 1 → n = "Vishal"
Iteration 2 → n = "Radhika"
Iteration 3 → n = "Janavi"
Iteration 4 → n = "Madhuri"



 */