 class Student {
    String name;
    int age;



student(String name,int age){
    this.name=name;
    this.name=age;
}

void display(){
    System.out.println("name: "+name+"age: "+age);
}

 }
public class this_{
    public static void main(string[] args){
        Student obj=new Student(name:"dhanush",age:20);
        obj.display();
    }
}