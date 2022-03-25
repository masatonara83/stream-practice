package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
//		Integer[] nums = IntStream.of(1, 2, 3).boxed().toArray(s -> new Integer[s]);
//
//		/* IntStreamで要素を求める */
//		System.out.println("sum関数:" + IntStream.of(1, 2, 3).sum());
//
//		/* max関数はoptionalで返すためIntegerで返すならgetAsIntで返す */
//		System.out.println("max関数:" + IntStream.of(1, 2, 3).max().getAsInt());
//		System.out.println(Arrays.stream(nums).max((s1, s2) -> s1 - s2).get());
//		/* min関数 */
//		System.out.println("min関数:" + IntStream.of(1, 2, 3).min().getAsInt());
//		System.out.println(Arrays.stream(nums).min((s1, s2) -> s1 - s2).get());
//		/* 要素の個数を返す */
//		System.out.println("count関数:" + IntStream.of(1, 2, 3).count());
//		System.out.println(Arrays.stream(nums).count());
//		/* 平均を求める */
//		System.out.println("count関数:" + IntStream.of(1, 2, 3).average().getAsDouble());

		List<Food> foodList = new ArrayList<>();

		foodList.add(new Food("キャベツ", 90, "野菜"));
		foodList.add(new Food("トマト", 130, "野菜"));
		foodList.add(new Food("ブロッコリー", 200, "野菜"));
		foodList.add(new Food("リンゴ", 100, "フルーツ"));
		foodList.add(new Food("オレンジ", 150, "フルーツ"));
		foodList.add(new Food("ぶどう", 200, "フルーツ"));
		foodList.add(new Food("イチゴ", 500, "フルーツ"));
		foodList.add(new Food("チョコレート", 80, "お菓子"));
		foodList.add(new Food("アメ", 50, "お菓子"));
		foodList.add(new Food("ケーキ", 1000, "お菓子"));
		foodList.add(new Food("ポテトチップス", 150, "お菓子"));
		foodList.add(new Food("クッキー", 120, "お菓子"));

		/* 参照型から合計値を出す */
//		Integer result = foodList.stream().collect(Collectors.summingInt(Food::getPrice));
//		System.out.println(result);
//
//		/* streamないの要素をグループ別に集計 */
//		Map<String, Integer> result2 = foodList.stream()
//				.collect(Collectors.groupingBy(Food::getGroup, Collectors.summingInt(Food::getPrice)));
//		System.out.println(result2);
//
//		/* stream内の全ての要素から最大値を取得する */
//		Optional<Food> result3 = foodList.stream().collect(Collectors.maxBy(Comparator.comparing(Food::getPrice)));
//		result3.ifPresent(s -> System.out.println(s.getName() + ":" + s.getPrice() + ":" + s.getGroup()));

		/* ストリーム内の要素からグループ別に最大値を取得する */
//		Map<String, Optional<Food>> result4 = foodList.stream()
//				.collect(Collectors.groupingBy(Food::getGroup, Collectors.maxBy(Comparator.comparing(Food::getPrice))));
//		for (Optional<Food> map : result4.values()) {
//			map.ifPresent(s -> System.out.println(s.getName() + ":" + s.getPrice() + ":" + s.getGroup()));
//		}
//		result4.forEach((s, k) -> {
//			System.out.println(k.get().getName() + ":" + k.get().getPrice() + ":" + s);
//		});

		/* ストリーム内から最小値を取得 */
//		Optional<Food> result5 = foodList.stream().collect(Collectors.minBy(Comparator.comparing(Food::getPrice)));
//		result5.ifPresent(s -> System.out.println(s.getName() + ":" + s.getPrice()));
//
//		/* ストリーム内の要素からグループ別に最小値を取得する */
//		Map<String, Optional<Food>> result6 = foodList.stream()
//				.collect(Collectors.groupingBy(Food::getGroup, Collectors.minBy(Comparator.comparing(Food::getPrice))));
//		for (Optional<Food> food : result6.values()) {
//			food.ifPresent(s -> System.out.println(s.getName() + ":" + s.getPrice() + ":" + s.getGroup()));
//		}
//		
		/* ストリーム内の個数をカウント */
		Long result7 = foodList.stream().collect(Collectors.counting());
		System.out.println(result7);

		Map<String, Long> result8 = foodList.stream()
				.collect(Collectors.groupingBy(Food::getGroup, Collectors.counting()));
		for (Map.Entry<String, Long> map : result8.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}

		Double result9 = foodList.stream().collect(Collectors.averagingDouble(Food::getPrice));
		System.out.println(result9);

		Map<String, Double> result10 = foodList.stream()
				.collect(Collectors.groupingBy(Food::getGroup, Collectors.averagingDouble(Food::getPrice)));
		for (Map.Entry<String, Double> map : result10.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}
	}

}
