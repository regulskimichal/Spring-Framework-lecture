package pl.michalregulski.springdemo;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class<?> clazz, Object id) {
        super("For class " + clazz.getName() + " there is no entity with id: " + id);
    }

}
