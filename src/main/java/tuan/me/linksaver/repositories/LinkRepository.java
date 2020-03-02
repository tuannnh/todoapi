package tuan.me.linksaver.repositories;

import tuan.me.linksaver.entities.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LinkRepository extends JpaRepository<Link, Integer>, JpaSpecificationExecutor<Link> {

}