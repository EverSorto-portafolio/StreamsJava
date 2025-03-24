package lambdas;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
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

    static Function<ByteArrayInputStream, Person> deserializer  = bais -> {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(bais)) {
            return (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw  new RuntimeException(e.getMessage());
        }

    };
    
    
    public static void main(String[] args) {
        ByteArrayOutputStream  objetoSerealizable =  serializer.apply(new Person("Ever" , 30));
        
        System.out.println(Arrays.toString(objetoSerealizable.toByteArray()));
        
        Person  objetoDeserializado  = deserializer.apply
        (new ByteArrayInputStream(objetoSerealizable.toByteArray()));
        
        System.out.println(objetoDeserializado.toString());
    }

}

@ToString
class Person implements Serializable {

    private String nombre;
    private Integer age;

    public Person(String nombre, Integer age) {
        this.age = age;
        this.nombre = nombre;
    }
     
    public String toString(){
    return  "nombre: " + nombre + " edad: " + age;
            }
}
