package spring.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import spring.assmbler.Assembler;
import spring.ChangePasswordService;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;

public class MainForAssembler { // Assembler 조립기

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in)); // 메서드를 이용해서 콘솔에 한 줄 입력한다.
            while (true) {
                System.out.println("명령어를 입력하세요:");
                String command = reader.readLine(); // exit 문자열을 입력하면 종료
            if (command.equalsIgnoreCase("exit")) { // equalsIgnoreCase : 대소문자 구별하지 않아.
                System.out.println("종료합니다");
                break;
            }
            if (command.startsWith("new ")) {
                processNewCommand(command.split(" ")); // processNewCommand 메서드 실행 new 뒤에 공백문자있어어////
                continue;
            } else if (command.startsWith("change ")) {
                processChangeCommand(command.split(" "));// processChangeCommand 메서드 실행, Change 뒤에 공백문자있어
                continue;
            }
            printHelp(); // 명령어를 잘못 입력했다면 printHelp() 메서드를 실행한다.
        }
    }
    private static Assembler assembler = new Assembler(); // Assembler의 객체 생성, 자신이 생성하고 조립한 객체를 리턴하는 메서드 제공.
    // 제공하는 메서드를 이용해서 필요한 객체를 구하고 그 객체를 사용하는 것은 전형적인 Assmbler 사용법
    private static void printHelp() {
        System.out.println();
        System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
        System.out.println("명령어 사용법:");
        System.out.println("new 이메일 이름 암호 암호확인");
        System.out.println("change 이메일 현재비번 변경비번");
        System.out.println();
    }



    private static void processNewCommand(String[] arg) {// 새로운 회원 정보를 생성한다
        if (arg.length != 5) {
            printHelp();
            return;
        }
        MemberRegisterService regSvc = assembler.getMemberRegisterService();
        RegisterRequest req = new RegisterRequest();
        req.setEmail(arg[1]);
        req.setName(arg[2]);
        req.setPassword(arg[3]);
        req.setConfirmPassword(arg[4]);

        if (!req.isPasswordEqualToConfirmPassword()) {
            System.out.println("암호와 확인이 일치하지 않습니다.\n");
            return;
        }
    }

    private static void processChangeCommand(String[] arg) {
        if (arg.length != 4) {
            printHelp();
            return;
        }
        ChangePasswordService changePwdSvc =
                assembler.getChangePasswordService();
        try {
            changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
            System.out.println("암호를 변경했습니다.\n");
        } catch (MemberNotFoundException e) {
            System.out.println("존재하지 않는 이메일입니다.\n");
        } catch (WrongIdPasswordException e) {
            System.out.println("이메일과 암호가 일치하지 않습니다.\n");
        }
    }
}



