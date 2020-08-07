class University{
	void announcement(){
	  System.out.println("Exam date from August 20-2020");
		class Department{
			void examPapers(){
		  	System.out.println("Preparing exam question papers");
			}
		}
	Department cse = new Department();
	cse.examPapers();
	}
	
	
}

class InnerClassDemo{
public static void main(String args[]){
University jntu = new University();
jntu.announcement();

}
}

