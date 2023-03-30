import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component("carService")
public class CarService {
    @Autowired
    private Masina masina;
    private Autocar autocar;
    private Motocicleta motocicleta;

    public CarService(Autocar autocar){
        this.autocar = autocar;
    }

    public void setMotocicleta(Motocicleta motocicleta){
        this.motocicleta = motocicleta;
    }

    public void travel(){
        masina.travel();
    }
}
