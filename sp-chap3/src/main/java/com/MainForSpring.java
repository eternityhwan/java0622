package com;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppCtx;

public class MainForSpring {

    private static ApplicationContext ctx = null;

    public static void main(String[] args) throws IOException { // throws IOException 예외가 발생하면 해당 클래스를 벗어난다.
        ctx = new AnnotationConfigApplicationContext(/AppCtx.class); // AnnotationConfigApplicationContext 사용 스프링 컨테이너 생성.

//        BufferedReader reader = // BufferedReader 이름처럼 버퍼를 이용해서 읽고 스는 함수, Scanner 와 유사한 함수 Scanner보다 빠름. 엔터만 경계로 인식
//                new BufferedReader(new InputStreamReader(System.in)); // System.in이 InputStream 타입의 필드.
//        while (true) {
//            System.out.println("명령어를 입력하세요:");
//            String command = reader.readLine();
//            if (command.equalsIgnoreCase("exit")) {
//                System.out.println("종료합니다.");
//                break;
//            }
//            if (command.startsWith("new ")) {
//                processNewCommand(command.split(" "));
//                continue;
//            } else if (command.startsWith("change ")) {
//                processChangeCommand(command.split(" "));
//                continue;
//            }
//            printHelp();
//        }
    }

//    private static void processNewCommand(String[] arg) {
//        if (arg.length != 5) {
//            printHelp();
//            return;
//        }
//
//        MemberRegisterService regSvc =
//                ctx.getBean("memberRegSvc", MemberRegisterService.class); // 컨테이너이름이 memberRegSvc인 빈 객체를 구한다. Bean은 AppCtx 클래스에 있어
//        RegisterRequest req = new RegisterRequest(); // 스프링컨테이너(ctx)로부터 이름이 memberRegSvc인 빈 객체를 구한다,
//        req.setEmail(arg[1]);
//        req.setName(arg[2]);
//        req.setPassword(arg[3]);
//        req.setConfirmPassword(arg[4]);
//
//        if (!req.isPasswordEqualToConfirmPassword()) {
//            System.out.println("암호와 확인이 일치하지 않습니다.\n");
//            return;
//        }
//        try {
//            regSvc.regist(req);
//            System.out.println("등록했습니다.\n");
//        } catch (DuplicateMemberException e) {
//            System.out.println("이미 존재하는 이메일입니다.\n");
//        }
//    }
//
//    private static void processChangeCommand(String[] arg) {
//        if (arg.length != 4) {
//            printHelp();
//            return;
//        }
//        ChangePasswordService changePwdSvc =
//                ctx.getBean("changePwdSvc", ChangePasswordService.class);
//        try {
//            changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
//            System.out.println("암호를 변경했습니다.\n");
//        } catch (MemberNotFoundException e) {
//            System.out.println("존재하지 않는 이메일입니다.\n");
//        } catch (WrongIdPasswordException e) {
//            System.out.println("이메일과 암호가 일치하지 않습니다.\n");
//        }
//    }
//
//    private static void printHelp() {
//        System.out.println();
//        System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
//        System.out.println("명령어 사용법:");
//        System.out.println("new 이메일 이름 암호 암호확인");
//        System.out.println("change 이메일 현재비번 변경비번");
//        System.out.println();
//    }
//
//    private static void processListCommand() {
//        MemberListPrinter listPrinter = ctx.getBean("listPrinter", MemberListPrinter.class);
//        listPrinter.printAll();
//    }
//
//    private static void processinfoCommand(String[] arg) {
//        if (arg.length != 2) {
//            printHelp();
//            return;
//        }
//    }
//}
//        MemberinfoPrinter infoPrinter =
//                ctx.getBean("infoPrinter", MemberinfoPrinter.class);
//        infoPrinter.printMemberinfo(arg[1]);
//    }
}