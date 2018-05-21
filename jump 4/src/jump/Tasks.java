/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jump;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Alastair
 */
@Entity
@Table(name = "tasks", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t")
    , @NamedQuery(name = "Tasks.findByTaskIDnumber", query = "SELECT t FROM Tasks t WHERE t.taskIDnumber = :taskIDnumber")
    , @NamedQuery(name = "Tasks.findByTaskSubject", query = "SELECT t FROM Tasks t WHERE t.taskSubject = :taskSubject")
    , @NamedQuery(name = "Tasks.findByTaskName", query = "SELECT t FROM Tasks t WHERE t.taskName = :taskName")
    , @NamedQuery(name = "Tasks.findByTaskLength", query = "SELECT t FROM Tasks t WHERE t.taskLength = :taskLength")
    , @NamedQuery(name = "Tasks.findByTaskDuedate", query = "SELECT t FROM Tasks t WHERE t.taskDuedate = :taskDuedate")})
public class Tasks implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_IDnumber")
    private Integer taskIDnumber;
    @Basic(optional = false)
    @Column(name = "task_subject")
    private String taskSubject;
    @Basic(optional = false)
    @Column(name = "task_name")
    private String taskName;
    @Basic(optional = false)
    @Column(name = "task_length")
    private int taskLength;
    @Basic(optional = false)
    @Column(name = "task_duedate")
    private String taskDuedate;

    public Tasks() {
    }

    public Tasks(Integer taskIDnumber) {
        this.taskIDnumber = taskIDnumber;
    }

    public Tasks(Integer taskIDnumber, String taskSubject, String taskName, int taskLength, String taskDuedate) {
        this.taskIDnumber = taskIDnumber;
        this.taskSubject = taskSubject;
        this.taskName = taskName;
        this.taskLength = taskLength;
        this.taskDuedate = taskDuedate;
    }

    public Integer getTaskIDnumber() {
        return taskIDnumber;
    }

    public void setTaskIDnumber(Integer taskIDnumber) {
        Integer oldTaskIDnumber = this.taskIDnumber;
        this.taskIDnumber = taskIDnumber;
        changeSupport.firePropertyChange("taskIDnumber", oldTaskIDnumber, taskIDnumber);
    }

    public String getTaskSubject() {
        return taskSubject;
    }

    public void setTaskSubject(String taskSubject) {
        String oldTaskSubject = this.taskSubject;
        this.taskSubject = taskSubject;
        changeSupport.firePropertyChange("taskSubject", oldTaskSubject, taskSubject);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        String oldTaskName = this.taskName;
        this.taskName = taskName;
        changeSupport.firePropertyChange("taskName", oldTaskName, taskName);
    }

    public int getTaskLength() {
        return taskLength;
    }

    public void setTaskLength(int taskLength) {
        int oldTaskLength = this.taskLength;
        this.taskLength = taskLength;
        changeSupport.firePropertyChange("taskLength", oldTaskLength, taskLength);
    }

    public String getTaskDuedate() {
        return taskDuedate;
    }

    public void setTaskDuedate(String taskDuedate) {
        String oldTaskDuedate = this.taskDuedate;
        this.taskDuedate = taskDuedate;
        changeSupport.firePropertyChange("taskDuedate", oldTaskDuedate, taskDuedate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskIDnumber != null ? taskIDnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.taskIDnumber == null && other.taskIDnumber != null) || (this.taskIDnumber != null && !this.taskIDnumber.equals(other.taskIDnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jump.Tasks[ taskIDnumber=" + taskIDnumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
