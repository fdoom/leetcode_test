class Solution {
    public int trap(int[] height) {
        int answer = 0;
        Pointer left = new Pointer(height, 0);
        Pointer right = new Pointer(height, height.length - 1);

        while(left.index < right.index) {
            left.maxCheck();
            right.maxCheck();

            if(left.max <= right.max) {
                answer += left.max - left.value();
                left.move(1);
            }
            else {
                answer += right.max - right.value();
                right.move(-1);
            }
        }
        return answer;
    }
}

class Pointer {
    int[] height;
    int index;
    int max;

    Pointer(int[] height, int index) {
        this.height = height;
        this.index = index;
        max = height[index];
    }

    void maxCheck() {
        max = Math.max(height[index], max);
    }

    void move(int n) {
        index += n;
    }

    int value() {
        return height[index];
    }
}