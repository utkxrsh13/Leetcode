class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0.0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    double area = triangle(points[i],points[j],points[k]);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    private double triangle(int[]a, int[]b, int[]c){
        return 0.5*Math.abs(
            (b[0]-a[0])*(c[1]-a[1]) -
            (b[1]-a[1])*(c[0]-a[0])
        );
    }
}