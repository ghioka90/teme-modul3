import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Autocar implements IAutomobil {

    //injectare motor prin field
    @Autowired
    private Motor motor;
    @Override
    public void travel() {
        System.out.println("The bus has traveled " + 500 + " km.");
    }

    @Override
    public int maxDrivingSpeed() {
        return 110;
    }
}
