package com.example.demo.repository;
 
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;
 
@Repository
public interface KafkaUserRepository extends ElasticsearchRepository<User,String> {
   
}