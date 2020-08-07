class University{
	void announcement(){
	  System.out.println("Exam date from August 20-2020");
	  Department cse = new Department();
	  cse.examPapers();
	}
	class Department{
		void examPapers(){
		  System.out.println("Preparing exam question papers");
		}
	}
}

class InnerExample{
public static void main(String args[]){
University jntu = new University();
jntu.announcement();
}
}

