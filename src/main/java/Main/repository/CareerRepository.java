package Main.repository;

import Main.entity.Career;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CareerRepository extends JpaRepository<Career, Long> {
    @Query("SELECT c FROM Career c WHERE c.employeeId = :employeeId")
    List<Career> findAllCareerById(@Param("employeeId") Integer employeeId);
}
