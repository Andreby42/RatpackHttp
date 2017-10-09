package cn.com.ratpack.ModelMapper;


import cn.com.ratpack.dbModel.AdContentPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_content
     *
     * @mbg.generated Tue Sep 05 10:17:32 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    List<AdContentPo> list(AdContentPo adContentPo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_content
     *
     * @mbg.generated Tue Sep 05 10:17:32 CST 2017
     */
    int insert(AdContentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_content
     *
     * @mbg.generated Tue Sep 05 10:17:32 CST 2017
     */
    int insertSelective(AdContentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_content
     *
     * @mbg.generated Tue Sep 05 10:17:32 CST 2017
     */
    AdContentPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_content
     *
     * @mbg.generated Tue Sep 05 10:17:32 CST 2017
     */
    int updateByPrimaryKeySelective(AdContentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_content
     *
     * @mbg.generated Tue Sep 05 10:17:32 CST 2017
     */
    int updateByPrimaryKey(AdContentPo record);
}