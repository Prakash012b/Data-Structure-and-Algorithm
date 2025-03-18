/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public class BloodTestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //initilizing the GUI 
         BloodTestGUI myBloodTestGUI = new BloodTestGUI();
        myBloodTestGUI.setVisible(true);
        
        
        
        //Demonstrating all funcationalities of BloodTestApp 
        //
        //Create scheduler instance to manage queue and priority queue
        //Scheduler scheduler = new Scheduler();
        //
        //Add people to the queue
        //
        //messageTA.append(" Adding people to the queue " );
        //scheduler.addPerson(new Person ("Alex Doe", "urgent", 35, "Dr. Michel", false));
        //scheduler.addPerson(new Person ("Adam Power", "medium", 45, "Dr. Gray", true));
        //scheduler.addPerson(new Person ("Filip Brown", "low", 55, "Dr. Miller", false));
        //scheduler.addPerson(new Person ("Charlie Green", "urgent", 50, "Dr. Wilson", true));
        //scheduler.addPerson(new Person ("Eva Black", "medium", 28, "Dr. Graham", false));
        //scheduler.addPerson(new Person ("Alice Smith", "low", 60, "Dr. Gerrad", true));
        
        //messageTA.append(" People added to the Queue.");
        
        
        
        
        
        
        
        //Display the queue
        //
        //messageTA.append(" View the current Queue. ");
        //messageTA.append(scheduler.viewQueue());
        /*
              
        Name: Alex Doe
        priority: urgent
        age: 35
        gpDetails: Dr. michel
        fromHospitalWard: false

        Name: Adam Power
        priority: low
        age: 45
        gpDetails: Dr. Gray
        fromHospitalWard: true

        Name: Filip Brown
        priority: medium
        age: 55
        gpDetails: Dr. Miller
        fromHospitalWard: false
        
        Name: Charlie Green
        priority: urgent
        age: 50
        gpDetails: Dr. Wilson
        fromHospitalWard: true


        Name: Eva Black
        priority: medium
        age: 28
        gpDetails: Dr. Graham
        fromHospitalWard: false

        Name: Kelly Purple
        priority: low
        age: 60
        gpDetails: Dr. Gerrad
        fromHospitalWard: true
        */
        
        
        
        

        
        
        
        
        
        
        //Get The next person in the queue
       // Person next = scheduler.getNextPerson();
        //if (next != null) {
       //     messageTA.setText("Next Person: " + next);
        //} else {
        //    messageTA.setText("No one in the queue.");
        //    updateQueueDisplay();  // Update the normal queue display
        //}
        /*
        Next Person: in the queue after analyzing according to priority, age and refer from hospital 
        Name: Charlie Green
        priority: urgent
        age: 50
        gpDetails: Dr. Wilson
        fromHospitalWard: true
        
        */
        
        
        
        
        
        
        
        
        
        //viewing the updated queue
        //messageTA.append(scheduler.viewQueue());
        /*
        Name: Alex Doe
        priority: urgent
        age: 35
        gpDetails: Dr. michel
        fromHospitalWard: false

        Name: Adam Power
        priority: low
        age: 45
        gpDetails: Dr. Gray
        fromHospitalWard: true

        Name: Filip Brown
        priority: medium
        age: 55
        gpDetails: Dr. Miller
        fromHospitalWard: false


        Name: Eva Black
        priority: medium
        age: 28
        gpDetails: Dr. Graham
        fromHospitalWard: false

        Name: Kelly Purple
        priority: low
        age: 60
        gpDetails: Dr. Gerrad
        fromHospitalWard: true
        */
       
        
        
        
        
                
         
        
        
        // Delete a person from the queue
        
        // Get name from text field
       // String nameToDelete = nameTF.getText().trim();
        // Get currently displayed person
       // String displayedPerson = messageTA.getText().replace("Next Person: ", "").trim();
        //
        //checks if the namefield is empty
       // if (!nameToDelete.isEmpty()) {
       //
       //if you delete these people details with just typing the name in nameTextField  these details will store in NotShownStack
       //String nameToDelete = "Alex Doe";
       //String nameToDelete = "Adam Power";
       //String nameToDelete = "Filip Brown";
       //String nameToDelete = "Eva Black";
       //String nameToDelete = "Alice Smith";
       //
        //calls the removedPerson method in scheduler to delete the person
       // boolean deleted = scheduler.removePerson(nameToDelete);
       //
       //checks if the person was sucessfully deleted
       // if (deleted) {
       //    messageTA.append(nameToDelete +  "  was removed and added to Not Shown stack. \n");
       // } else {
        //    messageTA.append("Error: Person not found in queue.");
        //    }
        // } 
        
        
        
        
        
        
        
        
        
        //Added the last deleted people on the NotShownUpStack
        //if you delete the last 5 people remaining on the queue
        //String notShownList = scheduler.viewNotShown();
        //
        //Displays a message in text area
        //messageTA.setText(notShownList);
        //messageTA.append(notShownList);
       
        /*
        Name: Alex Doe
        priority: urgent
        age: 35
        gpDetails: Dr. michel
        fromHospitalWard: false

        Name: Adam Power
        priority: low
        age: 45
        gpDetails: Dr. Gray
        fromHospitalWard: true

        Name: Filip Brown
        priority: medium
        age: 55
        gpDetails: Dr. Miller
        fromHospitalWard: false


        Name: Eva Black
        priority: medium
        age: 28
        gpDetails: Dr. Graham
        fromHospitalWard: false

        Name: Kelly Purple
        priority: low
        age: 60
        gpDetails: Dr. Gerrad
        fromHospitalWard: true
       */
        
        
    }
    
}
