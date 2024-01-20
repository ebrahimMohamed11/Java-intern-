/*
Aggregation is a “has-a” relationship between classes,
 where one class (the whole) has a reference to another class (the part).
  Unlike composition, the part objects in an aggregation have an independent
   existence and can exist outside the whole.

   Consider a University class that aggregates Department objects.
    Each Department can exist independently,
     and they can be associated with different universities.
 */


public class mainClass {
    public static void main(String [] args){
        Department CS= new Department();
        University uni = new University();
        uni.addDepartment(CS);


    }
}
