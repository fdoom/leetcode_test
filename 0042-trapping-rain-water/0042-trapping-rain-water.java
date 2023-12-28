class Solution {
    public int trap(int[] height) {
        int answer = 0;
        Pointer.height = height;
        Pointer left = new Pointer(0);
        Pointer right = new Pointer(height.length - 1);

        while(left.index < right.index) {
            left.maxCheck();
            right.maxCheck();

            if(left.max <= right.max) {
                answer += left.max - left.value();
                left.moveToRight();
            }
            else {
                answer += right.max - right.value();
                right.moveToLeft();
            }
        }
        return answer;
    }
}

class Pointer {
    static int[] height;
    int index;
    int max;

    Pointer(int index) {
        this.index = index;
    }

    void maxCheck() {
        max = Math.max(height[index], max);
    }

    void moveToRight() {
        index++;
    }

    void moveToLeft() {
        index--;
    }

    int value() {
        return height[index];
    }
}