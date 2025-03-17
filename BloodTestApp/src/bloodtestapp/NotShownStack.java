/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestapp;

import java.util.ArrayList;
/**
 *
 * @author pyaku
 */
public class NotShownStack implements StackInterface{

     ArrayList<Person> stack;

    private static final int MAX_NO_SHOWS = 5; // Limit to last 5 no-shows
    
    //Constructor to initialize the stack
    public NotShownStack() {
        stack = new ArrayList<>();
    }

    //Adds a person to the top of the stack
    @Override
    public void push(Person p) {
        if (stack.size() >= MAX_NO_SHOWS) {
            stack.remove(0); //Removes the oldest no-show to maintain size
        }
        stack.add(p);
    }



    //Removes and returns the person at the top of the stack
    @Override
    public Person pop() {
        if (isEmpty()) {
            return null; //Returns null if the stack is empty
        }
        return stack.remove(stack.size() -1); //Remove and return the last element (top of the stack)
    }
    
    //Returns the person at the top of the stack without removing them
    @Override
    public Person peek() {
        if (isEmpty()) {
            return null; //Returns null if the stack is empty
        }
        return stack.get(stack.size() -1); //Return thr last element (top of the stack)
    }

    //Checks if the stack is empty
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    //return the number of people in the stack as a size
    @Override
    public int size() {
        return stack.size();
    }

    
    
    
    
  
    @Override
    public String viewNotShown() {
            if (stack.isEmpty()) {
           return "No recent people No- shows." ;
        }
            
            //Use of stringBuilder to construct the stack output string efficiently
            StringBuilder sb = new StringBuilder("Last 5 No- Shows: \n");
            
            //Loop through th stack and append each person's details
            for (Person p : stack) {
                sb.append(p.toString()).append("\n"); //calls person's to String
            }
            
            //To return the final stack representation as a string
            return sb.toString();
    } 
}

