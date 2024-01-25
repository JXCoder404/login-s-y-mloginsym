package com.itjx.mapper;

import com.itjx.pojo.Inf;
import org.apache.ibatis.annotations.*;


public interface InfMapper {
    @Select("select * from tb_inf where username=#{username}")
    public Inf select(String username);

    @Update("update tb_inf set name=#{name},age=#{age},nation=#{nation},birthday=#{birthday},outlook=#{outlook},education=#{education},speciality=#{speciality},graduation=#{graduation},postCode=#{postCode},talent=#{talent} where username= #{username}")
    public boolean update(Inf inf);

    @Update("update tb_inf set url_image=#{url_image} where username=#{username}")
    public void updateImg(@Param("username") String username, @Param("url_image") String url_image);

    @Insert("insert into tb_inf(username) value (#{username})")
    public void createByUsername(String username);
}
