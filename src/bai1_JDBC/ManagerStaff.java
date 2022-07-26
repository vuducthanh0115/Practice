package bai1;

import java.sql.*;
import java.util.Scanner;

public class ManagerStaff {
    static void showResult(ResultSet result) throws SQLException {
        int count = 0;
        while (result.next()) {
            count++;
            int id = result.getInt("id");
            int officer_id = result.getInt("officer_id");

            String staff_name = result.getString("staff_name");
            //String officer_name = result.getString("officer_name");
            int age = result.getInt("age");
            int tmp = result.getInt("gender");
            String gender = "";
            if (tmp == 1) {
                gender = "Nam";
            } else {
                gender = "Nữ";
            }

            String address = result.getString("address");
            String specialized_att = result.getString("specialized_att");
            System.out.println("\n---Kết quả---" + count + "\n" + "ID: " + id + " ---" + "Mã cán bộ: " + officer_id + " ---" + "Tên: " + staff_name + " ---" + "Tuổi: " + age + " " + "Giới tính: " + gender + " ---" + "Địa chỉ: " + address + " ---" +  "Thuộc tính riêng: " + specialized_att);

        }
        if (count == 0) {
            System.out.println("Không tìm thấy\n");
        } else {
            System.out.println("---------Số kết quả tìm thấy--------\n" + "---------\t\t" + count + "\t\t\t--------");
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
        if (conn != null) {
            System.out.println("Kết nối thành công");
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    ------MENU------
                    1.Thêm cán bộ mới
                    2.Tìm kiếm cán bộ theo tên
                    3.Danh sách cán bộ
                    4.Xoá nhân viên theo ID
                    5.Tìm kiếm theo loại cán bộ
                    6.Hiện thị cán bộ có tuổi lớn hơn X(tuổi)
                    7.Sửa thông tin cán bộ theo ID
                    8.Độ tuổi trung bình của các cán bộ
                    0.Thoát""");
            System.out.print("Mời bạn nhập lựa chọn : ");
            int chose = scanner.nextInt();
            scanner.nextLine();

            switch (chose) {
                case 1 -> {
                    String sqlInsert = "insert into bai1.staff(officer_id, staff_name, age, gender, address, specialized_att)\n" + "values(?, ?, ?, ?, ?, ?);";
                    /*String sqlInsert2 = "insert into bai1.staff2(officer_id, staff_name, age, gender, address, specialized_att)\n" + "values(?, ?, ?, ?, ?, ?);";*/
                    try {
                        conn.setAutoCommit(false);
                        PreparedStatement prepareStatement = conn.prepareStatement(sqlInsert);
                        /*PreparedStatement prepareStatement2 = conn.prepareStatement(sqlInsert2);*/
                        int officer_id = 1;
                        System.out.print("""
                                Loại cán bộ
                                1.Công nhân
                                2.Kỹ sư
                                3.Nhân viên
                                Hãy chọn loại cán bộ bạn muốn thêm 1->3 :
                                """);
                        do {
                            officer_id = scanner.nextInt();
                            scanner.nextLine();
                            if (officer_id > 3 || officer_id < 1) {
                                System.out.println("Xin hãy nhập đúng lựa chọn 1->3:");
                            }
                        } while (officer_id > 3 || officer_id < 1);

                        System.out.print("Tên : ");
                        String name = scanner.nextLine();
                        System.out.print("Tuổi : ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("""
                                Giới tính 
                                -- 1.Nam --
                                -- 0.Nữ  --
                                """);
                        int gender = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Địa chỉ : ");
                        String address = scanner.nextLine();
                        String specialized_att = "";
                        switch (officer_id) {
                            case 1 -> {
                                System.out.print("Bậc 1->10 : ");
                                specialized_att = scanner.nextLine();
                            }
                            case 2 -> {
                                System.out.print("Chuyên ngành đào tạo : ");
                                specialized_att = scanner.nextLine();
                            }
                            case 3 -> {
                                System.out.print("Công việc : ");
                                specialized_att = scanner.nextLine();
                            }
                            default -> System.out.println("Hãy nhập đúng lựa chọn");
                        }
                        prepareStatement.setInt(1, officer_id);
                        prepareStatement.setString(2, name);
                        prepareStatement.setInt(3, age);
                        prepareStatement.setInt(4, gender);
                        prepareStatement.setString(5, address);
                        prepareStatement.setString(6, specialized_att);
                        prepareStatement.executeUpdate();
                        System.out.println("Thêm thành công vào bảng staff");

                        /*prepareStatement2.setInt(1, officer_id);
                        prepareStatement2.setString(2, name);
                        prepareStatement2.setInt(3, age);
                        prepareStatement2.setInt(4, gender);
                        prepareStatement2.setString(5, address);
                        prepareStatement2.setString(6, specialized_att);
                        prepareStatement2.executeUpdate();
                        System.out.println("Thêm thành công thành vào bảng staff2");

                        System.out.println(prepareStatement2.executeUpdate());*/
                        conn.commit();
                        prepareStatement.close();
                    } catch (SQLException e) {
                        conn.rollback();
                        System.out.println("Rollback");
                    }
                    System.out.println("");
                }
                case 2 -> {
                    /*String sqlSelect = "select * from bai1.staff\n" +
                            "where staff_name like (%?%);";
                    try {
                        PreparedStatement prepareStatement = conn.prepareStatement(sqlSelect);
                        System.out.print("Tên cần tìm kiếm : ");
                        String nameSearch = scanner.nextLine();
                        prepareStatement.setString(1, nameSearch);
                        ResultSet result = prepareStatement.executeQuery();
                        if(result !=null){
                            showResult(result);
                        }else{
                            System.out.println("Không có tên này");
                        }
                        prepareStatement.close();
                    } catch (SQLException e) {
                        System.out.println("Lỗi SQL");
                    }
                    System.out.println("");*/

                    String sqlCall = "{call bai1.find_name(?)}";
                    try {
                        CallableStatement callable = conn.prepareCall(sqlCall);
                        System.out.println("Nhập vào tên bạn muốn tìm : ");
                        String name = scanner.nextLine();
                        callable.setString(1, name);
                        ResultSet result = callable.executeQuery();
                        showResult(result);
                        callable.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("Lỗi cú pháp");
                    }
                    System.out.println("");
                }
                case 3 -> {
                    try {
                        Statement statement = conn.createStatement();
                        ResultSet result = statement.executeQuery("select staff.*, officer.officer_name from bai1.staff\n" + "join bai1.officer on staff.officer_id = officer.id;");
                        showResult(result);
                        statement.close();
                    } catch (SQLException e) {
                        System.out.println("Lỗi cú pháp");
                    }
                    System.out.println("");
                }
                case 4 -> {
                    conn.setAutoCommit(false);
                    String sqlDelete = "delete from bai1.staff\n" + "where id = ?;";
                    String sqlDelete2 = "delete from bai1.staff\n" + "where id = ?;";
                    String sqlDelete3 = "delete from bai1.staff2\n" + "where id = ?;";
                    Savepoint savepoint1 = null;
                    try {

                        PreparedStatement prepareStatement = conn.prepareStatement(sqlDelete);
                        PreparedStatement prepareStatement2 = conn.prepareStatement(sqlDelete2);
                        PreparedStatement prepareStatement3 = conn.prepareStatement(sqlDelete3);
                        System.out.println("Nhập id người cần xoá : ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        prepareStatement.setInt(1, id);
                        prepareStatement2.setInt(1, 2);
                        prepareStatement3.setInt(1, id);
                        int result = prepareStatement.executeUpdate();
                        savepoint1 = conn.setSavepoint("Đã xoá thằng ID nhập vào ở staff");
                        int result2 = prepareStatement2.executeUpdate();
                        int result3 = prepareStatement3.executeUpdate();
                        //conn.rollback(savepoint1);
                        if (result > 0) {
                            System.out.println("Xoá thành công 1");
                        } else {
                            System.out.println("Xoá thất bại 1");
                        }
                        prepareStatement.close();

                    } catch (SQLException e) {
                        conn.rollback(savepoint1);
                        System.out.println("Rollback");
                    }
                    System.out.println("");
                }
                case 5 -> {
                    String sqlSelect = "select staff.*, officer.officer_name from bai1.staff\n" + "join bai1.officer on staff.officer_id = officer.id\n" + "where officer_id = (?);";
                    try {
                        PreparedStatement prepareStatement = conn.prepareStatement(sqlSelect);
                        System.out.print("""
                                Loại cán bộ cần tìm kiếm
                                ------ 1.Công nhân -----
                                ------ 2.Kỹ sư     -----
                                ------ 3.Nhân viên -----
                                Mời nhập lựa chọn 1 -> 3 :
                                """);
                        int officerName = scanner.nextInt();
                        scanner.nextLine();
                        prepareStatement.setInt(1, officerName);
                        ResultSet result = prepareStatement.executeQuery();
                        showResult(result);

                        prepareStatement.close();
                    } catch (SQLException e) {
                        System.out.println("Lỗi SQL");
                    }
                    System.out.println("");
                }
                case 6 -> {
                    String sqlSelect = "select staff.*, officer.officer_name from bai1.staff\n" + "join bai1.officer on staff.officer_id = officer.id\n" + "where age > (?);";
                    try {
                        PreparedStatement prepareStatement = conn.prepareStatement(sqlSelect);
                        System.out.print("""
                                Tìm cán bộ có tuổi > X
                                Nhập X(tuổi) :
                                """);
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        prepareStatement.setInt(1, age);
                        ResultSet result = prepareStatement.executeQuery();
                        showResult(result);

                        prepareStatement.close();
                    } catch (SQLException e) {
                        System.out.println("Lỗi SQL");
                    }
                    System.out.println("");
                }
                case 7 -> {
                    String sqlUpdate = "update bai1.staff\n" +
                            "set officer_id = ?, staff_name = ?, age = ?,gender= ?, address= ?, specialized_att = ?\n" +
                            "where id = ?;";
                    try {
                        PreparedStatement prepareStatement = conn.prepareStatement(sqlUpdate);
                        System.out.print("Nhập id cán bộ cần sửa : ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        int officer_id = 1;
                        System.out.print("""
                                Loại cán bộ
                                1.Công nhân
                                2.Kỹ sư
                                3.Nhân viên
                                Hãy chọn loại cán bộ bạn muốn thêm 1->3 :
                                """);
                        do {

                            officer_id = scanner.nextInt();
                            scanner.nextLine();
                            if (officer_id > 3 || officer_id < 1) {
                                System.out.println("Xin hãy nhập đúng lựa chọn 1->3:");
                            }
                        } while (officer_id > 3 || officer_id < 1);

                        System.out.print("Tên : ");
                        String name = scanner.nextLine();
                        System.out.print("Tuổi : ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("""
                                Giới tính 
                                -- 1.Nam --
                                -- 0.Nữ  --
                                """);
                        int gender = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Địa chỉ : ");
                        String address = scanner.nextLine();
                        String specialized_att = "";
                        switch (officer_id) {
                            case 1 -> {
                                System.out.print("Bậc 1->10 : ");
                                specialized_att = scanner.nextLine();
                            }
                            case 2 -> {
                                System.out.print("Chuyên ngành đào tạo : ");
                                specialized_att = scanner.nextLine();
                            }
                            case 3 -> {
                                System.out.print("Công việc : ");
                                specialized_att = scanner.nextLine();
                            }
                            default -> System.out.println("Hãy nhập đúng lựa chọn");
                        }


                        prepareStatement.setInt(1, officer_id);
                        prepareStatement.setString(2, name);
                        prepareStatement.setInt(3, age);
                        prepareStatement.setInt(4, gender);
                        prepareStatement.setString(5, address);
                        prepareStatement.setString(6, specialized_att);
                        prepareStatement.setInt(7, id);
                        prepareStatement.executeUpdate();

                        prepareStatement.close();
                    } catch (SQLException e) {
                        System.out.println("Lỗi SQL");
                    }
                    System.out.println("");
                }
                case 0 -> {
                    conn.close();
                    return;
                }
                default -> System.out.println("Nhập lại lựa chọn");
            }
        }

    }
}
