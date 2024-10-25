class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] prerequisite : prerequisites){
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            graph.get(prerequisiteCourse).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }

        int[] order = new int[numCourses];
        int index = 0;
        while(!queue.isEmpty()){
            int course = queue.poll();
            order[index++] = course;

            for(int neighbor :graph.get(course)){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        if(index == numCourses){
            return order;
        } else {
            return new int[0];
        }
    }
}

// TC: O(V + E) where v is number of courses and E is number of prerequisite courses
// SC: O(V + E)