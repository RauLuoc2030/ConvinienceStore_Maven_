package DAO_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import DTO.KhachHangDTO;

public class KhachHangDAO {
    Session session;

    /**
     * Lấy thông tin từ Database
     * 
     * @param condition
     * @param orderBy
     * @return Danh sách Khách hàng
     */
    public List<KhachHangDTO> readDB(String condition, String orderBy) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<KhachHangDTO> khachHangDTOs = null;

        try {
            String queryString = "from KhachHangDTO";

            if (condition != null && !condition.isEmpty()) {
                queryString += " where " + condition;
            }

            if (orderBy != null && !orderBy.isEmpty()) {
                queryString += " order by " + orderBy;
            }

            Query<KhachHangDTO> query = session.createQuery(queryString, KhachHangDTO.class);
            khachHangDTOs = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return khachHangDTOs;
    }

    /**
     * Override lại phương thức readDB() cho TH truyền vào một tham số Condition
     * 
     * @param condition
     * @return readDB(condition, null)
     */
    public List<KhachHangDTO> readDB(String condition) {
        return readDB(condition, null);
    }

    /**
     * Override lại phương thức readDB() cho TH không truyền vào tham số
     * 
     * @return readDB(null, null)
     */
    public List<KhachHangDTO> readDB() {
        return readDB(null, null);
    }

    /**
     * Thêm một Khách hàng mới đã có thông tin vào CSDL
     * 
     * @param KhachHangDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean them(KhachHangDTO khachHangDTO) throws Exception {
        boolean result = false;
        session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            KhachHangDTO newKhachHang = new KhachHangDTO();

            newKhachHang.setMaKHString(khachHangDTO.getMaKHString());
            newKhachHang.setSDTKHString(khachHangDTO.getSDTKHString());
            newKhachHang.settenKHString(khachHangDTO.gettenKHString());

            session.save(newKhachHang);
            session.getTransaction().commit();
            result = true;

        } catch (Exception ex) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }

    /**
     * Xóa một Khách hàng khỏi CSDL
     * 
     * @param khachHangDTO
     * @return True nếu thành công
     * @throws Exception và rollback Transaction
     */
    public boolean xoa(KhachHangDTO khachHangDTO) throws Exception {
        boolean result = false;
        session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.delete(khachHangDTO); // xóa đối tượng KhachHangDTO khỏi database

            transaction.commit(); // commit transaction
            result = true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // rollback transaction nếu có lỗi xảy ra
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }

    /**
     * Sửa một Khách hàng có trong CSDL
     * 
     * @param khachHangDTO
     * @return
     * @throws Exception
     */
    public boolean sua(KhachHangDTO khachHangDTO) throws Exception {
        boolean result = false;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.update(khachHangDTO); // sửa thông tin đối tượng KhachHangDTO trong database

            transaction.commit(); // commit transaction
            result = true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // rollback transaction nếu có lỗi xảy ra
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }

    
    public KhachHangDTO tim(String keyword) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query<KhachHangDTO> query = session.createQuery("FROM KhachHangDTO WHERE MaKH = :keyword OR TenSP LIKE :searchKeyword", KhachHangDTO.class);
        query.setParameter("keyword", keyword);
        query.setParameter("searchKeyword", "%" + keyword + "%");
        
        KhachHangDTO sanPham = query.uniqueResult();
        
        session.getTransaction().commit();
        return sanPham;
    }
}
