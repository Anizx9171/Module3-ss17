package ra.service;

import java.util.List;

public interface IGeneric<T> {
    List<T> findAll();
    void save();
    void update();
    void delete();
    T findById();
}
