import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Setter
@Getter
@Component("masina")
public class Masina implements IAutomobil{
//    public int distance;
//    public int maxSpeed;

    private Motor motor;

    //injectare motor prin constructor
    public Masina(Motor motor){
        this.motor = motor;
    }

    @Override
    public void travel() {
        System.out.println("The car has traveled " + 30 + " km.");
    }

    @Override
    public int maxDrivingSpeed() {
        return 120 ;
    }
}
