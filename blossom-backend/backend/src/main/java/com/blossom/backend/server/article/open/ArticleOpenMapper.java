package com.blossom.backend.server.article.open;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blossom.backend.server.article.open.pojo.ArticleOpenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 公开文章
 *
 * @author xzzz
 */
@Mapper
public interface ArticleOpenMapper extends BaseMapper<ArticleOpenEntity> {

    /**
     * 公开文章
     *
     * @param id 公开文章的ID
     */
    void open(Long id);

    /**
     * 关闭公开
     *
     * @param id 关闭公开文章的ID
     */
    void close(Long id);

    /**
     * 同步公开
     *
     * @param id 公开文章的ID
     */
    void sync(Long id);
}
