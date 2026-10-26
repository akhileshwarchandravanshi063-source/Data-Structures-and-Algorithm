package Graph;

import java.util.*;

public class Clone_Graph {

    class Node {
        int val;
        List<Node> neighbors = new ArrayList<>();

        Node(int val) {
            this.val = val;
        }
    }

    // Approach-1 (DFS) Using array as map
    class Solution1 {

        void DFS(Node node, Node clone_node, Node[] visited) {
            visited[node.val] = clone_node;

            for (Node x : node.neighbors) {
                if (visited[x.val] == null) {
                    Node clone = new Node(x.val);
                    clone_node.neighbors.add(clone);
                    DFS(x, clone, visited);
                } else {
                    clone_node.neighbors.add(visited[x.val]);
                }
            }
        }

        public Node cloneGraph(Node node) {
            if (node == null)
                return null;

            // cloned the given node
            Node clone_node = new Node(node.val);

            // Now, clone its neighbours and recursively their neighbours.
            // But if a node reappears, we need to access that cloned node,
            // so store them in an array to access.
            Node[] visited = new Node[101]; // Using constraints given (all null by default)
            // We could use a map also if constraints are not clear (i.e. HashMap<Node,
            // Node>)
            visited[node.val] = clone_node;

            DFS(node, clone_node, visited);

            return clone_node;
        }
    }

    // Approach-2 DFS (Using HashMap)
    class Solution2 {

        Map<Node, Node> mp = new HashMap<>();

        void DFS(Node node, Node clone_node) {

            for (Node n : node.neighbors) {

                if (!mp.containsKey(n)) {

                    Node clone = new Node(n.val);
                    mp.put(n, clone);
                    clone_node.neighbors.add(clone);

                    DFS(n, clone);

                } else {

                    clone_node.neighbors.add(mp.get(n));

                }

            }

        }

        public Node cloneGraph(Node node) {
            if (node == null)
                return null;

            mp.clear();

            // cloned the given node
            Node clone_node = new Node(node.val);

            // Now, clone its neighbours and recursively their neighbours.
            // But if a node reappears, we need to access that cloned node,
            // so store them in a map <Node, Node>
            mp.put(node, clone_node);

            DFS(node, clone_node);

            return clone_node;
        }
    }

    // Approach-3 (BFS) - Using array as map
    class Solution3 {

        void BFS(Queue<Node> que, Node[] visited) {
            while (!que.isEmpty()) {
                Node node = que.poll();

                // go for neighbors. Note that we are filling neighbors of "node".
                // If we find a neighbor, we need to add its clone to the corresponding
                // cloned node's neighbors only (i.e. inside visited[node.val].neighbors).
                for (Node x : node.neighbors) {
                    if (visited[x.val] == null) {
                        Node clone = new Node(x.val);
                        visited[node.val].neighbors.add(clone);
                        // i.e. adding cloned neighbors to cloned node
                        // adding this new node to visited as well for future access
                        visited[x.val] = clone;
                        que.add(x);
                    } else {
                        visited[node.val].neighbors.add(visited[x.val]);
                        // i.e. adding cloned neighbors to cloned node
                    }
                }
            }
        }

        public Node cloneGraph(Node node) {
            if (node == null)
                return null;

            Node clone_node = new Node(node.val);

            // similar to what we did above in DFS
            Node[] visited = new Node[101];
            visited[node.val] = clone_node;

            Queue<Node> que = new LinkedList<>();
            que.add(node);

            BFS(que, visited);

            return clone_node;
        }
    }

    // Approach-4 BFS (Using HashMap)
    class Solution4 {

        Map<Node, Node> mp = new HashMap<>();

        void DFS(Node node, Node clone_node) {

            for (Node n : node.neighbors) {

                if (!mp.containsKey(n)) {

                    Node clone = new Node(n.val);
                    mp.put(n, clone);
                    clone_node.neighbors.add(clone);

                    DFS(n, clone);

                } else {

                    clone_node.neighbors.add(mp.get(n));

                }

            }

        }

        void BFS(Queue<Node> que) {

            while (!que.isEmpty()) {

                Node node = que.poll();
                Node clone_node = mp.get(node);

                for (Node n : node.neighbors) {

                    if (!mp.containsKey(n)) {

                        Node clone = new Node(n.val);
                        mp.put(n, clone);
                        clone_node.neighbors.add(clone);

                        // DFS(n, clone);
                        que.add(n);

                    } else {

                        clone_node.neighbors.add(mp.get(n));

                    }

                }

            }

        }

        public Node cloneGraph(Node node) {
            if (node == null)
                return null;

            mp.clear();

            // cloned the given node
            Node clone_node = new Node(node.val);

            // Now, clone its neighbours and recursively their neighbours.
            // But if a node reappears, we need to access that cloned node,
            // so store them in a map <Node, Node>
            mp.put(node, clone_node);

            Queue<Node> que = new LinkedList<>();
            que.add(node);
            BFS(que);

            return clone_node;
        }
    }

}