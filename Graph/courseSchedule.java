class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>(numCourses);

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] prerequisite : prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i <numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        int nodesVisited = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            nodesVisited++;

            for(int neighbor : adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        return nodesVisited == numCourses;
    }
}

// TC: O(m + n)
// SC: O(m + n)