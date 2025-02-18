import java.util.*;

public class mergeoverlapping {

    // /*   to submit leetcode in this problems  */
	// public int[][] merge(int[][] intervals) {
	// 	if (intervals.length <= 1)
	// 		return intervals;

	// 	// Sort by ascending starting point
	// 	Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

	// 	List<int[]> result = new ArrayList<>();
	// 	int[] newInterval = intervals[0];
	// 	result.add(newInterval);
	// 	for (int[] interval : intervals) {
	// 		if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
	// 			newInterval[1] = Math.max(newInterval[1], interval[1]);
	// 		else {                             // Disjoint intervals, add the new interval to the list
	// 			newInterval = interval;
	// 			result.add(newInterval);
	// 		}
	// 	}

	// 	return result.toArray(new int[result.size()][]);
	// }

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            //Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        // mergeoverlapping m =new mergeoverlapping();
        // int ans [] [] =m.merge(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }

}

