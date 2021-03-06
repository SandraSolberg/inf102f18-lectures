package week41;

import week40.AdjListGraph;
import week40.IGraph;
import week42.AdjListEdgeWeightedGraph;
import week42.Edge;
import week42.EdgeWeightedGraph;

import java.io.*;

/**
 * @author Torstein Strømme
 */
public class GraphReader {


    public static IGraph readGraph(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        int n = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());

        IGraph graph = new AdjListGraph(n);
        for (int i = 0; i < m; i++) {
            String[] edj = br.readLine().split("\\s+");
            graph.addEdge(Integer.parseInt(edj[0]), Integer.parseInt(edj[1]));
        }
        return graph;
    }

    public static IDigraph readDigraph(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        int n = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());

        IDigraph graph = new AdjListDigraph(n);
        for (int i = 0; i < m; i++) {
            String[] edj = br.readLine().trim().split("\\s+");
            graph.addEdge(Integer.parseInt(edj[0]), Integer.parseInt(edj[1]));
        }
        return graph;
    }

    public static EdgeWeightedGraph readEWGraph(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        int n = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());

        EdgeWeightedGraph graph = new AdjListEdgeWeightedGraph(n);
        for (int i = 0; i < m; i++) {
            String[] edj = br.readLine().split("\\s+");
            graph.addEdge(new Edge(Integer.parseInt(edj[0]), Integer.parseInt(edj[1]), Double.parseDouble(edj[2])));
        }
        return graph;
    }
}
