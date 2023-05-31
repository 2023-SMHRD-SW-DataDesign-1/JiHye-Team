package View;

import java.util.Scanner;

import Controller.EasyMusicController;
import Controller.HardMusicController;
import Controller.NormalMusicController;
import Controller.ScoreController;
import Controller.joinController;
import Controller.loginController;
//github.com/2023-SMHRD-SW-DataDesign-1/JiHye-Team.git
import MemberDTO.memberDTO;
import javazoom.jl.player.MP3Player;
import memberDAO.memberDAO;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		while (true) {
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			mp3.play("music/로비BGM.mp3");
			System.out.println("........ ............. :;.........................");
			System.out.println(".......~#$$#-  ........*=.........................");
			System.out.println("......!,. .-:;!.... .,*:!.........................");
			System.out.println(".....!      -,~*;--~!!~::.........................");
			System.out.println(".....:       ,,,,,,,,.~::. .......................");
			System.out.println(".....:        .......,:~=.........................");
			System.out.println(".....:        .......-:~*.........................");
			System.out.println(".....;      ,-......-:~!..........................");
			System.out.println(".....;,    .~:~-,,-~:~-;..........................");
			System.out.println("..... =,  .-~~~~~~~~-:*...........................");
			System.out.println("......~~....,$------*: ..,,,......................");
			System.out.println("......,*,....~*;!!;#!;*!;:~:;!!;;.................");
			System.out.println(".......;-....,!~~=!::~--,,,,...--=;-,.............");
			System.out.println("....... ;.....,;,  ..,,,,,.....,.~!-,-*!..........");
			System.out.println("........;,....         .,.......-,  ...,!. .......");
			System.out.println(".........!..          ..--,.....,    ....!........");
			System.out.println(".......  =          :..   .:...-     ....~........");
			System.out.println("....... !.       ,..        ~..~    ..... =.......");
			System.out.println(".......*,      .-            -.,     ...  *.......");
			System.out.println("..... ~.     .-              -.-   .....  ~,......");
			System.out.println(".....~~    .,        !@=      ~~   .....  ~,......");
			System.out.println(".....:    -,         @@ .     .-   ....   !.......");
			System.out.println("....:.   ~           =@.       ,-   ...   #.......");
			System.out.println("....!  -,            ,@=-;     --.  ...  ~,.......");
			System.out.println("...~  -               #@@@,     ~;.. ...,;........");
			System.out.println(".. ; -.               :@@@!     -,::.. -!.........");
			System.out.println("...!..                 $@@@     ,--:;!!!-.........");
			System.out.println("...~;                  :@#$=     :,~::::,.........");
			System.out.println("..~,.  .                =:~=     !~::::~..........");
			System.out.println("..;,  !@;               .!*~     ;~:::~*..........");
			System.out.println("..;.  $=                         :::::~=..........");
			System.out.println(". !,. ~# .                       ;:::~;...........");
			System.out.println(":,~~ ,@!*           .-          !::~-;...........");
			System.out.println(".$ ..  #@@-        .;:~,         ::~-;,...........");
			System.out.println(",. . . -@@@      ,::~---        -:~-~~............");
			System.out.println("-   ,.  $#=~    -;:-----        ~~~;;.............");
			System.out.println(",~  -,  ~;:~    --.--,-,       .:~:;     .........");
			System.out.println(".$...,,  -~     -, ,,.        .~~=~..,,,..........");
			System.out.println(".$...,,  -~     -, ,,.        .~~=~..,,,..........");
			System.out.println(".,~..-,         ,,     .     .~;$;!**!!!!**::.....");
			System.out.println("..:~..::         .   ..     .;=~--~:::::::::;$-. .");
			System.out.println("....-~!~-          .      ,;:----~::::::::::::!;..");
			System.out.println(".......;;-             --;:::----::::::::::::~,;,.");
			System.out.println("....... ;!!.       ..:--*~:::~--:~::::::::::~  .#.");
			System.out.println(".........,-=$=!;*$!,.....!:::;-:$=~~~:::::~.    ~-");
			System.out.println("................~!.......,;:::=...;!*-          -~");
			System.out.println("...............~~:........!::::,.....**,        ;-");
			System.out.println("............ .!:-~  ......;:::~-......,~*.     ,*.");
			System.out.println("...........,:*:::~     ...!::~:;........-*!-..~! .");
			System.out.println(".........,$:. ,:~:     ..~::~.:$...........!##~...");
			System.out.println(".........=   .~:=--   ..-;::, ~* .................");
			System.out.println(".........-*!!*:!!. ~---;:::~  ~:, ................");
			System.out.println("............ ..=--  .~:::~,   ~~: ................");
			System.out.println("..............;,  ,,:-. .    ~!~!.................");
			System.out.println("............,;~       .,-----,-.:.................");
			System.out.println("............=                 -,-.................");
			System.out.println("...........!.                  -~ ................");
			System.out.println(".........,*                    -:.................");
			System.out.println(".........*       ,!#!~--,,     ,; ................");
			System.out.println("........:.     ,=:,..-~~~!,    ,~.................");
			System.out.println("........;  ..~;!..........!     -~................");
			System.out.println(".......,~--,$~............;-    -$................");
			System.out.println("....... ;*~-...............*.   -*................");
			System.out.println("...........................,;   ,~................");
			System.out.println("............................::  .,,...............");
			System.out.println(".............................;, ,--...............");
			System.out.println("..............................*~---...............");
			System.out.println("...............................=#!................");
			System.out.println("..............................,...................");
			System.out.println("==================================================");
			System.out.println("         알쏭달쏭 뮤직배틀에 오신것을 환영합니다.          ");
			System.out.print(" [0] 룰설명 [1] 회원가입 [2] 게임시작 [3] 랭킹확인 [4] 종료 >> ");
			int select = sc.nextInt();
			if (select == 0) {// 룰 설명

			} else if (select == 1) { // 회원가입
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				memberDTO memdto = new memberDTO(id, pw);
				joinController join = new joinController();
				join.Join(memdto);

			} else if (select == 2) { // 게임 시작

				System.out.print("난이도 선택 [1] Easy   [2] Normal   [3] Hard >> ");
				int choice = sc.nextInt();

				if (choice == 1) {// 이지난이도
					EasyMusicController easy = new EasyMusicController();
					int score = easy.EasyPlay();

					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();

					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);
				} else if (choice == 2) {// 노말난이도

					NormalMusicController normal = new NormalMusicController();
					int score = normal.NormalPlay();

					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();

					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);

				} else if (choice == 3) {// 하드난이도

					HardMusicController hard = new HardMusicController();
					int score = hard.HardPlay();

					System.out.println("아이디 입력 : ");
					String id = sc.next();
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();

					ScoreController scocon = new ScoreController();
					String result = scocon.hardScoreController(new memberDTO(id, pw), score);
					System.out.println(result);

				}else {
					System.out.println("잘못입력하셨습니다. 로비로 돌아갑니다!");
				}

			} else if (select == 3) {// 랭킹확인
				String result = null;
				System.out.println("랭킹확인!");
				memberDAO dao = new memberDAO();
				dao.Rankingck();
				System.out.println(result);

			} else if (select == 4) { // 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		} // while
	}// main

}// class