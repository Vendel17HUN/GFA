package hu.nive.ujratervezes.kepesitovizsga.housecup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseCupService {
    @Autowired
    HouseCupRepo repo;

    public Iterable<Student> getAll() {
        return repo.findAll();
    }

    public Iterable<Student> getAllForHouse(String houseName) {
        return repo.findAllByHouseName(houseName);
    }

    public Iterable<Student> getAllForStudent(String studentName) {
        return repo.findAllByStudentName(studentName);
    }

    public String getHouseCupWinner() {
        return repo.findHouseCupWinner().orElse("");
    }

    public String getValedictorian() {
        return repo.findValedictorian().orElse("");
    }
}
