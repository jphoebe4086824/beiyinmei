package com.ningpai.system.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ningpai.manager.base.BasicSqlSupport;
import com.ningpai.system.bean.CurrencyConf;
import com.ningpai.system.dao.ICurrencyConfDao;

/**
 * 货币设置数据操作类
 * 
 * @Description:
 * @author NINGPAI_xiaomm
 * @since 2014-03-25 13:17:21
 * @version V1.0
 */
@Repository("currencyConfDaoImpl")
public class CurrencyConfDaoImpl extends BasicSqlSupport implements
        ICurrencyConfDao {

    /**
     * 保存货币设置
     * 
     * @param currencyConf
     *            货币设置对象
     * @return 是否保存成功
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final boolean saveCurrencyConf(final CurrencyConf currencyConf) {
        return this.insert(
                "com.ningpai.system.dao.CurrencyConfDaoImpl.saveCurrencyConf",
                currencyConf) >= 1 ? true : false;
    }

    /**
     * 修改货币设置
     * 
     * @param currencyConf
     *            待修改货币设置对象
     * @return 更新影响的条数
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final int updateCurrencyConf(final CurrencyConf currencyConf) {
        return this
                .update("com.ningpai.system.dao.CurrencyConfDaoImpl.updateCurrencyConf",
                        currencyConf);
    }

    /**
     * 根据货币设置对象的id查询货币设置对象
     * 
     * @param id
     *            货币设置id
     * @return 货币设置对象
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final CurrencyConf getCurrencyConfById(final int id) {
        return this
                .selectOne(
                        "com.ningpai.system.dao.CurrencyConfDaoImpl.getCurrencyConfById",
                        id);
    }

    /**
     * 根据货币设置对象的id字符集合查询货币设置对象
     * 
     * @param ids
     *            货币设置id字符集合(如果多个使用,分割)
     * @return 货币设置对象集合
     * @author system
     * @since 2014-03-25 13:17:21
     */
    public final List<CurrencyConf> getCurrencyConfByIds(final String ids) {
        // 将字符串ids转换为集合，用于sql赋值
        Map<String, Object> para = new HashMap<String, Object>(1);
        List<String> idList = new ArrayList<String>();
        if (ids.contains(",")) {
            for (String id : ids.split(",")) {
                idList.add(id);
            }
        } else {
            idList.add(ids);
        }
        para.put("ids", idList);
        return this
                .selectList(
                        "com.ningpai.system.dao.CurrencyConfDaoImpl.getCurrencyConfByIds",
                        para);
    }

    /**
     * 根据货币设置对象的id字符集合删除货币设置对象
     * 
     * @param ids
     *            货币设置id字符集合(如果多个使用,分割)
     * @return 删除货币设置对象的数目
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final int deleteCurrencyConf(final String ids) {
        Map<String, Object> para = new HashMap<String, Object>(1);
        List<String> idList = new ArrayList<String>();
        if (ids.contains(",")) {
            for (String id : ids.split(",")) {
                idList.add(id);
            }
        } else {
            idList.add(ids);
        }
        para.put("ids", idList);
        return this
                .delete("com.ningpai.system.dao.CurrencyConfDaoImpl.deleteCurrencyConf",
                        para);
    }

    /**
     * 更新货币设置对象的单个字段 其中要包含ids键，保存更新对象的id（多个id以，号分割）
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 更新货币设置对象的数目
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final int updateCurrencyConfFieldById(
            final Map<String, Object> parameter) {
        return this
                .update("com.ningpai.system.dao.CurrencyConfDaoImpl.updateCurrencyConfFieldById",
                        parameter);
    }

    /**
     * 根据货币设置对象的单个字段查询货币设置对象信息总数 其中要包含ids键，保存更新对象的id（多个id以，号分割） 如果查询中有时间条件
     * 则字段名格式为：开始时间（字段名Start），结束时间（字段名End）
     * 如果需要分页查询，开始为：startRowNum，结束为：endRowNum
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 货币设置对象信息总数
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final int getCurrencyConfByFieldTotal(
            final Map<String, Object> parameter) {
        return this
                .selectOne(
                        "com.ningpai.system.dao.CurrencyConfDaoImpl.getCurrencyConfByFieldTotal",
                        parameter);
    }

    /**
     * 根据货币设置对象的单个字段查询货币设置对象信息 其中要包含ids键，保存更新对象的id（多个id以，号分割）
     * 如果查询中有时间条件，则字段名格式为：开始时间（字段名Start），结束时间（字段名End）
     * 如果需要分页查询，开始为：startRowNum，结束为：endRowNum
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 货币设置对象的集合
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final List<CurrencyConf> getCurrencyConfByField(
            final Map<String, Object> parameter) {
        return this
                .selectList(
                        "com.ningpai.system.dao.CurrencyConfDaoImpl.getCurrencyConfByField",
                        parameter);
    }

    /**
     * 查询货币设置对象信息总数 如果需要分页查询，开始为：startRowNum，结束为：endRowNum
     * 
     * @param parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 货币设置对象信息总数
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final int queryCurrencyConfTotal(final Map<String, Object> parameter) {
        return this
                .selectOne(
                        "com.ningpai.system.dao.CurrencyConfDaoImpl.queryCurrencyConfTotal",
                        parameter);
    }

    /**
     * 分页查询货币设置对象信息 如果需要分页查询，开始为：startRowNum，结束为：endRowNum
     * 
     * @param _parameter
     *            更新的参数Map(key: 字段名 value: 字段值)
     * @return 货币设置对象的集合
     * @author NINGPAI_xiaomm
     * @since 2014-03-25 13:17:21
     */
    public final List<CurrencyConf> queryCurrencyConfByPage(
            final Map<String, Object> parameter) {
        return this
                .selectList(
                        "com.ningpai.system.dao.CurrencyConfDaoImpl.queryCurrencyConfByPage",
                        parameter);
    }
}
