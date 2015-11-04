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
	System.out.println("���� Ĩ: " + chip + "��, ������ Ĩ ������?");
	bat = sc.nextInt();
	chip -= bat;
	System.out.println("-----------------------");

    }

    void loop() {

	init();
	card.myRandom();
	System.out.println("ī�� �����ϴ�.");
	System.out.println("ī�� 2���� �޾ҽ��ϴ�\n");
	System.out.println("����� ù��° ī��� " + card.Deck[0] + "�Դϴ�.");
	player = card.Deck[0];
	calP();
	System.out.println("����� �ι�° ī��� " + card.Deck[1] + "�Դϴ�.\n");
	player = card.Deck[1];

	calP();
	System.out.println("������ ù��° ī��� [�����]�Դϴ�.\n�ι�° ī��� " + card.Deck[3] + "�Դϴ�");
	del = card.Deck[3];
	calD();
	del = card.Deck[2];
	calD();
	System.out.println("1.Hit , 2.Stay");
	hit = sc.nextInt();
	if (hit == 1) {
	    System.out.println("ī�带 �޾ҽ��ϴ�");
	    System.out.println("����� ����° ī��� " + card.Deck[4] + "�Դϴ�.");
	    player = card.Deck[4];
	    calP();
	    if (d < 17) {
		System.out.println("������ ����° ī��� " + card.Deck[6] + "�Դϴ�");
		del = card.Deck[6];
		calD();

	    }
	    if (h > 21) {
		result();
	    } else {
		System.out.println("1.Hit , 2.Stay");
		hit = sc.nextInt();
		if (hit == 1) {
		    System.out.println("ī�带 �޾ҽ��ϴ�");
		    System.out.println("����� �׹�° ī��� " + card.Deck[5] + "�Դϴ�.");
		    player = card.Deck[5];
		    calP();
		    if (d < 17) {
			System.out.println("������ �׹�° ī��� " + card.Deck[7] + "�Դϴ�");
			del = card.Deck[7];
			calD();
		    }
		    if (h < 21) {
			System.out.println("1.Hit , 2.Stay");
			hit = sc.nextInt();
			if (hit == 1) {
			    System.out.println("ī�带 �޾ҽ��ϴ�");
			    System.out.println("����� �ټ���° ī��� " + card.Deck[8] + "�Դϴ�.");
			    player = card.Deck[8];
			    calP();
			    if (d < 17) {
				System.out.println("������ �ټ���° ī��� " + card.Deck[9] + "�Դϴ�");
				del = card.Deck[9];
				calD();
			    }
			    if (h > 21) {
				result();
			    } else {
				System.out.println("1.Hit , 2.Stay");
				hit = sc.nextInt();
				if (hit == 1) {
				    System.out.println("ī�带 �޾ҽ��ϴ�");
				    System.out.println("����� ������° ī��� " + card.Deck[10] + "�Դϴ�.");
				    player = card.Deck[10];
				    calP();
				    if (d < 17) {
					System.out.println("������ ������° ī��� " + card.Deck[11] + "�Դϴ�");
					del = card.Deck[11];
					calD();
				    }
				    if (h > 21) {
					result();
				    }
				} else if (hit == 2) {
				    System.out.println("Stay�� �����ϼ̽��ϴ�.");
				    result();
				}
			    }
			} else
			    result();
		    }
		} else if (hit == 2) {
		    System.out.println("Stay�� �����ϼ̽��ϴ�.");
		    result();
		}

	    }
	} else if (hit == 2) {
	    System.out.println("Stay�� �����ϼ̽��ϴ�.");
	    result();

	}

	String appStr = Integer.toString(chip);
	savec.writeData(name, appStr);
    }

    void calP() {

	if (player == "A") {
	    System.out.println(card.Deck[1] + "�Դϴ�. 1�Ǵ� 10�� �����ϼ���. 1= 1 , 2= 10 ");
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
	    System.out.println("�÷��̾��� ���� " + h + "�Դϴ�");
	    System.out.println("������ ���� " + d + "�Դϴ�");
	    System.out.println("�÷��̾��� �¸��Դϴ� Ĩ�� �ι�� �޽��ϴ�. Ĩ: " + chip + "��");
	    System.out.println("Winner Winner Chicken Dinner!");

	} else if (h > 21) {
	    System.out.println("�÷��̾��� ���� " + h + "�Դϴ�");
	    del = card.Deck[2];
	    calD();
	    System.out.println("������ ù��° ī�带 �����մϴ�\nù��° ī��� " + card.Deck[2] + "�Դϴ�");
	    System.out.println("������ ���� " + d + "�Դϴ�");
	    System.out.println("�÷��̾ �й��߽��ϴ�.");

	    System.out.println("���� Ĩ: " + chip + "��");

	} else if (h < 21 && h == d) {
	    System.out.println("�÷��̾��� ���� " + h + "�Դϴ�");
	    del = card.Deck[2];
	    calD();
	    System.out.println("������ ù��° ī�带 �����մϴ�\nù��° ī��� " + card.Deck[2] + "�Դϴ�");
	    System.out.println("������ ���� " + d + "�Դϴ�");
	    System.out.println("�÷��̾ �й��߽��ϴ�.");

	    System.out.println("���� Ĩ: " + chip + "��");

	} else if (h == 21) {
	    chip += bat * 2;
	    System.out.println("Black Jack!!");
	    System.out.println("�÷��̾��� �¸��Դϴ� Ĩ�� �ι�� �޽��ϴ�. Ĩ: " + chip + "��");
	    System.out.println("Winner Winner Chicken Dinner!");
	} else if (d == 21) {
	    System.out.println("Black Jack!!");
	    System.out.println("�÷��̾ �й��߽��ϴ�.");
	    System.out.println("������ ù��° ī�带 �����մϴ�\nù��° ī��� " + card.Deck[2] + "�Դϴ�");
	    System.out.println("���� Ĩ: " + chip + "��");
	}

    }

    void start() {
	savec.readData();
	System.out.println("-----------------------");
	System.out.println("------���� ����!------");
	System.out.println("-----------------------");

	System.out.println("�÷��̾� �̸��� �Է��ϼ���");
	name = sc.next();
	while (chip > 0) {
	    loop();
	}
	if (chip == 0) {
	    System.out.println("Ĩ�� ��� ������ �� �� �����ϴ�.");
	}

    }
}
