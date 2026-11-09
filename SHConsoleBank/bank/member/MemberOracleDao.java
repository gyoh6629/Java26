package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionFactory;
import bank.util.JDBCClose;

public class MemberOracleDao implements MemberDao {

	@Override
	public boolean save(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();

			String sql  = "insert into sh_member(id, password, name, email, mobile, type) ";
				   sql += " values(?, ?, ?, ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			pstmt.setString(5, m.getMobile());
			pstmt.setString(6, String.valueOf(m.getType()));
			
			return pstmt.executeUpdate() > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	@Override
	public List<Member> findAll() {
		List<Member> memberList = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			// 3단계
			String sql  = "select id, password, name, email, mobile, type ";
			  	   sql += "  from sh_member ";
			
		    pstmt = conn.prepareStatement(sql);
			
			// 4단계
		    ResultSet rs = pstmt.executeQuery();
		    
		    while(rs.next()) {
		    	// 컬럼 추출
		    	String id       = rs.getString("id");
		    	String password = rs.getString("password");
		    	String name     = rs.getString("name");
		    	String email    = rs.getString("email");
		    	String mobile   = rs.getString("mobile");
		    	char   type     = rs.getString("type").charAt(0);
		    	
		    	Member member = new Member(id, password, name, email, mobile, type);

		    	// 리스트 추가
		    	memberList.add(member);
		    }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return memberList;
	}

	@Override
	public Member findById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Member member = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			// 3단계
			String sql  = "select id, password, name, email, mobile, type ";
			       sql += "  from sh_member ";
			       sql += " where id = ? ";
			
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, id);
		    
			// 4단계
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String password = rs.getString("password");
				String name     = rs.getString("name");
				String email    = rs.getString("email");
				String mobile   = rs.getString("mobile");
				char   type     = rs.getString("type").charAt(0);
				
				member = new Member(id, password, name, email, mobile, type);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return member;		
	}

	@Override
	public boolean update(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();

			String sql  = "update sh_member ";
				   sql += "   set password = ?, name = ?, email = ?, mobile = ?, type = ? ";
		           sql += " where id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getPassword());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getMobile());
			pstmt.setString(5, String.valueOf(m.getType()));
			pstmt.setString(6, m.getId());
			
			return pstmt.executeUpdate() > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	@Override
	public boolean delete(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();

			String sql  = "delete from sh_member ";
		       	   sql += " where id = ? ";
		       	   
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			
			return pstmt.executeUpdate() > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

}
