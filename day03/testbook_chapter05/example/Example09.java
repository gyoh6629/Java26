package testbook_chapter05;

public class Example09 {

	public static void main(String[] args) {
		
		pangGame(5, 10, 0.3);
		
	}
	
	static void pangGame(int m, int n, double p) {
		//받은 행과 열 크기대로 배열 만들기
		boolean[][] board = new boolean[m][n];
		
		//받은 확률보다 작은 값이 나오면 그 자리에 true(지뢰) 저장
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(Math.random() < p) { // 0.0 ~ 0.99 . . . (15~17자) 더블타입 실수, 0은 나와도 1은 안나옴
					board[i][j] = true; // true만 넣어도 나머진 자동으로 false
				}
//				board[i][j] = false;	자바의 배열은 쓰레기값 대신 타입별 기본값( 0, 0.0, false )이 자동으로 저장됨
			}
		}
		
		//만든 배열 돌면서 지뢰면 * , 아니면 - 출력하고 행마다 한줄 내리기
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j]) {
					System.out.print("* ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//주변 8칸 탐색할 때 열(i)에 적용할 인덱스와 행(j)에 적용할 인덱스									확인 인덱스 = [i + i8][j + j8]
		//현재 위치의 인덱스가 a라고 할 때 주변 8칸은 		[	[1]	[2]	[3]	] 이렇게 있을 때 왼쪽 위부터 > 1. a인덱스([i][j])에서 열 -1(i8[0]) 행 -1(j8[0])
		int[] i8 = {-1, -1, -1, 0, 0, 1, 1, 1};	//	[	[4]	 a	[5]	]						 2. a인덱스([i][j])에서 열 -1(i8[1]) 행 0(j8[1]) 행은 0으로 이동 없이 제자리에서 열만 한 칸 위로						
		int[] j8 = {-1, 0, 1, -1, 1, -1, 0, 1};	//	[	[6]	[7]	[8]	]						 3. 		~			   i8[2]	  j8[2] 
												//											 4.			~				~			~ 	이렇게 8번 확인
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j]) {
					System.out.print("* ");
				}else {
					int count = 0;
					
					for(int k = 0; k < 8; k++) {
						int index = i + i8[k];
						int jndex = j + j8[k];
						
						if(index >= 0 && jndex >= 0 && index < m && jndex < n) { // 맵 벗어나지 않을 때
							if(board[index][jndex]) { // 주변 8칸(인덱스가 true면 지뢰임)이 지뢰라면 카운트 증가
								count++;
							}
						}
					}
					System.out.print(count + " ");
				}
			}
			System.out.println();
		}
		
	}
}
//
//
//public class MineSweeper {
//
//    public static void main(String[] args) {
//        // main에서는 반환값을 받는 대신 메서드를 실행하기만 함
//        printMineSweeper(5, 10, 0.3);
//    }
//
//    // 그때그때 화면에 바로 출력하므로 리턴 타입이 void
//    public static void printMineSweeper(int m, int n, double p) {
//
//        // 1. m x n 크기의 지뢰 맵 생성 및 p 확률로 지뢰 배치
//        boolean[][] mineMap = new boolean[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (Math.random() < p) {
//                    mineMap[i][j] = true;
//                }
//            }
//        }
//
//        // 2. 첫 번째 맵 그때그때 바로 출력 (* 및 -)
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (mineMap[i][j]) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("- ");
//                }
//            }
//            System.out.println(); // 한 행이 끝나면 줄바꿈
//        }
//
//        System.out.println(); // 두 맵 사이 구분용 줄바꿈
//
//        // 3. 주변 8방향 지뢰 개수를 계산하면서 그때그때 바로 출력
//        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
//        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (mineMap[i][j]) {
//                    System.out.print("* ");
//                } else {
//                    int count = 0;
//                    for (int k = 0; k < 8; k++) {
//                        int nx = i + dx[k];
//                        int ny = j + dy[k];
//
//                        if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
//                            if (mineMap[nx][ny]) {
//                                count++;
//                            }
//                        }
//                    }
//                    System.out.print(count + " ");
//                }
//            }
//            System.out.println(); // 한 행이 끝나면 줄바꿈
//        }
//    }
//}