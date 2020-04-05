package cqust.hjj.spring_boot_plc_draggable.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import cqust.hjj.spring_boot_plc_draggable.model.AI0;


public interface IAI0Dao {
	public void insert(double voltage,Integer sid) throws SQLException;
	public List<AI0> queryall(Integer sid) throws SQLException;
}
