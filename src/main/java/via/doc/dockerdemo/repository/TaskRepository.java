package via.doc.dockerdemo.repository;

import via.doc.dockerdemo.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TeamMember, String> {
}