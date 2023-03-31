package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   return method(nodes, p);
      // other implementation
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   return method(edgeList, p);
      // other implementation
   }

   // TODO: Your answer
   <T extends Component> T method(List<T> list, String p) {
	   for (Component element : list) {
			if (element.contains(p))
				System.out.println(element);
		}
	   return null;
   }
}

class Node extends Component{

}

class Edge extends Component{
   
}

class Component {
	String name;

	   public boolean contains(String p) {
	       return name.contains(p);
	   }
}