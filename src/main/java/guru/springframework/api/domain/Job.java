package guru.springframework.api.domain;

import java.io.Serializable;

public class Job implements Serializable {

    private static final long serialVersionUID = 4224810639289089046L;
    private String title;
    private String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
