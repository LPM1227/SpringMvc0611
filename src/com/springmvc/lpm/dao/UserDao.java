package com.springmvc.lpm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.lpm.entities.UserEntity;

public class UserDao extends JdbcDaoSupport {
	@SuppressWarnings("rawtypes")
	public  List getUserName(UserEntity user){
		String userName = user.getUserName();
		String passWord = user.getPassWord();
		
		String sql="select * from TYXHB_USERINFO where username = " +"'"+userName+"'";
		List<Map> result = super.getJdbcTemplate().query(sql, new RowMapper<Map>() {  
			@Override  
		      public Map<String,String> mapRow(ResultSet rs, int rowNum) throws SQLException {  
		          Map<String,String> row = new HashMap<String, String>();  
		          row.put("name", rs.getString("PASSWORD"));  
		          return row;  
		  }}); 
		  System.out.println(result.toString());
		  return result;
	}
	// ע��jdbcTemplate
	@Resource(name = "jdbcTemplate")
		JdbcTemplate jdbcTemplate;
	 
		/**
		 * ��ӣ��������
		 */
		/*@Transactional
		public List getUserName(UserEntity user) {
			//֧��seq_uid.nextval ��oracle�Զ����л���
			final String sql = "select * from TYXHB_USERINFO";
			List list = null ;
			super.getJdbcTemplate().query(sql, new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					//��ӵ�������
				}
			});
	 
			return list;
		}*/
	public UserDao() {
		super();
	}
	
}