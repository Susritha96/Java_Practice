abstract class ClassRoom
{
	abstract void name(String name);
	void course(){
		System.out.println("Course name is JAVA");
	}
}
class Student extends ClassRoom
{
	void name(String name){
		System.out.println(name);
	}
}
class AbsOverriding{
	public static void main(String args[]){
		Student stu = new Student();
		stu.name("Susritha");
		stu.course();
	}
}