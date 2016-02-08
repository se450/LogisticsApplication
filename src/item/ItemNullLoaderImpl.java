package item;

import java.util.HashMap;
import java.util.Map;

/**
 * ItemNullLoaderImpl.java
 * LogisticsApplication
 */
public class ItemNullLoaderImpl implements ItemLoader {
    @Override
    public Map<String, Item> loadItems(String source) {
        System.out.println("******** Inside ItemNullLoaderImpl loadItems() method! ********");
        return new HashMap<String, Item>();
    }
}
