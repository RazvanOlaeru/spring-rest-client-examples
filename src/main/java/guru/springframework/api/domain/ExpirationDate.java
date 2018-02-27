package guru.springframework.api.domain;

import java.io.Serializable;

public class ExpirationDate implements Serializable{

    private static final long serialVersionUID = 7961021170049862992L;
    private String date;
    private Integer timezone_type;
    private String timezone;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimezone_type() {
        return timezone_type;
    }

    public void setTimezone_type(Integer timezone_type) {
        this.timezone_type = timezone_type;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
