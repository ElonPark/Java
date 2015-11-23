import java.util.Scanner;

public class BlackJack {

    Scanner sc = new Scanner(System.in);
    saveClass savec = new saveClass();
    String del = "";
    String player = "";
    String name = "";
    int chip = 100;

    int hit = 0;
    int h = 0;
    int d = 0;
    int sl = 0;
    int bat = 0;
    Card card = new Card();

    void init() {

	bat = 0;
	System.out.println("현재 칩: " + chip + "개, 배팅할 칩 갯수는?");
	bat = sc.nextInt();
	chip -= bat;
	System.out.println("-----------------------");

    }

    void loop() {

	init();
	card.myRandom();
	System.out.println("카드 돌립니다.");
	System.out.println("카드 2장을 받았습니다\n");
	System.out.println("당신의 첫번째 카드는 " + card.Deck[0] + "입니다.");
	player = card.Deck[0];
	calP();
	System.out.println("당신의 두번째 카드는 " + card.Deck[1] + "입니다.\n");
	player = card.Deck[1];

	calP();
	System.out.println("딜러의 첫번째 카드는 [비공개]입니다.\n두번째 카드는 " + card.Deck[3] + "입니다");
	del = card.Deck[3];
	calD();
	del = card.Deck[2];
	calD();
	System.out.println("1.Hit , 2.Stay");
	hit = sc.nextInt();
	if (hit == 1) {
	    System.out.println("카드를 받았습니다");
	    System.out.println("당신의 세번째 카드는 " + card.Deck[4] + "입니다.");
	    player = card.Deck[4];
	    calP();
	    if (d < 17) {
		System.out.println("딜러의 세번째 카드는 " + card.Deck[6] + "입니다");
		del = card.Deck[6];
		calD();

	    }
	    if (h > 21) {
		result();
	    } else {
		System.out.println("1.Hit , 2.Stay");
		hit = sc.nextInt();
		if (hit == 1) {
		    System.out.println("카드를 받았습니다");
		    System.out.println("당신의 네번째 카드는 " + card.Deck[5] + "입니다.");
		    player = card.Deck[5];
		    calP();
		    if (d < 17) {
			System.out.println("딜러의 네번째 카드는 " + card.Deck[7] + "입니다");
			del = card.Deck[7];
			calD();
		    }
		    if (h < 21) {
			System.out.println("1.Hit , 2.Stay");
			hit = sc.nextInt();
			if (hit == 1) {
			    System.out.println("카드를 받았습니다");
			    System.out.println("당신의 다섯번째 카드는 " + card.Deck[8] + "입니다.");
			    player = card.Deck[8];
			    calP();
			    if (d < 17) {
				System.out.println("딜러의 다섯번째 카드는 " + card.Deck[9] + "입니다");
				del = card.Deck[9];
				calD();
			    }
			    if (h > 21) {
				result();
			    } else {
				System.out.println("1.Hit , 2.Stay");
				hit = sc.nextInt();
				if (hit == 1) {
				    System.out.println("카드를 받았습니다");
				    System.out.println("당신의 여섯번째 카드는 " + card.Deck[10] + "입니다.");
				    player = card.Deck[10];
				    calP();
				    if (d < 17) {
					System.out.println("딜러의 여섯번째 카드는 " + card.Deck[11] + "입니다");
					del = card.Deck[11];
					calD();
				    }
				    if (h > 21) {
					result();
				    }
				} else if (hit == 2) {
				    System.out.println("Stay를 선택하셨습니다.");
				    result();
				}
			    }
			} else
			    result();
		    }
		} else if (hit == 2) {
		    System.out.println("Stay를 선택하셨습니다.");
		    result();
		}

	    }
	} else if (hit == 2) {
	    System.out.println("Stay를 선택하셨습니다.");
	    result();

	}

	String appStr = Integer.toString(chip);
	savec.writeData(name, appStr);
    }

    void calP() {

	if (player == "A") {
	    System.out.println(card.Deck[1] + "입니다. 1또는 10을 선택하세요. 1= 1 , 2= 10 ");
	    sl = sc.nextInt();
	    if (sl == 1)
		h += 1;
	    else if (sl == 2)
		h += 10;
	} else if (player == "J" || player == "Q" || player == "K") {
	    h = h + 10;
	} else if (player != "A" || player != "J" || player != "Q" || player != "K") {
	    h = h + Integer.valueOf(player);
	}

    }

    void calD() {

	if (del == "A") {
	    if (d < 22)
		d += 10;
	    else
		d += 1;
	} else if (del == "J" || del == "Q" || del == "K") {
	    d += 10;
	} else if (del != "A" || del != "J" || del != "Q" || del != "K") {
	    d = d + Integer.valueOf(del);
	}

    }

    void result() {
	if (h < 21 && h > d) {
	    chip += bat * 2;
	    System.out.println("플레이어의 합은 " + h + "입니다");
	    System.out.println("딜러의 합은 " + d + "입니다");
	    System.out.println("플레이어의 승리입니다 칩을 두배로 받습니다. 칩: " + chip + "개");
	    System.out.println("Winner Winner Chicken Dinner!");

	} else if (h > 21) {
	    System.out.println("플레이어의 합은 " + h + "입니다");
	    del = card.Deck[2];
	    calD();
	    System.out.println("딜러의 첫번째 카드를 공개합니다\n첫번째 카드는 " + card.Deck[2] + "입니다");
	    System.out.println("딜러의 합은 " + d + "입니다");
	    System.out.println("플레이어가 패배했습니다.");

	    System.out.println("현재 칩: " + chip + "개");

	} else if (h < 21 && h == d) {
	    System.out.println("플레이어의 합은 " + h + "입니다");
	    del = card.Deck[2];
	    calD();
	    System.out.println("딜러의 첫번째 카드를 공개합니다\n첫번째 카드는 " + card.Deck[2] + "입니다");
	    System.out.println("딜러의 합은 " + d + "입니다");
	    System.out.println("플레이어가 패배했습니다.");

	    System.out.println("현재 칩: " + chip + "개");

	} else if (h == 21) {
	    chip += bat * 2;
	    System.out.println("Black Jack!!");
	    System.out.println("플레이어의 승리입니다 칩을 두배로 받습니다. 칩: " + chip + "개");
	    System.out.println("Winner Winner Chicken Dinner!");
	} else if (d == 21) {
	    System.out.println("Black Jack!!");
	    System.out.println("플레이어가 패배했습니다.");
	    System.out.println("딜러의 첫번째 카드를 공개합니다\n첫번째 카드는 " + card.Deck[2] + "입니다");
	    System.out.println("현재 칩: " + chip + "개");
	}

    }

    void start() {
	savec.readData();
	System.out.println("-----------------------");
	System.out.println("------블랙잭 시작!------");
	System.out.println("-----------------------");

	System.out.println("플레이어 이름을 입력하세요");
	name = sc.next();
	while (chip > 0) {
	    loop();
	}
	if (chip == 0) {
	    System.out.println("칩이 없어서 게임을 할 수 없습니다.");
	}

    }
}
