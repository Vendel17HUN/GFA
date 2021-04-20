package hu.nive.ujratervezes.kepesitovizsga.housecup;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HouseCupRepo extends CrudRepository<Student, Long> {

    Iterable<Student> findAllByHouseName(String houseName);

    Iterable<Student> findAllByStudentName(String studentName);

    @Query(value = "select house_name from house_points group by house_name order by sum(points_earned) desc limit 1", nativeQuery = true)
    Optional<String> findHouseCupWinner();

    @Query(value = "select student_name from house_points group by student_name order by count(points_earned) desc limit 1", nativeQuery = true)
    Optional<String> findValedictorian();
}