/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestapp;

/**
 *
 * @author pyaku
 */
public interface PQInterface {
    public void enqueue(Person item);

    public int size();

    public boolean isEmpty();

    public Person dequeue();

    public void displayQueue();
    
}
