package com.itjx.mapper;

import com.itjx.pojo.Experience;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ExperienceMapper {
    @ResultMap("ExperienceResultMap")
    @Select("select * from tb_experience where username=#{username}")
    public List<Experience> selectAllByUsername(String username);

    @ResultMap("ExperienceResultMap")
    @Insert("insert into tb_experience values (null,#{companyName},#{employment},#{statement},#{beginTime},#{endTime},#{username})")
    public void insertOne(Experience experience);

    @ResultMap("ExperienceResultMap")
    @Select("select * from tb_experience where id = #{id}")
    public Experience selectOneById(Integer id);

    @ResultMap("ExperienceResultMap")
    @Update("update tb_experience set company_name = #{companyName},employment=#{employment},statement=#{statement},begin_time=#{beginTime},end_time=#{endTime} where id = #{id}")
    public void update(Experience experience);
    @ResultMap("ExperienceResultMap")
    @Delete("delete from tb_experience where id=#{id}")
    public void deleteById(Integer id);
}
