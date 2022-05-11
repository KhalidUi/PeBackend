package contactmanager.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import contactmanager.blog.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
