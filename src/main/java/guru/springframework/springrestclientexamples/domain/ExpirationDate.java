package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;
import java.util.Date;

public class ExpirationDate implements Serializable{

    private static final long serialVersionUID = 7961021170049862992L;
    private Date date;
    private String timezone_type;
    private String timezone;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimezone_type() {
        return timezone_type;
    }

    public void setTimezone_type(String timezone_type) {
        this.timezone_type = timezone_type;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
