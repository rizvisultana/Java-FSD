package constructors;

public class Employee {

	    int empId;
		String empName;
		String department;
		float salary;

		//default constructor
		public Employee() {
			empId=1;
			empName="Emp001";
			department="finance";
			salary=35000;
		}

		//parametrized constructor
		public Employee(int empId,String empName,String department,float salary) {
			this.empId=empId;
			this.empName=empName;
			this.department=department;
			this.salary=salary;
		}

		public void display() {
			System.out.println("Id: "+empId);
			System.out.println("Name: "+empName);
			System.out.println("Department: "+department);
			System.out.println("Salary: "+salary);
			System.out.println();

		}

		public static void main(String[] args) {

			Employee e= new Employee();
			Employee e1= new Employee(12, "Rizvi Sultana", "Training", 30000);
			Employee e2= new Employee(12, "Sai Sharan", "Training", 30000); 


			//calling default constructor
			e.display();
			//parametrized constructor
			e1.display();
			e2.display();



		}


	}

	

