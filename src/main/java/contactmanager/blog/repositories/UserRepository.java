package contactmanager.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import contactmanager.blog.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
