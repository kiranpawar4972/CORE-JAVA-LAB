/*You are asked to store and display a student's name and age using encapsulation.
Task:
Create a class Student with two private variables: name and age.
Use public setName(), getName(), setAge(), and getAge() methods to access the variables.
Create an object of Student in the main method and display the student details.*/

package lab;

//Student.java
class Student 
{
 // Private variables (encapsulation)
 private String name;
 private int age;

 // Setter for name
 public void setName(String name) 
 {
     this.name = name;
 }

 // Getter for name
 public String getName() 
 {
     return name;
 }

 // Setter for age
 public void setAge(int age) 
 {
     if (age > 0) { // simple validation
         this.age = age;
  } else 
     {
         System.out.println("Age must be positive.");
     }
 }

 // Getter for age
 public int getAge() 
 {
     return age;
 }
 
}

//Main class
public class StudentMain 
{

	public static void main(String[] args) 
	{
	     // Create object of Student
	     Student s1 = new Student();

	     // Set values using setters
	     s1.setName("Kiran Pawar");
	     s1.setAge(22);

	     // Display values using getters
	     System.out.println("Student Name: " + s1.getName());
	     System.out.println("Student Age: " + s1.getAge());
	 }
}	

//Output: 
//Student Name: Kiran Pawar
//Student Age: 22
