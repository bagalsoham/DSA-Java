public class FloorAndCeiling {

    public static int[] findFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int low = 0, high = n - 1;

        int floor = -1;
        int ceil = -1;

        // Find Floor
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                floor = nums[mid];
                break;
            } else if (nums[mid] < x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Reset pointers to find Ceil
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                ceil = nums[mid];
                break;
            } else if (nums[mid] > x) {
                ceil = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] result = findFloorAndCeil(nums, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);

        x = 8;
        result = findFloorAndCeil(nums, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }
}
