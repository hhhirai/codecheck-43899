package codecheck;




public class App {
	public static void main(String[] args) {

		int card_num = Integer.parseInt(args[0]);
		int mp = Integer.parseInt(args[1]);
		int[] ws;  //コスト
		int[] ps;  //攻撃
		int j = 0;

		for (int i = 2, l = args.length; i < l; i+=2) {
			int point = Integer.parseInt(args[i]);
			int cost = Integer.parseInt(args[i+1]);

			ws[j] = cost;
			ps[j] = point;

			j++;
		}

		int maxw = mp;  //コスト制限
		int[][] dp = new int[ws.length + 1][maxw + 1];
		int ret = 0;

		for (int i = 0; i < ws.length; i++) {
		    for (int ｋ = 0; ｋ <= maxw; ｋ++) {
		        if (ws[i] <= ｋ) {
		            dp[i + 1][ｋ] = Math.max(dp[i][ｋ], dp[i][ｋ - ws[i]] + ps[i]);
		            ret = Math.max(ret, dp[i + 1][ｋ]);
		        } else {
		            dp[i + 1][ｋ] = dp[i][ｋ];
		        }
		    }
		}

		System.out.println(ret);

	}

}
