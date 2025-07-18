package women_entity;



import jakarta.persistence.*;

@Entity
@Table(name = "women_in_history")
public class WomenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    private Integer birth_year;

    private String country;

    @Column(nullable = false)
    private String contribution;

    public WomenEntity() {}

    public WomenEntity(String name, Integer birth_year, String country, String contribution) {
        this.name = name;
        this.birth_year = birth_year;
        this.country = country;
        this.contribution = contribution;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public Integer getBirth_year() { return birth_year; }
    public String getCountry() { return country; }
    public String getContribution() { return contribution; }

    public void setName(String name) { this.name = name; }
    public void setBirth_year(Integer birth_year) { this.birth_year = birth_year; }
    public void setCountry(String country) { this.country = country; }
    public void setContribution(String contribution) { this.contribution = contribution; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + birth_year + " | " + country + " | " + contribution;
    }
}
