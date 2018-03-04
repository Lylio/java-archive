

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }


    @Override
    public int compareTo(Person otherPerson) {
    	if(this.age < otherPerson.age) {
    		return -1;
    	} else if(this.age > otherPerson.age) {
    		return 1;
    	} else {
    		return 0;
    	}
	}

}
    
