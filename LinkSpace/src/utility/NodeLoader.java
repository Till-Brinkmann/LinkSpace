package utility;

import java.lang.reflect.InvocationTargetException;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import node.NodeFactory;
import node.model.base.NodeModel;
import node.view.base.NodeView;

public class NodeLoader {
  public static ArrayList<NodeFactory> nodeList;
  
  public static void appendNodeList(String path) {
    //TODO implement 
  }
  public static ArrayList<Tuple2<NodeModel, NodeView>> loadNodeList(String path){
    
  
  }
  
  
  public static void addToNodeList(JarFile file) {
    
    for(Enumeration<JarEntry> entries = file.entries();entries.hasMoreElements();){
      JarEntry entry = entries.nextElement();
      String entryName = entry.getName();
      if(entryName.contains("node")) {
        Class<?> view = entry.getClass();
        if(checkForInterface(view, NodeFactory.class)) {
          try {
            nodeList.add((NodeFactory)view.getConstructor().newInstance());
          } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
              | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            //TODO log
            e.printStackTrace();
          }
        }
      }
    }
  }
  
  private static boolean checkForInterface(Class<?> c, Class<?> interf) {
    for(Class<?> cInterface : interf.getInterfaces()) {
      if(cInterface.equals(interf)) {
          return true;
      }
    }
    return false;
  }
}
