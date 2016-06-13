package com.cohifi.dao.jdbc;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.cohifi.dao.ToyDAO;
import com.cohifi.domain.Toy;



@Repository("ToyDaoJdbcImpl")
public class ToyDaoJdbcImpl implements ToyDAO {
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedTemplate;
	private SimpleJdbcInsert jdbcInsert;
	
	private UserRowMapper userRowMapper;


	@PostConstruct
	public void setup() {
		jdbcTemplate = new JdbcTemplate(dataSource);
		namedTemplate = new NamedParameterJdbcTemplate(dataSource);
		jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("user")
				    .usingColumns("userid", "name","creditcard","emailid", "phone", "totalbill" , "paidbill");
		userRowMapper = new UserRowMapper();

	}



	@Override
	public List<Toy> getToyListByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Toy> getToyListShared(List<Integer> users) {
		// TODO Auto-generated method stub
		return null;
	}

}
