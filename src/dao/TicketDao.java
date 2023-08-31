package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import model.Ticket;

public class TicketDao {

	public Ticket selectById(Connection conn, int tno) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT * FROM ticket_tb1_01 WHERE tno = ?");
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();
			Ticket ticket = null;
			if (rs.next()) {
				return new Ticket(rs.getInt("tno"), rs.getString("carno"), rs.getString("grade"), rs.getString("phone"),
						rs.getString("tstat"), toDate(rs.getTimestamp("startdate")),
						toDate(rs.getTimestamp("enddate")));
			}
			return ticket;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}

	public List<Ticket> select() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = ConnectionProvider.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from ticket_tb1_01");
			List<Ticket> records = new ArrayList<>();
			while (rs.next()) {
				records.add(listingRecord(rs));
			}
			return records;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(conn);

		}
	}

	private Ticket listingRecord(ResultSet rs) throws SQLException {
		Ticket record = new Ticket(rs.getInt("tno"), rs.getString("carno"), rs.getString("phone"),
				rs.getString("grade"), rs.getString("tstat"), dateFormat(rs.getTimestamp("startdate")),
				dateFormat(rs.getTimestamp("enddate")));
		return record;
	}

	private Date toDate(Timestamp date) {
		return date == null ? null : new Date(date.getTime());
	}

	public Ticket insert(Connection conn, Ticket ticket) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("insert into ticket_tb1_01 "
					+ "(tno, carno, phone, grade, tstat, startdate, enddate) values (seq_ticket.nextval,?,?,?,?,?,?)");

			pstmt.setString(1, ticket.getCarno());
			pstmt.setString(2, ticket.getPhone());
			pstmt.setString(3, ticket.getGrade());
			pstmt.setString(4, ticket.getTstat());
			pstmt.setTimestamp(5, new Timestamp(ticket.getStartdate().getTime()));
			pstmt.setTimestamp(6, new Timestamp(ticket.getEnddate().getTime()));
			pstmt.executeUpdate();

		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);

		}
		return ticket;

	}

	public String dateFormat(Timestamp date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if (date == null) {
			return "";
		}
		String strDate = format.format(date);

		return strDate;
	}

} // class
