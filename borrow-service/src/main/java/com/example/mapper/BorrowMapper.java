package com.example.mapper;

import com.example.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BorrowMapper {
    @Select("select * from borrow where uid = #{uid}")
    List<Borrow> getBorrowByUid(int uid);

    @Select("select * from borrow where bid = #{bid}")
    List<Borrow> getBorrowByBid(int bid);

    @Select("select  * from borrow where bid = #{bid} and uid = #{uid}")
    Borrow getBorrow(int uid, int bid);
}
