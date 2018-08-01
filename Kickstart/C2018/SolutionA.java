package C2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionA {

    // Graph Data Structure
    static class Graph{
        int v;                  // Number of Vertices
        LinkedList[] adjList;   // Adjacency List Array
        ArrayList<Boolean> isVisited;      // Tells if ith Node is visited or not

        // Constructor
        Graph(int v){
            this.v = v;
            adjList = new LinkedList[v];
            isVisited = new ArrayList<>();

            // Initialise adjacency list array for each vertex
            for(int i=0; i<v; i++){
                adjList[i] = new LinkedList<>();
                isVisited.add(false);
            }
        }
    }

    static void addNeighbour(Graph g, int src, int dest){
        g.adjList[src].add(dest);
        g.adjList[dest].add(src);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        int n, x, y;
        for(int i=0; i<t; ++i){
            n = in.nextInt();
            Graph g = new Graph(n);
            for(int j=0; j<n; j++){
                x = in.nextInt();
                y = in.nextInt();
                addNeighbour(g, x-1, y-1);
            }
            // this map will contain <vertex, degree> pairs.
            HashMap<Integer, Integer> map = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();
            for(int j=0; j<n; j++){
                int count = 0;
                for(int k=0; k<n; k++){
                    if(g.adjList[k].contains(j))
                        count++;
                }
                map.put(j, count);
                if(count == 1){
                    queue.add(j);
                }
            }
            while(!queue.isEmpty()){
                int node = queue.remove();
                g.isVisited.set(node, true);
                LinkedList<Integer> neighboursList = g.adjList[node];
                for(int j:neighboursList){
                    map.put(j, map.get(j)-1);
                    if(map.get(j) == 1){
                        queue.add(j);
                    }
                }
            }
            int startVertex = 0;
            int[] answer = new int[n];
            for(int j=0; j<n; j++){
                if(!g.isVisited.get(j)){
                    startVertex = j;
                    break;
                }
            }
            boolean[] visited = new boolean[n];
            for(int j=0; j<n; j++){
                if(!g.isVisited.get(j)){
                    answer[j] = 0;
                    visited[j] = true;
                }
                else{
                    answer[j] = Integer.MAX_VALUE;
                }
            }
            // BFS(g, startVertex)
            LinkedList<Integer> q = new LinkedList<>();

            visited[startVertex] = true;
            answer[startVertex] = 0;

            while(!q.isEmpty()){
                int s = q.poll();
                LinkedList<Integer> neighbours = g.adjList[s];
                for(int u:neighbours){
                    if(visited[u])
                        continue;
                    visited[u] = true;
                    answer[u] = answer[s] + 1;
                    q.push(u);
                }
            }
            for(int j=0; j<n; j++){
                System.out.print(answer[j] + " ");
            }
        }
    }

}
