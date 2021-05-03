public interface IReader<T> {
    void read(T data);
    
}
interface ReadCompletion { 
    void then(String result);
    }
