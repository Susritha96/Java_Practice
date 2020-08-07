class University{
	void announcement(){
	  System.out.println("Exam date from August 20-2020");
	}
	class Department{
		void examPapers(){
		  System.out.println("Preparing exam question papers");
		}
	}
}

class InnerDemo{
public static void main(String args[]){
University jntu = new University();
jntu.announcement();
University.Department cse = jntu.new Department();
cse.examPapers();
}
}

