package com.itransition.itransitioncoursework.repository;

import com.itransition.itransitioncoursework.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LikeRepository extends JpaRepository<Like, UUID> {

}
