package exam;

//원격저장소 : github 
//

//Scanner 이용한 명령어 프로그램 만들기2 - 게시판
//명령어help를 실행싵켰을 때
//수행가능한 명령어 목록 조회

import java.util.Scanner;

public class exam{
	public static void main(String[] args){

		  Scanner sc = new Scanner(System.in);
		    //String title = ""; //1개의 게시물 밖에 저장하지 못하는 한계점 >> 배열로 change
		    //String body = "";

		    //<배열 선언> - 복수형으로 이름을 변경한다.
		    String[] titles = new String[10];
		    String[] bodies = new String[10];
		    int lastIndex = 0; //전역변수로 사용해야 한다.
  
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
        System.out.println("add : 게시물 등록"); 
        System.out.println("list : 게시물 목록");  
    } else if(s1.equals("add")){
        System.out.println("제목을 입력해주세요:");
        titles[lastIndex] = sc.nextLine(); //sc.nextInt()도 가능하다 But nextLine으로 통일
        //배열 안에 변수명을 사용해야 한다.
        
        System.out.println("내용을 입력해주세요:");
        bodies[lastIndex] = sc.nextLine();
        //tile과 body에 내용들을 저장했다.
        lastIndex++; //배열 안 변수 증가하도록 한다.

      } else if(s1.equals("list")){
        for(int i = 0; i < lastIndex; i++){ //@@for문의 범위는 lastIndex의 개수로 한다.
          System.out.println("제목: " + titles[i]);
          System.out.println("내용: " + bodies[i]);
          System.out.println("====SPACE====");
        }
        //위 else if 범위와 지금 else if범위가 다르기 때문에(지역변수 한계점) >> 전역 변수를 사용하도록 한다.
        
      } else{ //주어진 조건이 모두 아니면!
      System.out.println("올바른 명령어가 아닙니다.");
    }
  }
}
}
