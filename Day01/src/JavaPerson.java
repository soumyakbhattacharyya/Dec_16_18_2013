public class JavaPerson {
	private String name;
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public JavaPerson(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String work(int hours){
		return name + " works " + hours + " hours a day";
	}
}
