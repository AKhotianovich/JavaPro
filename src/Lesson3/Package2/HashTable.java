package Lesson3.Package2;

public class HashTable {
    String key = "";
    String Value = "";

    Boolean put (String key, String value){
        if(this.key.equals(key)){
            this.Value = value;
            return false;
        }else {
            this.key = key;
            this.Value = value;
            return true;
        }
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key='" + this.key + '\'' +
                ", Value='" + this.Value + '\'' +
                '}';
    }

    public boolean remove(String key){
        if (this.key.equals(key)){
            this.key = "";
            this.Value = "";
            return true;
        }else {
            return false;
        }

    }
}

class Main{
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        System.out.println(hashTable.put("key", "value"));
        System.out.println(hashTable.remove("key"));
        System.out.println(hashTable.toString());
    }
}
