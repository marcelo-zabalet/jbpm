/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbpm.task.lifecycle.listeners;

import org.jbpm.task.Task;

/**
 *
 */

public interface TaskLifeCycleEventListener {
    
    //@TODO: add all the methods
    public void afterTaskActivatedEvent(Task ti);
    public void afterTaskClaimedEvent(Task ti);
    public void afterTaskSkippedEvent(Task ti);
    public void afterTaskStartedEvent(Task ti);
    public void afterTaskStoppedEvent(Task ti);
}
