package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import jdbc.JdbcUtil;
import model.ParkInfo;

public class ParkInfoDao {

	public ParkInfo insert(Connection conn, ParkInfo parkinfo) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("insert into park_info_tbl (parkno, carno, grade, tstat, indate, outdate)"
					+ " values (seq_park.nextval,?,?,?,?,?)");
			pstmt.setString(1, parkinfo.getCarno());
			pstmt.setString(2, parkinfo.getGrade());
			pstmt.setString(3, parkinfo.getTstat());
			pstmt.setTimestamp(4, toTimestamp(parkinfo.getIndate()));
			pstmt.setTimestamp(5, toTimestamp(parkinfo.getOutdate()));
			pstmt.executeUpdate();

			return parkinfo;

		} finally {
			JdbcUtil.close(pstmt);
		}

	}

	private Timestamp toTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}

} // class
