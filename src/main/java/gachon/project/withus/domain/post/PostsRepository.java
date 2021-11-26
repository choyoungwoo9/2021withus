package gachon.project.withus.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

/*
* JPA로 DB를 다루는 부분입니다
*
* */

public interface PostsRepository extends JpaRepository<Posts, Long> {


}
