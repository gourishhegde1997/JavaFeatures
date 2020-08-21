package javafeatures.generics;

import java.util.ArrayList;
import java.util.List;

class Record2<E>
{
	List<E> record =new ArrayList<>();
    
    @Override
	public String toString() {
		return "Record [record=" + record + "]";
	}
	public void add(E e)
    {	
    	record.add(e);
    }
    public void display(Record2<? extends Student2> record) {
    	System.out.println("student record:"+record);
}
}

class Student2
{
    int id;
    String name;
    
    public Student2(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    public String toString()
    {
        return "Id = "+id+" Name = "+name;
    }
}

class Dayscholar extends Student2
{
    float stipend;
    
    public Dayscholar(int id,String name,float stipend)
    {
        super(id,name);
        this.stipend=stipend;
    }
    public String toString()
    {
        return "Id = "+id+" Name = "+name+" Stipend = "+stipend;
    }
}

class WildcardsDemo
{   
    public static void main(String args[])
    {
    Record2<Student2> studentrecord = new Record2<>();
    Student2 student = new Student2(101,"Adam");
    
    Record2<Dayscholar> dayscholaarecord = new Record2<>();
    Dayscholar dayscholar = new Dayscholar(102,"Robert",10000f);
    
    studentrecord.add(student);
    studentrecord.display(studentrecord);
    
    dayscholaarecord.add(dayscholar);
    dayscholaarecord.display(dayscholaarecord);
    }
}


