package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car{
    @Id
    @Column(name = "series")
    int series;

    @Column
    String model;

    @OneToOne
    User user;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Model " + model  +
                ", Series " + series +".";
    }
}
