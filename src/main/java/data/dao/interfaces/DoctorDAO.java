package data.dao.interfaces;

import data.dto.Doctor;

import java.util.List;

public interface DoctorDAO {
    List<Doctor> getAll();
    Doctor get(String id);
    void save(Doctor doc);
    void update(Doctor doc);
    void delete(String id);
}
