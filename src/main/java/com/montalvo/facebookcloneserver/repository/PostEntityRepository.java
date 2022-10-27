package com.montalvo.facebookcloneserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.montalvo.facebookcloneserver.entity.PostEntity;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String> {

}
