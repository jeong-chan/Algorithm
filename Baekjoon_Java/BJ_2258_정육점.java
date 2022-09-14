public class Main {


	static class Meat implements Comparable<Meat>{
		int weight,price;

		public Meat(int weight, int price) {
			super();
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Meat o) {
			if(this.price == o.price)
				return o.weight-this.weight;
			return this.price-o.price;
		}

	}
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Meat[] meats = new Meat[N];
		for(int i=0; i<N;i++) {
			st= new StringTokenizer(br.readLine(), " ");
			int w = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			meats[i] = new Meat(w,p);
		}

		Arrays.sort(meats);

		int sum=0;
		int sum2=0;
		int result = Integer.MAX_VALUE;
		boolean check = false;
		for(int i=0; i<N; i++) {
			//고기의 무게 누적 합
			sum += meats[i].weight;
			
			//만약 내가 산 고기가 이전 고기랑 가격이 같으면 중복되는 가격에 대해서 지불해야하기 때문에 추가 지불할 가격을 구함
			if(i>=1 && meats[i].price == meats[i-1].price) {
				sum2 += meats[i].price;
			}
			//가격이 다르다는 것은 더 비싼 고기를 샀다는 것이고, 이전에 골랐던 것은 덤으로 받을 수 있기 때문에 추가 지불할 가격은 0으로 초기화
			else {
				sum2=0;
			}
			//고기 가격이 기준을 넘었으면
			if(sum>=M) {
				//마지막 조건에 걸려서 나온 것인지 체크
				check = true;
				//고기 가격이 기준을 넘긴 시점부터 동일한 가격의 고기를 여러개 샀을 때, 더 비싼 고기를 사고 덤으로 받았을 때와 같은 경우가 생기므로
				//최소값을 갱신
				result = Math.min(result,meats[i].price+sum2);
			}
			
		}
		
		//반복이 끝나고 check에 걸려서 나온 경우
		if(check) {
			//결과값 출력
		System.out.println(result);
		
		//반복이 다 끝날 때까지 못구한 경우
		}else {
			
			//-1출력
			System.out.println(-1);
		}
	}


}
