import java.util.ArrayList;
import java.util.Scanner;
public class Controller {
    UserService service;
    ArrayList<User> listUser;
    Scanner sc;

    public Controller() {
        service = new UserService();
        listUser = service.getAllUser();
        sc = new Scanner(System.in);
    }

    public void main(){
        while (true){
            Util.DefaultMenu();
            System.out.println("Lựa chọn của bạn là: ");
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1:
                    LogIn();
                    break;
                case 2:
                    User newUser = createNewUser();
                    service.addNewUser(listUser, newUser);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    };


    public User LogIn() {
        int count = 0;
        while (true) {
            System.out.println("Nhập username: ");
            String username = sc.nextLine();
            for (User s : listUser) {
                if (s.getUsername() == username) {
                    System.out.println("Username tồn tại");
                    System.out.println("Nhập password: ");
                    String pass = sc.nextLine();
                    if (s.getPass() == pass) {
                        System.out.println("Đăng nhập thành công");
//                        Menu thành công
                    } else {
                        Util.WrongPassMenu();
                        System.out.println("Lựa chọn của bạn là: ");
                        int choose = Integer.parseInt(sc.nextLine());

                        switch (choose) {
                            case 1:
                                LogIn();
                                break;
                            case 2:
                                System.out.println("Điền email của bạn: ");
                                String email = sc.nextLine();
                                if (s.getEmail() == email) {
                                    System.out.println("Email chính xác");
                                    System.out.println("Nhập password mới: ");
                                    String newPass = sc.nextLine();
                                    s.setPass(newPass);
                                    LogIn();
                                } else {
                                    System.out.println("Chưa tồn tại tài khoản");
                                }
                                break;

                        }

                    }

                }
                else {
                    break;
                }
            }
            System.out.println("Kiểm tra lại username");
            count++;
            if (count == 10) {
                break;
            }
        }
        return null;
    }



    public User createNewUser(){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập password: ");
        String pass = sc.nextLine();
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        User newUser = new User(id,email,pass,username);
        return newUser;
    }


 }
