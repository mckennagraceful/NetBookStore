package org.ustb.netbookstore.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WrittenBy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(value = "bid", type = IdType.AUTO)
    private int bid;
    private String writerName;
}
