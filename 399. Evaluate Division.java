class Solution {
    public class Node {
        public String label;
        public List<Node> neighbors;
        public List<Double> wedges;
        public Node (String label) {
            this.label = label;
            this.neighbors = new ArrayList<>();
            this.wedges = new ArrayList<>();
        }

        public String toString() {
            return label;
        }

    }
    HashMap<String, Node> map = new HashMap<>();
    HashSet<String> visited = new HashSet<>();
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        double [] res = new double[queries.size()];
        int count = 0;
        for (List<String> equation: equations) {
            Node first;
            Node second;
            if (map.containsKey(equation.get(0)))
                first = map.get(equation.get(0));
            else { 
                first = new Node (equation.get(0));
                map.put(equation.get(0), first);
            }
            if (map.containsKey(equation.get(1)))
                second = map.get(equation.get(1));
            else { 
                second = new Node (equation.get(1));
                map.put(equation.get(1), second);
            }
            first.neighbors.add(second);
            second.neighbors.add(first);
            first.wedges.add(values[count]);
            second.wedges.add(1/values[count]);
            count++;
        }

        count = 0;

        System.out.println(map.get("b"));
        
        for (List<String> query: queries) {
            visited.clear();
            if (!map.containsKey(query.get(0)) || !map.containsKey(query.get(1)) ) {
                    res[count++] = -1;
            } else if (query.get(0).equalsIgnoreCase(query.get(1))) {
                    res[count++] = 1;
            } else {
                res[count++] = dfs(query.get(0), query.get(1), 1);
            }
        }
        return res;
    }

    public double dfs(String source, String dest, double multiply) {
        if (visited.contains(source))
            return -1;

        Node current = map.get(source);
        visited.add(source);
        for (int i=0; i<current.neighbors.size(); i++) {
            if (!dest.equalsIgnoreCase(current.neighbors.get(i).label)) {
                double result = dfs(current.neighbors.get(i).label, dest, current.wedges.get(i) * multiply);
                if (result != -1)
                    return result;
            } else {
                return multiply * current.wedges.get(i);
            }
        }
        return -1;
    }
}