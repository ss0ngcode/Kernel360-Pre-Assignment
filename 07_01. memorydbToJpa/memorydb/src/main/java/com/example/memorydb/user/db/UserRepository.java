package com.example.memorydb.user.db;

import com.example.memorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // select * from user where score >= [??]
    // findAllBy : 해당하는 모든 데이터를 찾겠음
    // Score : 'score'라는 변수를 기준으로
    // GreaterThanEqual : 크거나 같은(=이상)
    List<UserEntity> findAllByScoreGreaterThanEqual(int score);

    // select * from user where score >= ?? AND score <= ??
    // findAllBy : 해당하는 모든 데이터를 찾겠음
    // Score : 'score'라는 변수를 기준으로
    // GreaterThanEqual : 크거나 같은(=이상)
    // And : &&
    // Score : 'score'라는 변수를 기준으로
    // LessThanEqual : 작거나 같은(=이하)
    List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min, int max);


    @Query(
            value = "select * from user as u where u.score >= :min AND u.score <= :max",
            nativeQuery = true
    )
    List<UserEntity> score(
            @Param(value = "min") int min,
            @Param(value = "max") int max
    );
}
