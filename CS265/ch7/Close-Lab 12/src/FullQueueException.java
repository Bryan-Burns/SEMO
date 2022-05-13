/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ziping
 */
public class FullQueueException extends RuntimeException
{
    // create a full queue exception
    public FullQueueException (String queue)
    {
        super ("The " + queue + " is full.");
    }
}