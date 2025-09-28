# 📘 BÀI TẬP THỰC HÀNH DEMO SECURING-WEB

## I. THÔNG TIN SINH VIÊN

- **Họ và tên:** Đinh Tiến Hùng
- **Mã số sinh viên:** 23020538
- **Lớp:** 2526I_INT3236E_1
---

## II. THÔNG TIN BÀI TẬP

- **Tên môn học:** Phát triển ứng dụng doanh nghiệp
- **Tên bài thực hành:** Xây dựng ứng dụng Web an toàn với Spring Security
- **Giảng viên hướng dẫn:** Lê Hồng Hải

---

## III. MÔ TẢ DỰ ÁN

Đây là một ứng dụng web được xây dựng bằng Spring Boot, minh họa các khái niệm về bảo mật trong phát triển phần mềm. Ứng
dụng cho phép người dùng đăng nhập và phân quyền truy cập dựa trên vai trò (**USER** và **ADMIN**).

### Công nghệ sử dụng

- **Backend:** Java 17, Spring Boot, Spring Security, Spring Data JPA
- **Frontend:** Thymeleaf, HTML, CSS
- **Database:** MySQL
- **Build Tool:** Maven

### Các chức năng chính

- **Xác thực người dùng:** Người dùng cần đăng nhập bằng username và password để truy cập các trang được bảo vệ.
- **Lưu trữ thông tin trong CSDL:** Thông tin tài khoản (username, password đã mã hóa, vai trò) được lưu trữ trong
  MySQL.
- **Phân quyền dựa trên vai trò (Role-Based Access Control):**
    - Người dùng có vai trò **USER** có thể truy cập các trang thông thường.
    - Người dùng có vai trò **ADMIN** có thể truy cập cả các trang thông thường **và** trang quản trị đặc biệt (
      `/admin`).
- **Mã hóa mật khẩu:** Mật khẩu được mã hóa bằng thuật toán **BCrypt** trước khi lưu.

---

## IV. HÌNH ẢNH DỰ ÁN

### 1. Trang chủ

<img width="1001" height="556" alt="image" src="https://github.com/user-attachments/assets/8f531154-89ac-498f-8d6d-943c36743fee" />


### 2. Trang đăng nhập

<img width="770" height="510" alt="image" src="https://github.com/user-attachments/assets/327595c0-fab0-40ed-b0bb-debeb6ae96ca" />



### 3. Trang người dùng

<img width="1904" height="520" alt="image" src="https://github.com/user-attachments/assets/9ff90b4c-da94-483f-9d49-b48a66e1aaf8" />

### 4. Trang quản trị (chỉ dành cho ADMIN)

<img width="1854" height="458" alt="image" src="https://github.com/user-attachments/assets/6f452208-75bf-43cc-b573-5565b103b46e" />


## V. TÀI KHOẢN DEMO

Khi ứng dụng khởi động lần đầu, các tài khoản mặc định được tạo sẵn:

### 👤 User

- `Username: user1` / `Password: pass123`
- `Username: user2` / `Password: pass456`

### 👑 Admin

- `Username: admin1` / `Password: adminpass1`
- `Username: admin2` / `Password: adminpass2`  
