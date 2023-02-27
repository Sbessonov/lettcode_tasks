package service.k_weakest_rows;


import java.util.ArrayList;
import java.util.List;

public class KWeakestRows {

    public static class Pair {
        public int value;
        public int index;

        public Pair(int index, int value) {
            this.value = value;
            this.index = index;
        }
    }

    private void insertInSorted(List<Pair> arr, Pair el, Integer max_size) {
        int pos = 0;
        while (pos < arr.size()
                &&
                (el.value > arr.get(pos).value
                        || el.value == arr.get(pos).value && el.index > arr.get(pos).index)) {
            pos++;
        }

        if (pos == arr.size() && arr.size() < max_size) {
            arr.add(el);
        } else if (pos < arr.size()) {
            if(arr.size() < max_size){
                arr.add(new Pair(0,0));
            }
            for (int i = arr.size() - 1; i > pos; i--) {
                arr.set(i, arr.get(i - 1));
            }
            arr.set(pos, el);
        }
    }

    public List<Pair> kWeakestRows(int[][] mat, int k) {

        List<Pair> weakest = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            Pair pair = new Pair(i, 0);
            for (int j = 0; j < mat[0].length; j++) {
                pair.value += mat[i][j];
            }
            insertInSorted(weakest, pair, k);
        }

        return weakest;
    }

    public int[] resolve(int[][] mat, int k){
        List<Pair> resultList = kWeakestRows(mat,k);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i).index;
        }
        return result;
    }
}
