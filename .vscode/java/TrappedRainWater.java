//Trapped Rain Water
import java.util.*;//O(n)

public class TrappedRainWater {
    public static int trapped_Rain_Water(int height[]) {
        int n = height.length;
        //Calculate left Max boundary --in array form
        int leftMax[] = new int[n];
        leftMax[0] = height[0];//LeftMax of Zero is equal to the Height Zero becase there is no pillar in his left
        for (int i=1; i<n ; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Calculate Right Max boundary --in array form
        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];//for the last pillar his own hight is equal to rightMax
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedWater=0;
        //Loop
        for(int i=0; i<n; i++) {
             //WaterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

              //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
      
        }

        public static void main(String args[]) {
            int height[] = {4, 2, 0, 6, 3, 2, 5};
            System.out.println(trapped_Rain_Water(height));
        }
    
}
