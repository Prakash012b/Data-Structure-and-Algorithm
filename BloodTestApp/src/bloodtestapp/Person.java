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
    
    private String name;
    private String priority;
    private int age;
    private String gpDetails;
    private boolean fromHospitalWard;

   
    public Person(){

    }
    
    
    //Constructors
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
    
    @Override
      public int compareTo(Person other) {
        int priorityOrder = getPriorityValue(this.priority) - getPriorityValue(other.priority);
        if (priorityOrder == 0) {
          return Integer.compare(other.age, this.age);
           }
        return priorityOrder;
      
    }

        private int getPriorityValue(String priority) {
          switch (priority.toLowerCase()) {
            case "urgent": return 1;
            case "medium": return 2;
            case "low": return 3;
            default: return Integer.MAX_VALUE;
        }
          }

    @Override
    public String toString() {
        return " Name :" + name + "\n"+
                " priority:" + priority + "\n"+
                "age:" + age + "\n" +
                " gpDetails:" + gpDetails + "\n"+
                " fromHospitalWard: " + fromHospitalWard;
    }
     
    
}
