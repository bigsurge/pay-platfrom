package com.isoftstone.pay.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.isoftstone.pay.model.SiteChannel;
import com.isoftstone.pay.utils.SimpleIbatisDao;

@Repository
@SuppressWarnings("deprecation")
public class SiteChannelDao extends SimpleIbatisDao {

    public List<SiteChannel> getResultList() {
        
        return getSqlMapClientTemplate().queryForList("getAllSiteChannel", null);
    }

    public void save(SiteChannel entity) {
        
        getSqlMapClientTemplate().insert("insertSiteChannel", entity);
    }

    public List<SiteChannel> getSiteChannelByChannelId(String channelId) {
        return getSqlMapClientTemplate().queryForList("getSiteChannelByChannelId", channelId);
    }

    public void update(SiteChannel entity) {
        

    }

    public void delete(String id) {
        

    }

    public SiteChannel findById(String id) {
        
        return null;
    }

    public List<SiteChannel> findByHQL(String hql, Object... params) {
        
        return null;
    }

}
