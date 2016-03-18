package inheritance;
import java.util.*;
import static java.lang.System.*;
class Employee {
private String name;
private double salary;
private Date hireDay;
private static int nextId = 1;
private int id;

public Employee() {

}

public Employee(String n, double s, int year, int month, int day) {
	name = n;
	salary = s;
	GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
	hireDay = calendar.getTime();
}

public String getName()
{
	return name;
}

public double getSalary()
{
	return salary;
}

public Date getHireDay() {
	return (Date) hireDay.clone();
}

public void raiseSalary(double byPrecent) {
	double raise = this.salary*byPrecent/100;
	this.salary += raise;
}

public void setId() {
	id = nextId;
	nextId++;
}

public int getId() {
	return id;
}

public static int getNextId() {
	return nextId;	
}
}
