/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ziping and Bryan Burns
 */
public class EmptyCollectionException extends RuntimeException {
    // create an empty queue exception
    public EmptyCollectionException (String queue)
    {
        super ("The " + queue + " is empty.");
    }
}