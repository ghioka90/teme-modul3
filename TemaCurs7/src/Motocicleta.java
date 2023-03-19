import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Motocicleta implements IAutomobil {

    private Motor motor;
//injectare motor prin setter
    @Autowired
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    @Override
    public void travel() {
        System.out.println("The motorcycle has traveled " + 130 + " km.");
    }

    @Override
    public int maxDrivingSpeed() {
        return 140;
    }

}
