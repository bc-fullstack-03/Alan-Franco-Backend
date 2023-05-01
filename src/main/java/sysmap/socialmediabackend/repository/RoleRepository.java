package sysmap.socialmediabackend.repository;

import sysmap.socialmediabackend.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(String username);
}
