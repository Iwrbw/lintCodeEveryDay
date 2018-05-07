import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author yangshunfan 2018/5/7 16:50
 * 给出出现频率最高的k个单词
 */
public class Test471 {

    public static void main(String[] args) {
        String[] strings = {"yes", "lint", "code",
                "yes", "code", "baby",
                "you", "baby", "chrome",
                "safari", "lint", "code",
                "body", "lint", "code"};
        int k = 3;
        String[] result = topKFrequentWords(strings, k);
        for (String s : result) {
            System.out.println(s + " ");
        }
    }
    /**
     * @param words: an array of string
     * @param k: An integer
     * @return: 字符串数组
     */
    public static String[] topKFrequentWords(String[] words, int k) {
        // write your code here
        //用map来储存数据
        HashMap<String, Integer> map = new HashMap<>(0);
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        //set用来去重，以后更好遍历
        Set<Integer> set = new TreeSet<>();
        for (Entry<String, Integer> e : map.entrySet()) {
            set.add(e.getValue());
        }

        //数组按顺序记录，之后用于遍历
        int[] value = new int[set.size()];
        int i = 0;

        for (Integer m : set) {
            value[i++] = m;
        }

        List<String> list = new ArrayList<>(k);

        for (int j = value.length - 1; j >= 0 ; j--) {
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == value[j] && list.size() < k) {
                    list.add(entry.getKey());
                }
            }
        }

        String[] result = new String[list.size()];
        int n = 0;
        for (String s : list) {
            result[n++] = s;
        }

        return result;
    }
}
