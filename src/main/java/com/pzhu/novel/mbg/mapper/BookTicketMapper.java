package com.pzhu.novel.mbg.mapper;

import com.pzhu.novel.mbg.model.BookTicket;
import com.pzhu.novel.mbg.model.BookTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookTicketMapper {
    int countByExample(BookTicketExample example);

    int deleteByExample(BookTicketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookTicket record);

    int insertSelective(BookTicket record);

    List<BookTicket> selectByExample(BookTicketExample example);

    BookTicket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookTicket record, @Param("example") BookTicketExample example);

    int updateByExample(@Param("record") BookTicket record, @Param("example") BookTicketExample example);

    int updateByPrimaryKeySelective(BookTicket record);

    int updateByPrimaryKey(BookTicket record);
}