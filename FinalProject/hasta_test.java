import java.util.*;

class hasta_test {
    private static Map<String, List<String>> hm = new HashMap<String, List<String>>();

    public static void addHash(String id, String tipo, String cat){
        List<String> atrib = new ArrayList<String>();
        atrib.add(tipo);
        atrib.add(cat);
        hm.put(id,atrib);
        System.out.println("Last ID added: "+id);
    }

    public static void printHash(){
        System.out.printf("%10s %10s %15s", "ID", "TIPO", "Categoria");
        System.out.println();
        for (Map.Entry<String, List<String>> entry : hm.entrySet()){
            //System.out.println("ID: "+entry.getKey()+" TIPO: "+(entry.getValue()).get(0)+" CATEGORIA: "+(entry.getValue()).get(1));
            System.out.format("%10s %10s %15s",
                entry.getKey(), (entry.getValue()).get(0), (entry.getValue()).get(1));
            System.out.println();
        }
    }

    }
}