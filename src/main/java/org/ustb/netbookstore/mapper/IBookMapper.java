package org.ustb.netbookstore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.ustb.netbookstore.bean.Book;

@Repository
public interface IBookMapper extends BaseMapper<Book> {
}
