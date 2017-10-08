package BusinessLogics;

import java.sql.*;
import java.util.*;

import JavaBeans.sanPham;

public class sanPhamBL {
	public static List<sanPham> DocTatCa(){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM san_pham");
			dsSanPham = new ArrayList<>();
			
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dsSanPham;
		
	}
	
	public static List<sanPham> timTheoTen(String tenSanPhamCanTim){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("select * from san_pham where ten_san_pham like '%"+tenSanPhamCanTim+"%'");
			dsSanPham = new ArrayList<>();
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dsSanPham;
		
	}
	
	public static List<sanPham> timTheoGiaDuoi1Trieu(){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("select * from san_pham where gia_san_pham <1000000");
			dsSanPham = new ArrayList<>();
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dsSanPham;
		
	}
	
	public static List<sanPham> timTheoGia1TrieuDen3Trieu(){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("select * from san_pham where gia_san_pham >=1000000 and gia_san_pham <3000000 ");
			dsSanPham = new ArrayList<>();
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dsSanPham;
		
	}
	
	public static List<sanPham> timTheoGia3TrieuDen7Trieu(){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("select * from san_pham where gia_san_pham >=3000000 and gia_san_pham <7000000 ");
			dsSanPham = new ArrayList<>();
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dsSanPham;
		
	}
	
	public static List<sanPham> timTheoGia7TrieuDen10Trieu(){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("select * from san_pham where gia_san_pham >=7000000 and gia_san_pham <10000000 ");
			dsSanPham = new ArrayList<>();
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dsSanPham;
		
	}
	
	public static List<sanPham> timTheoGiaTren10Trieu(){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("select * from san_pham where gia_san_pham >=10000000");
			dsSanPham = new ArrayList<>();
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dsSanPham;
		
	}
	
	public static List<sanPham> timKiemTheoHang(String hang_sxuat){
		List<sanPham> dsSanPham = null;
		try {
			Connection db = Database.connect();
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("select * from san_pham where hang_san_xuat like '%"+hang_sxuat+"%'");
			dsSanPham = new ArrayList<>();
			while(rs.next()){
				sanPham sp = new sanPham();
				sp.setTenSanPham(rs.getString("ten_san_pham"));
				sp.setHangSanXuat(rs.getString("hang_san_xuat"));
				sp.setGiaSanPham(rs.getInt("gia_san_pham"));
				sp.setTinhTrang(rs.getString("tinh_trang"));
				sp.setHinh_dai_dien(rs.getString("hinh_anh_mo_phong"));
				dsSanPham.add(sp);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return dsSanPham;
	}
}