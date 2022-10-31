package com.org.demo.graph.representation;

import java.util.*;

public class GraphDemoUsingAdjList {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> adjList=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes :");
        int n=sc.nextInt();
        System.out.println("Enter number of edges :");
        int m=sc.nextInt();
        for(int i=0; i<m; i++) {
            System.out.println("Enter " + i + " th entry");
            int u=sc.nextInt();
            int v=sc.nextInt();

            if(!adjList.containsKey(u)) {
                List<Integer> list=new ArrayList<>();
                list.add(v);
                adjList.put(u,list);
            } else {
                List<Integer> listFromMap=adjList.get(u);
                listFromMap.add(v);
                adjList.put(u,listFromMap);
            }

            if(!adjList.containsKey(v)) {
                List<Integer> list=new ArrayList<>();
                list.add(u);
                adjList.put(v,list);
            } else {
                List<Integer> listFromMap=adjList.get(v);
                listFromMap.add(u);
                adjList.put(v,listFromMap);
            }
        }

        System.out.println("Printing Adj List");
        for(Map.Entry<Integer,List<Integer>> entry : adjList.entrySet()) {
            System.out.println(entry.getKey()+" ->"+entry.getValue());
        }
    }
}
