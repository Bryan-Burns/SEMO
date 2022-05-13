/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ziping
 */
public class EmptyQueueException extends RuntimeException
{
    // create an empty queue exception
    public EmptyQueueException (String queue)
    {
        super ("The " + queue + " is empty.");
    }
}