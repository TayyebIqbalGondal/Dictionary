
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> translator;

    public Dictionary() {
        this.translator = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (translator.containsKey(word)) {
            return translator.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        translator.put(word, translation);

    }

    public int amountOfWords() {
        return translator.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList=new ArrayList<String>();
        for(String key:this.translator.keySet()){
        String value=translator.get(key);
        
         String toAddToTranslationList = key + " = " + value;
            translationList.add(toAddToTranslationList);
        }
        return translationList;
        }
    }


