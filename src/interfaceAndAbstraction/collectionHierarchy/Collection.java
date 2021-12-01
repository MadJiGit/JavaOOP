package interfaceAndAbstraction.collectionHierarchy;

import java.util.List;

public abstract class Collection {

    protected int maxSize;
    protected List<String> items;

    protected Collection() {
        this.maxSize = 100;
    }

}
