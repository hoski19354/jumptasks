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
@Table(name = "timeslots", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Timeslots.findAll", query = "SELECT t FROM Timeslots t")
    , @NamedQuery(name = "Timeslots.findByTimeslotIDnumber", query = "SELECT t FROM Timeslots t WHERE t.timeslotIDnumber = :timeslotIDnumber")
    , @NamedQuery(name = "Timeslots.findByTimeslotWeekday", query = "SELECT t FROM Timeslots t WHERE t.timeslotWeekday = :timeslotWeekday")
    , @NamedQuery(name = "Timeslots.findByTimeslotTime", query = "SELECT t FROM Timeslots t WHERE t.timeslotTime = :timeslotTime")})
public class Timeslots implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "timeslot_IDnumber")
    private Integer timeslotIDnumber;
    @Basic(optional = false)
    @Column(name = "timeslot_weekday")
    private String timeslotWeekday;
    @Basic(optional = false)
    @Column(name = "timeslot_time")
    private String timeslotTime;

    public Timeslots() {
    }

    public Timeslots(Integer timeslotIDnumber) {
        this.timeslotIDnumber = timeslotIDnumber;
    }

    public Timeslots(Integer timeslotIDnumber, String timeslotWeekday, String timeslotTime) {
        this.timeslotIDnumber = timeslotIDnumber;
        this.timeslotWeekday = timeslotWeekday;
        this.timeslotTime = timeslotTime;
    }

    public Integer getTimeslotIDnumber() {
        return timeslotIDnumber;
    }

    public void setTimeslotIDnumber(Integer timeslotIDnumber) {
        Integer oldTimeslotIDnumber = this.timeslotIDnumber;
        this.timeslotIDnumber = timeslotIDnumber;
        changeSupport.firePropertyChange("timeslotIDnumber", oldTimeslotIDnumber, timeslotIDnumber);
    }

    public String getTimeslotWeekday() {
        return timeslotWeekday;
    }

    public void setTimeslotWeekday(String timeslotWeekday) {
        String oldTimeslotWeekday = this.timeslotWeekday;
        this.timeslotWeekday = timeslotWeekday;
        changeSupport.firePropertyChange("timeslotWeekday", oldTimeslotWeekday, timeslotWeekday);
    }

    public String getTimeslotTime() {
        return timeslotTime;
    }

    public void setTimeslotTime(String timeslotTime) {
        String oldTimeslotTime = this.timeslotTime;
        this.timeslotTime = timeslotTime;
        changeSupport.firePropertyChange("timeslotTime", oldTimeslotTime, timeslotTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeslotIDnumber != null ? timeslotIDnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Timeslots)) {
            return false;
        }
        Timeslots other = (Timeslots) object;
        if ((this.timeslotIDnumber == null && other.timeslotIDnumber != null) || (this.timeslotIDnumber != null && !this.timeslotIDnumber.equals(other.timeslotIDnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jump.Timeslots[ timeslotIDnumber=" + timeslotIDnumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
