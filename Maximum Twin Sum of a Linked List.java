class Solution {
    public int pairSum(ListNode head) {
    int[] arr = new int[100000];
    int count = 0;
    while (head != null) {
        arr[count++] = head.val;
        head = head.next;
    }
    int ans = 0;
    for (int i = 0; i < count / 2; i++) {
        int twinSum = arr[i] + arr[count - 1 - i];
        if (twinSum > ans) {
            ans = twinSum;
        }
    }
    return ans;
    }
}