/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public class Person implements Comparable<Person>{
    
    //Attributes of class person
    private String name;
    private String priority;
    private int age;
    private String gpDetails;
    private boolean fromHospitalWard;

   
    //Default constructor
    public Person(){

    }
    
    
    // overloaded Constructors to initilize a person object
    public Person(String name, String priority, int age, String gpDetails, boolean fromHospitalWard) {
        this.name = name;
        this.priority = priority;
        this.age = age;
        this.gpDetails = gpDetails;
        this.fromHospitalWard = fromHospitalWard;
    }
    
   //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }

    public void setFromHospitalWard(boolean fromHospitalWard) {
        this.fromHospitalWard = fromHospitalWard;
    }
    
    
    //Getters

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public int getAge() {
        return age;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public boolean isFromHospitalWard() {
        return fromHospitalWard;
    }
    
    
    //Compares two persons based on priority, age, and hospital status
    @Override
   public int compareTo(Person other) {
        // Compares the person on the priority levels
        int priorityOrder = getPriorityValue(this.priority) - getPriorityValue(other.priority);
        
        if (priorityOrder == 0) {
            // If priority is the same for any persons then it compares by age (older first)
            int ageComparison = Integer.compare(other.age, this.age);
            
            if (ageComparison == 0) {
                // If age is also the same for then it will prioritize hospital patients
                return Boolean.compare(other.fromHospitalWard, this.fromHospitalWard);
            }
            return ageComparison;
        }
        return priorityOrder;
    }

   //Converts the priority level to integer fro comparing
        private int getPriorityValue(String priority) {
          switch (priority.toLowerCase()) {
            case "urgent": return 1;
            case "medium": return 2;
            case "low": return 3;
            default: return Integer.MAX_VALUE; // If invalid then it will put the lowest priority
        }
          }

        
        //Returns the formatted string representation of the person
    @Override
    public String toString() {
        return " Name:" + name + "\n"+
                " priority:" + priority + "\n"+
                " age:" + age + "\n" +
                " gpDetails:" + gpDetails + "\n"+
                " fromHospitalWard: " + fromHospitalWard+ "\n";
    }
     
    
}
