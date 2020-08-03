package exam;
//
//원격저장소 : github 
//

//Scanner 이용한 명령어 프로그램 만들기2 - 게시판
//명령어help를 실행싵켰을 때
//수행가능한 명령어 목록 조회

import java.util.Scanner;

public class exam{
	public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  
  while(true){ 
    System.out.println("명령어를 입력해주세요:");
    String s1 = sc.nextLine(); 
    System.out.println(s1);
  //<게시물 만들기>
  //else if를 통해 각각의 명령어 기능들을 추가
    if(s1.equals("exit")){ 
      System.out.println("프로그램 종료!");
      break;
    } else if(s1.equals("help")){//help 명령어 추가 및 help 도움말 출력하기
      System.out.println("exit : 프로그램 종료"); 
    } else if(s1.equals("add")){
      System.out.println("게시물 정보를 저장 : 제목, 내용");
      String s2 = sc.nextLine();
      System.out.println(s2);
    } else if(s1.equals("list")){
      System.out.println("저장된 게시물 목록 출력");
      
     
      
    } else{ //주어진 조건이 모두 아니면!
      System.out.println("올바른 명령어가 아닙니다.");
    }
  }
}
}
