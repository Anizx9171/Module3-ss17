package ra.sevice.classroom;

import ra.model.Classroom;

import java.util.ArrayList;
import java.util.List;
import ra.service.classroom.IClassroomService;

public class ClassroomServiceIMPL implements IClassroomService {
    static List<Classroom> classroomList = new ArrayList<>();

    @Override
    public List<Classroom> findAll() {
        return classroomList;
    }

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Classroom findById() {
        return null;
    }
}