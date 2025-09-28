package com.example.securingweb;

import com.example.securingweb.user.Role;
import com.example.securingweb.user.User;
import com.example.securingweb.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecuringWebApplication {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(SecuringWebApplication.class, args);
    }

    // Bean này sẽ tự động chạy khi ứng dụng khởi động
    // để tạo dữ liệu mẫu trong CSDL.
    @Bean
    CommandLineRunner run(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Chỉ tạo user nếu chưa tồn tại để tránh lỗi trùng lặp khi khởi động lại

            // --- TẠO 2 TÀI KHOẢN USER ---
            if (userRepository.findByUsername("user1") == null) {
                User user = new User();
                user.setUsername("user1");
                user.setPassword(passwordEncoder.encode("pass123"));
                user.addRole(new Role("USER"));
                userRepository.save(user);
            }

            if (userRepository.findByUsername("user2") == null) {
                User user = new User();
                user.setUsername("user2");
                user.setPassword(passwordEncoder.encode("pass456"));
                user.addRole(new Role("USER"));
                userRepository.save(user);
            }

            // --- TẠO 2 TÀI KHOẢN ADMIN ---
            if (userRepository.findByUsername("admin1") == null) {
                User admin = new User();
                admin.setUsername("admin1");
                admin.setPassword(passwordEncoder.encode("adminpass1"));
                admin.addRole(new Role("ADMIN"));
                admin.addRole(new Role("USER")); // Admin cũng có vai trò USER
                userRepository.save(admin);
            }

            if (userRepository.findByUsername("admin2") == null) {
                User admin = new User();
                admin.setUsername("admin2");
                admin.setPassword(passwordEncoder.encode("adminpass2"));
                admin.addRole(new Role("ADMIN"));
                admin.addRole(new Role("USER"));
                userRepository.save(admin);
            }
        };
    }
}

