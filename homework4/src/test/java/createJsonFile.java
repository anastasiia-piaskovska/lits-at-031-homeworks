import com.fasterxml.jackson.databind.ObjectMapper;
import jackson.Car;

import java.io.File;
import java.io.IOException;

public class createJsonFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", 12);
        objectMapper.writeValue(new File("target/car.json"), car);
    }
}
