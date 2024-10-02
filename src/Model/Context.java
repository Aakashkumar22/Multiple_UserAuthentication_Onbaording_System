package Model;
import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Object> data = new HashMap<>();

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String key, Class<T> type) {
        Object value = data.get(key);
        if (type.isInstance(value)) {
            return (T) value;
        }
        return null; // or throw an exception if preferred
    }
}

