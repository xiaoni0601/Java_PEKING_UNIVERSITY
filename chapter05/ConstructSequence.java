class ConstructSequence 
{
	public static void main(String[] args){ 
		Person p = new Student("小王", 18, "武汉大学");
	}
}

class Person
{
	String name="未命名";  //step 2
	int age=-1;
	Person( String name, int age ){
		super(); //step 1
		//step 3
		//开始构造Person(),此时this.name=未命名,this.age=-1
		System.out.println( "开始构造Person(),此时this.name="+this.name+",this.age="+this.age );
		this.name=name; this.age=age;
		//Person()构造完成,此时this.name=小王,this.age=18
		System.out.println( "Person()构造完成,此时this.name="+this.name+",this.age="+this.age );
	}
}

class Student extends Person
{
	String school="未定学校"; //step2
	Student( String name, int age, String school ){
		super( name, age );  //step 1
		//step 3
		//开始构造Student()，此时this.name=小王,this.age=18,this.school=未定学校
		System.out.println( "开始构造Student()，此时this.name="+this.name+",this.age="+this.age+",this.school="+this.school );
		this.school = school;
		//Student()构造完成，此时this.name=小王,this.age=18,this.school=武汉大学
		System.out.println( "Student()构造完成，此时this.name="+this.name+",this.age="+this.age+",this.school="+this.school );
	}
}

