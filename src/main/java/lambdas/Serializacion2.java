package lambdas;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;
import lombok.ToString;

/**
 *
 * @author Ever
 */
public class Serializacion2 {

    static Function<Person, ByteArrayOutputStream> serializer = p -> {

        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();
        try (ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)) {
            outputStream.writeObject(p);
            outputStream.flush();
        } catch (IOException ioe) {
            System.err.println("lambdas.Serializacion2.methodName()" + ioe.getMessage());
        }
        return inMemoryBytes;
        };
}

@ToString
class Person implements Serializable {

    private String nombre;
    private Integer age;

    public Person(String nombre, Integer age) {
        this.age = age;
        this.nombre = nombre;
    }
}
