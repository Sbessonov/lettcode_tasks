package service;

//TODO: excellent time, good memory usage
public class MedianOfTwoSortedArrays {

    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            result[k++] = nums1[i] < nums2[j]
                    ? nums1[i++]
                    : nums2[j++];

        }
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        return result;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = mergeArrays(nums1, nums2);

        return result.length % 2 == 0
                ? (double) (result[result.length / 2 - 1] + result[result.length / 2]) / 2
                : (double) result[result.length / 2];
    }
}
