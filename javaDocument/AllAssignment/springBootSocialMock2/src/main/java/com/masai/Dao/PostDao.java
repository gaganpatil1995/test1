package com.masai.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Post;

@Repository
public interface PostDao extends JpaRepository<Post, Integer> {

}
