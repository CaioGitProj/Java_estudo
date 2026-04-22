package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry
{
    private String username;
    private Date date;

    public LogEntry() {
    }
    public LogEntry(String username, Date date)
    {
        this.username = username;
        this.date = date;
    }


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(getUsername(), logEntry.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getUsername());
    }
}
